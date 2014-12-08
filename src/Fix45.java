import java.util.ArrayList;

/*
 * Created by MAXIMILLION on 12/7/14.
*/

public class Fix45 {

//    CodingBat code practice
//    Java > Array-3 > fix45
//            (This is a slightly harder version of the fix34 problem.)
//    Return an array that contains exactly the same numbers as the given array,
//    but rearranged so that every 4 is immediately followed by a 5.
//    Do not move the 4's, but every other number may move.
//    The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
//    In this version, 5's may appear anywhere in the original array.
//    fix45({5, 4, 9, 4, 9, 5}) → {9, 4, 5, 4, 5, 9}
//    fix45({1, 4, 1, 5}) → {1, 4, 5, 1}
//    fix45({1, 4, 1, 5, 5, 4, 1}) → {1, 4, 5, 1, 1, 4, 5}

    public int[] fix45(int[] nums) {
        ArrayList<Integer> list = arrayToArrayList(nums);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 4 && list.get(i+1) != 5) {
                int pos = findFivePosition(list);
                swap(list, i + 1, pos);
            }
        }
        return arrayListToArray(list);
    }

    private int findFivePosition(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 5 && previousNotFour(nums, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean previousNotFour(ArrayList<Integer> nums, int i) {
        return (i == 0 || nums.get(i-1) != 4);
    }

    private void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    // Converts an array to an ArrayList.
    public ArrayList<Integer> arrayToArrayList(int[] list) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int x : list) {
            newList.add(x);
        }
        return newList;
    }

    // Converts an ArrayList to an array.
    public int[] arrayListToArray(ArrayList<Integer> list) {
        int[] newList = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newList[i] = list.get(i);
        }
        return newList;
    }

    public static void main(String[] args) {
        Fix45 m = new Fix45();
        m.fix45(new int[]{1, 5, 3, 4, 6});
    }
}

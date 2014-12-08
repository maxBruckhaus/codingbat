import java.util.ArrayList;

public class Fix34 {
    public int[] fix34(int[] nums) {
        ArrayList<Integer> list = arrayToArrayList(nums);
        int lastPos = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3) {
                int pos = findFourPosition(list, lastPos);
                swap(list, i + 1, pos);
                lastPos = pos;
            }
        }
        return arrayListToArray(list);
    }

    private int findFourPosition(ArrayList<Integer> nums, int start) {
        for (int i = start + 1; i < nums.size(); i++) {
            if (nums.get(i) == 4) {
                return i;
            }
        }
        return -1;
    }

    private void swap(ArrayList<Integer> list, int i, int pos) {
        int temp = list.get(i);
        list.set(i, list.get(pos));
        list.set(pos, temp);
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
        Fix34 m = new Fix34();
        m.fix34(new int[]{1, 3, 1, 4});
    }
}

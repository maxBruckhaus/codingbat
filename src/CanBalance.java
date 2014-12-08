import java.util.ArrayList;

/**
 * Created by MAXIMILLION on 12/7/14.
 */

public class CanBalance {

//    CodingBat code practice
//    Java > Array-3 > canBalance
//
//    Given a non-empty array, return true if there is a place to split the array so that the
//    sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
//    canBalance({1, 1, 1, 2, 1}) → true
//    canBalance({2, 1, 1, 2, 1}) → false
//    canBalance({10, 10}) → true


    public boolean canBalance(int[] nums) {
        ArrayList<Integer> list = arrayToArrayList(nums);
        for (int i = 0; i < list.size(); i++) {
            if (leftSum(list, i) == rightSum(list, i)) {
                return true;
            }
        }
        return false;
    }

    public int leftSum(ArrayList list, int splitPosition) {
        int leftSum = 0;
        for (int i = 0; i <= splitPosition; i++){
            leftSum += (Integer)list.get(i);
        }
        return leftSum;
    }

    public int rightSum(ArrayList list, int splitPosition) {
        int rightSum = 0;
        for (int i = splitPosition + 1; i < list.size(); i++){
            rightSum += (Integer)list.get(i);
        }
        return rightSum;
    }

    // Converts an array to an ArrayList.
    public ArrayList arrayToArrayList(int[] list) {
        ArrayList newList = new ArrayList();
        for (int x : list)
            newList.add(x);
        return newList;
    }

    // Converts an ArrayList to an array.
    public int[] arrayListToArray(ArrayList list) {
        int[] newList = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            newList[i] = (Integer) list.get(i);
        return newList;
    }

    public static void main (String[] args){
        CanBalance balance = new CanBalance();
        balance.canBalance(new int[] {1, 2, 3, 4, 5});
    }
}

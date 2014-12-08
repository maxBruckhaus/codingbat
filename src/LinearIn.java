import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by MAXIMILLION on 12/7/14.
 */
public class LinearIn {

//    CodingBat code practice
//    Java > Array-3 > linearIn
//
//    Given two arrays of ints sorted in increasing order, outer and inner,
//    return true if all of the numbers in inner appear in outer.
//    The best solution makes only a single "linear" pass of both arrays,
//    taking advantage of the fact that both arrays are already in sorted order.
//
//    linearIn({1, 2, 4, 6}, {2, 4}) → true
//    linearIn({1, 2, 4, 6}, {2, 3, 4}) → false
//    linearIn({1, 2, 4, 4, 6}, {2, 4}) → true


    public boolean linearIn(int[] outer, int[] inner) {
        ArrayList outerList = arrayToArrayList(outer);
        ArrayList innerList = arrayToArrayList(inner);
        Iterator out = outerList.iterator();
        Iterator in = innerList.iterator();

        int o = (Integer) out.next();

        while (in.hasNext()) {
            int i = (Integer) in.next();
            while (out.hasNext() && o < i) {
                o = (Integer) out.next();
            }
            if (o > i) {
                return false;
            } else if (o == i) {
                continue;
            } else if (!out.hasNext()) {
                return false;
            } else {
                return false;
            }
        }
        return true;
    }

    // Converts an array to an ArrayList.
    public ArrayList<Integer> arrayToArrayList(int[] list) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int x : list) {
            newList.add(x);
        }
        return newList;
    }

    public static void main(String[] args) {
        LinearIn linear = new LinearIn();
        linear.linearIn((new int[]{1, 1, 1, 1}), (new int[]{1, 1, 1}));
    }
}
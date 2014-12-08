import java.util.ArrayList;

/**
 * Created by MAXIMILLION on 12/7/14.
 */
public class SquareUp {

//    Java > Array-3 > squareUp
//
//    Given n>=0, create an array length n*n with the following pattern,
//    shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
//
//    squareUp(3) → {0, 0, 1, 0, 2, 1, 3, 2, 1}
//    squareUp(2) → {0, 1, 2, 1}
//    squareUp(4) → {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}


    public int[] squareUp(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int value = 0;
        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                if (n - row - col > 1){
                    value = 0;
                }else{
                    value = n - col;
                }
                result.add(value);
            }
        }
        return arrayListToArray(result);
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
        SquareUp square = new SquareUp();
        square.squareUp(5);
    }
}

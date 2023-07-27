import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spIntegers(int [][] matrix)

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        List<Integer> l = sprialMatrix(matrix);

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }

    }

}

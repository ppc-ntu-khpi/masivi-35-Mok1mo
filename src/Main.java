import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        int x=10;
        int sum=0;

        for(int[] row:matrix)
            Arrays.fill(row,x);

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                sum+=matrix[i][j];
            }
        }

        for(int[] row:matrix)
            System.out.println(Arrays.toString(row));
        System.out.println("Сумма = " + sum);
    }
}
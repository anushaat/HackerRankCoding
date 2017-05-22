import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int dg1=0, dg2=0;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] intArray = new int[N][N];
        for(int i = 0, j = N - 1; i < N; ++i, j --)
            {
                intArray[i][i] = scan.nextInt();
                dg1 += intArray[i][i];
                dg2 += intArray[i][j];
                System.out.println(dg1);
                System.out.println(dg2);
            }
        System.out.println("output:");
        System.out.println(Math.abs(dg1 - dg2));
        
        
    }
}
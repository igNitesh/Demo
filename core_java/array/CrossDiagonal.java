package core_java.array;
import java.util.Scanner;

/**
 * Prints the diagonal elements of a matrix.
 * Displays primary diagonal (where i == j) and secondary diagonal (where i + j == n-1).
 */
public class CrossDiagonal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read matrix dimensions
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        // Initialize matrix
        int nums[][] = new int[m][n];
 
        // Read matrix elements
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        // Print diagonal elements
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // Check if element is on primary or secondary diagonal
                if(i == j || i + j == n - 1){
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}

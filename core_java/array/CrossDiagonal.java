package core_java.array;
import java.util.Scanner;

public class CrossDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int nums[][] = new int[m][n];
 
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if( i == j || i+j == n-1){
                    System.out.print(nums[i][j] + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}

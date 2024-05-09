import java.util.Scanner;
import core_java.array.leetcode.LC1929;


public class Main {
    public static void main(String[] args) {

        LC1929 ob = new LC1929();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] =  new int[n];

        for(int i=0; i<n; i++){
            nums[i] =  sc.nextInt();
        }

        int ans[] = ob.getConcatenation(nums);

        for (int i : ans) {
            System.out.print(i + " ");
        }
        
        sc.close();


    }
}

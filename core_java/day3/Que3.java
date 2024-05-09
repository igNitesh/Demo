package core_java.day3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        
        int num0 = 0;
        int num1 = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                num0++;
            }
            else if (nums[i] == 1){
                num1++;
            }
        }
        int num2 = nums.length - (num0 + num1);
        System.out.println(nums.length);
        int x = 0;
        int a[] = new int[nums.length];
        while (num2 != 0  ) {
            a[x] = 2;
            x++;
            num2--;
        }
        while ( num0 != 0){
            a[x] = 0;
            x++;
            num0--;
        }
        while (num1 != 0) {
            a[x] = 1;
            x++;
            num1--;
        }
        
    
        for(int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

package core_java.basic;

class Fibonacci {
    public static int  fs ( int a, int b , int n){
            if( n <=  0){

                return 0;
            }
            System.out.println(a+b);

            return fs(b,a+b,n-1);
    }
    
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        

        System.out.println(a + "\n" + b);
        fs(a,b,n-2);
    }
}
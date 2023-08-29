// https://my.newtonschool.co/playground/code/loi2zqewvo3d

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BobsPrimeArray {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        } 

        for(int i=2;i*i<=n;i++){

            if(n%i==0) return false;

        }
        return true;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        // int[]

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){

            if(isPrime(i+1) && isPrime(arr[i])){
                System.out.print(arr[i]+" ");
            }

        }




    }
}

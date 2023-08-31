// https://my.newtonschool.co/playground/code/s4i9ch26wgg3

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GirlfriendWish {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int deletion =0;

        for(int i=0;i<n-1;i++){
            
            if((i-deletion)%2==0 && arr[i]==arr[i+1]){
                deletion++;
            }

        }

        if((n-deletion)%2==1){
            deletion++;
        }

        System.out.println(deletion);

    }
}

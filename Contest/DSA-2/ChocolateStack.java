//https://my.newtonschool.co/playground/code/2crj6qju77mh

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ChocolateStack {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];        

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }


    //    for(int i=n-1;i>=0;i--){
    //        if(arr[i]==0)continue;
           
        //    System.out.print("[5,5]");
    //    }

        Stack<Integer> st = new Stack<>();

        for(int i =0;i<n;i++){
            if(arr[i]==0){
                if(!st.empty()){
                    System.out.print(st.pop()+" ");
                }
            } else{
                st.push(arr[i]);
            }
        }



    }
}

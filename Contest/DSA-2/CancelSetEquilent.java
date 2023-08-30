//https://my.newtonschool.co/playground/code/3r054qb95hn0

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CancelSetEquilent {
    public static int countSetBits(int n){

        int count =0;

        while(n>0){
            count += n & 1 ;
            n = n>>1;
        }
    return count;

}
    
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        // System.out.println(5 & 1);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
// System.out.println(st);
        for(int i=0;i<n;i++){
            
         int current = sc.nextInt();
        // System.out.println(st);
        if(st.empty()){
            st.push(current);
        } else{

            while(!st.empty() && countSetBits(st.peek())==countSetBits(current)){
                
                st.pop();
            }

            st.push(current);
        }


        }

        System.out.println(st.size());

    }
}

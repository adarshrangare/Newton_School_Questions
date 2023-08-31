import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/07lzwvkaolqr
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    
        Stack<Integer>st = new Stack<>();
        int deletionLeft = n-k;
        
        for(int i=0;i<n;i++){
           
            while(!st.empty() && st.peek() > arr[i] && deletionLeft > 0 ){
                st.pop();
                deletionLeft--;
            }
            st.push(arr[i]);
           

            
        }

         while(deletionLeft>0 && !st.empty()){
                st.pop();
                deletionLeft--;
                }

        for(int i : st){
            System.out.print(i+" ");
        }
    }
}

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/62diz2n7otfl
// don't change the name of this class
// you can add inner classes if needed
class Jumpy {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        // Stack<Integer> st = new Stack<>();

        // for(int i=0;i<n;i++){

        //     while(!st.emtpy() && st.peek()>current){
                                
        //     }


        // }



        

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int xor =arr[0];
        int current = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>current){
                xor = xor^arr[i];
                current = arr[i];
            } 
        }

        System.out.println(xor);

    }
}

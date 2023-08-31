import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/3dl5h1e8q00t
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int max = -1;
        for(int i=0;i<n;i++){

            while(!st.empty() && st.peek() <= arr[i]){
                
                int m = arr[i] - st.peek();
                max = Math.max(m,max);
                st.pop();
            }

            st.push(arr[i]);
            
        }

        System.out.println(max);


    //     int [] leftDiff = new int[n];

    //    leftDiff[0] = arr[0];

    //     for(int i=1;i<n;i++){

    //        leftDiff[i] = arr[i] - arr[i-1];

    //     }

    //     int max = 0;

    //     for(int i=0;i<n;i++){
    //         max = Math.max(max,leftDiff[i]);
    //     }
    //     if(max>1)
    //     System.out.println(max);
    //     else
    //     System.out.println(-1);
    }
}


// 7 10 7 2 1 8
// 7 3 -3 -5 -1 7

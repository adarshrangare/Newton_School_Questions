import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NearestSmallElement {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
           
           arr[i] = sc.nextInt();


        }

        for(int i=0;i<n;i++){
            int temp = arr[i];
            while(!(st.empty()) && st.peek() > arr[i]){
                
                st.pop();

            }

            if(st.empty()){
                arr[i] = -1;
            } else{

                arr[i] = st.peek();
            }

            st.push(temp);

        }

        
        // System.out.println(st);
        // System.out.println(Arrays.toString(arr));

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
}

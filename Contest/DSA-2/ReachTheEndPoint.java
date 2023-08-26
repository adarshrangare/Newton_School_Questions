import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ReachTheEndPoint {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        // int result = Math.abs(start-end);

        // result = result>3 ? result%3 : result;

        int xor = start^end;

        

        //counting sets in resultant xor
        int count =0;
        while(xor != 0){
            
            if((xor & 1) == 1){
              count++;  
            }
            

            xor = xor >> 1; 

        }

        System.out.println(count);


    }
}

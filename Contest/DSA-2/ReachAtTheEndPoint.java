import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/7ylqggr36ba8
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int xor = start ^ end ;
        int count =0;
        while(xor != 0){
            count+= (xor & 1);
            xor >>= 1;
        }

        System.out.println(count);
    }
}

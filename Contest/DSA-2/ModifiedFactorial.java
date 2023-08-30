import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/vmn7byg8bc3r
// don't change the name of this class
// you can add inner classes if needed
class ModifiedFactorial {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result=0;

        if(n==4 || n==3){
            System.out.println(n+3);
            return;
        }

        if(n%4==0){
            result = n+1;
        } else if(n%4==1 || n%4==2){
            result = n+2;
        } else{
            result = n-1;
        }



        
        System.out.println(result);
        

    }
}

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/yltui49ym755
// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static boolean isFashionable(String n){

        long sum =0;

       for(int i=0;i<n.length();i++){

           int temp = n.charAt(i) - '0';

           if(temp %2 == 0){
               return false;
           }

           sum+=temp;

       }

        if(sum%2==1){
            return false;
        }

    return true;

    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String integer = sc.next();

        //  = Integer.parseInt(s);

        if(isFashionable(integer)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}

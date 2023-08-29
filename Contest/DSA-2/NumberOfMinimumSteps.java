import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/d0vduyk7922t
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        // 10 20
        // 10+3 13
        // 13+3 16
        // 16+3 19
        // 16+1 20

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-->0){

            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();

            int result = 0;
            if(x==y){
                result = 0;
            } else{

                int diff = Math.abs(x-y);
                
                if(diff>a){

                    if(diff%a==0){

                    result = diff/a;

                    } else{

                        result = (diff/a)+1;

                    }


                    
                } else{
                    result = 1;
                }


            }

                System.out.println(result);
        }


    }
}

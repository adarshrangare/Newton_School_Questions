// https://my.newtonschool.co/playground/code/ow75uof4k2ep

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AppearTwice {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] arr = new int[s.length()];

        for(int i=0;i<s.length()-1;i++){

            char c = s.charAt(i);

            // 0 1 2 3 4 5 6 7 8
            // a b c c b a a c z
            // 5 3 1 4 0 1 0 0 0

            // while(!st.empty() && st.peek()==c)

            for(int j=i+1;j<s.length();j++){
                
                if(c == s.charAt(j)){
                    arr[i] = j-i;
                    break;
                }


            }


        }
       int  minIndex = s.length();
        int min = s.length();
       
       for(int i=0;i<s.length();i++){

           if(min>arr[i] && arr[i]!=0){
               min = arr[i];
               minIndex = i;
           }


       }

    
        System.out.println(s.charAt(minIndex));



    }
}

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/ukqzqhxnu28s
// don't change the name of this class
// you can add inner classes if needed
class FirstNonRepeatingCharInString {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        HashMap <Character,Integer> letters = new HashMap<>();

        for(int i=0;i<s.length();i++){
            
            char c = s.charAt(i);

            // if(letters.containsKey(c)){
            //     letters.put(c,letters.get(c)+1);
            // } else{
            //     letters.put(c,1);
            // }

            letters.put(c,letters.getOrDefault(c,0)+1);


        }

        for(int i=0;i<s.length();i++){
            if(letters.get(s.charAt(i))==1){
                System.out.println(i);
                return;
            }
        }

         System.out.println(-1);

    }
}

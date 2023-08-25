import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/udwf7nf4r9ad
// don't change the name of this class
// you can add inner classes if needed
class RepeatedCharAndThierCount{
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        HashMap<Character,Integer> letters = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(letters.containsKey(c)){
                letters.put(c,letters.get(c)+1);
            } else{
                letters.put(c,1);
            }


        }

        Set <Character> keys = letters.keySet();
    
        for(char key = 'a';key<='z';key++){
            // System.out.println(key);
            if(letters.containsKey(key)){

            
            if(letters.get(key)>1){
                System.out.println(key+" "+letters.get(key));
            }
            }
        }



    }
}

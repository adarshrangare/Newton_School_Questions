import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
//https://my.newtonschool.co/playground/code/guv3ohc70thc
// don't change the name of this class
// you can add inner classes if needed
class DistictAlphabets {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int temp = s.length();

        HashMap <Character,Integer> letters = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            
            if(letters.containsKey(s.charAt(i))){
                int count2 = letters.get(s.charAt(i));
                
                // System.out.println(count2);

               letters.put(s.charAt(i),letters.get(s.charAt(i))+1);
            } else{
                letters.put(s.charAt(i),1);
            }

            

        }

        // System.out.println(letters);

        for(char i = 'a';i<='z';i++){
            

            if(letters.containsKey(i)){
                System.out.print(letters.get(i)+" ");
            } else{
                System.out.print("0 ");
            }


        }


    }
}

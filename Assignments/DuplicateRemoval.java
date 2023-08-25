import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DuplicateRemoval {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Stack <Character> st = new Stack<>();

        st.push(s.charAt(0));

        for(int i=1;i<s.length();i++){
           char c = s.charAt(i);
           if(st.peek()==c){
               continue;
           }
           st.push(c);

        }

        for(char c : st){
            System.out.print(c);
        }
        
    }
}

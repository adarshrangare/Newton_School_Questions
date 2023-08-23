import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/lkwioiu5ap17

// don't change the name of this class
// you can add inner classes if needed
class PrefixToInfix {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // *-A/BC-/AKL
        // A-B/C * A-K/L 

        // *-/-/

        Stack <String> expression = new Stack<>();

        HashSet <Character> operators = new HashSet<>();

        operators.add('+');
        operators.add('-');
        operators.add('/');
        operators.add('*');


        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(operators.contains(c)){

                String exp = "("+ expression.pop() + c + expression.pop() +")";

                expression.push(exp);

            } else{

                expression.push(c+"");

            }


        }
        System.out.println(expression.pop());

    }
}

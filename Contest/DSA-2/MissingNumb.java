import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/d60hm1ntqh75
// don't change the name of this class
// you can add inner classes if needed
class MissingNumb {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            set.add(input);
        }

        

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                System.out.print(i+" ");
            }
        }

    }
}

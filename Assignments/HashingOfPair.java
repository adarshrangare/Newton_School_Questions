import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/u0eaz1bss611
// don't change the name of this class
// you can add inner classes if needed
class HashingOfPair {
    public static boolean isSumExist(HashMap<Integer,Boolean>hm,int sum){

             Set <Integer> keys = hm.keySet();

            // boolean exist = false;
            for(int i : keys){
                int num = sum-i;
                hm.put(i,false);
                if(hm.containsKey(num) && hm.get(num)){
                    return true;
                }
               hm.put(i,true); 
            }

        return false;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-->0){

            int n = sc.nextInt();

            int sum = sc.nextInt();

            // int [] arr = new int[n];
            HashMap<Integer,Boolean> hm = new HashMap<>();
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                hm.put(num,true);
            }

           

            if(isSumExist(hm,sum)){
                System.out.println(1);
            } else{
                System.out.println(0);
            }


        }
    }
}

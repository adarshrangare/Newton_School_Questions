import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/yh7o2e537bj1
// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static boolean isNonDecreasing(int[] arr){

        int count =0;
        int index =0;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                count++;
                index = i;
            }


        }

        if(count>1){
            return false;
        }

        // return true;
        return count ==0 || index ==0 || index ==arr.length-2 || arr[index-1] <= arr[index+1] || arr[index] <= arr[index+2];

    }

    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-->0){

            int n = sc.nextInt();

            int [] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            if((isNonDecreasing(arr))){
                System.out.println("YES");
            } else{
                 System.out.println("NO");
            }

        }

    }
}

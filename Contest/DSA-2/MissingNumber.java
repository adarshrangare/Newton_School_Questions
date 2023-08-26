import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MissingNumber {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];
        ArrayList <Integer> leftNumbers = new <Integer> ArrayList();

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<=n;i++){

            if(notExist(arr,i)){

                leftNumbers.add(i);

            }

        }

        for(int i=0;i<leftNumbers.size();i++){
        System.out.print(leftNumbers.get(i)+" ");
        }


    }

    public static boolean notExist(int []arr,int x){

        for(int i =0;i<arr.length;i++){
            
            if(arr[i]==x) return false; 

        }

        return true;
    }
}

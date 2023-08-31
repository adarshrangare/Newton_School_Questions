import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/ist2bynlslmy
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-->0){

        int n = sc.nextInt();
        int x = sc.nextInt();

        int [] freshness = new int[n];
        int [] cost = new int [n];

        for(int i=0;i<n;i++){
            freshness[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++){
                    cost[i] = sc.nextInt();

                }
       
       int totalCost = 0;

        for(int i=0;i<n;i++){
            if(freshness[i]>=x){

            totalCost+= cost[i];


            }

        }

        System.out.println(totalCost);


         }
    }
}

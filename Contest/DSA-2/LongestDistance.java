import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LongestDistance {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String binaryStr = Integer.toBinaryString(n);

        // System.out.println(binaryStr);

        int t = binaryStr.length();

        int maxDistance = 0;

        for(int i=0;i<t;i++){
            int c = binaryStr.charAt(i) - '0';
            if(c==0){
                continue;
            }
            int dis = 0;
            for(int j=i+1;j<t;j++){
                int c2 = binaryStr.charAt(j) -'0';
                if(c2==0){
                    continue;
                }

                if(c2==1){
                    dis = j-i;
                    break;
                }

            }

            maxDistance = Math.max(dis,maxDistance);


        }

        System.out.println(maxDistance);

    }
}

// https://my.newtonschool.co/playground/code/zrbamg29sc6v
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BoundaryTraversalOfMatrix {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-->0){

            int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[n][m];

        for(int i=0;i<n;i++){

            for(int j = 0;j<m;j++){

                arr[i][j] = sc.nextInt();
            }

        }
                
         for(int i=0;i<n;i++){
                            
            for(int j = 0;j<m;j++){
                if(i==0 || j==m-1 )
                {System.out.print(arr[i][j]+" ");}
                
            }
            

        }
                     
        if(m!=1){
            for(int i=n-1;i>0;i--){
                        
            for(int j = m-2;j>0;j--){
                if(i==n-1 || j==0 ) 
                {System.out.print(arr[i][j]+" ");}
                
            }
            

        }
        

        for(int i=n-1;i>0;i--){

                int j =0;
                
                {System.out.print(arr[i][j]+" ");}
                
            
            

        }
        }

        System.out.println();

        }


    }
}

class Solution {
    public void cards(long n) {
        // write your code here

// https://my.newtonschool.co/playground/code/2ux1tni4wrr1
        if((n & (n-1)) ==0){
            System.out.println(n);
        } else{
            System.out.println(((n-(1L << (63 - Long.numberOfLeadingZeros(n)))) <<1 ));
        }





        // Deque<Long> dq = new ArrayDeque<>();

        // for(long i=n;i>=1;i--){
        //     dq.add(i);
        // }

        // System.out.println(dq);
        // int i=1;
        // while(dq.size() !=1){
        //     if(i%2==1){

        //         dq.removeLast();

        //     } else{

        //         dq.addFirst(dq.removeLast());


        //     }

        //     i++;


        // }


        // System.out.println(dq.removeLast());



        // if(n%2==0){
        //     System.out.println(n);
        // } else{
        //      System.out.println(2);
        // }

        // 5 4 3 2 1

        // 5 4 3 2

        // 2 5 4 3

        // 2 5 4

        // 4 2 5

        // 4 2
        
        //

        

        

   }
}

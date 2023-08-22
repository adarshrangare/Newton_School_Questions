//https://my.newtonschool.co/playground/code/s8slkdmef62m
class FormingQueueFromTwoStacks{

/*
 static Stack<Integer> s1 = new Stack<Integer>();  
 static Stack<Integer> s2 = new Stack<Integer>();  
*/
  
    static void enQueue(int x)  
    {  
      //Enter your code here
        s1.push(x);

    }  
  
    static void deQueue()  
    {   
     //Enter your code here

        while(!s1.empty()){

                s2.push(s1.pop());

            }
            s2.pop();

            while(!s2.empty()){

                s1.push(s2.pop());

            }
        


    } 
    static void Print1(){
      // Enter your code here

        // for(int i:s1){
        //     System.out.println(i+" ");
        // }

        // System.out.println(s1);
        //  System.out.println(s2);

        while(!s1.empty()){

            s2.push(s1.pop());

        }

        System.out.println(s2.peek());

        while(!s2.empty()){
            s1.push(s2.pop());
        }



    }
}

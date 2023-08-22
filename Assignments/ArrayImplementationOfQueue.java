class ArrayImplementationOfQueue{
  /*

  class Queue{ 
    static final int MAX = 10000; 
    int rear=0,front=0; 
    int a[] = new int[MAX]; 
}
   int rear=0,front=0; //pointer to rear and front
    int a[] //array that contain elements of queue
*/ 
public static void enqueue(int x, int k)
    {
        // enter your code here 
        
        if(rear>=k){
            System.out.println("Queue is full");
        } else{

            a[rear++] = x;

        }

    

    }


   public static  void dequeue()
    {
      //enter your code here

       if(rear == front){
           System.out.println("Queue is empty");
       }else        
        front++;
    }

    public static void displayfront()
    {
        // enter your code here
        if(rear == front){
           System.out.println("Queue is empty");
       }else  {

           System.out.println(a[front]);

       }
    }
}

  
}

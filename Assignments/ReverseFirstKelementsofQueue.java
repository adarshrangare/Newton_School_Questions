
class ReverseFirstKelementsofQueue{
{
static Queue<Integer> ReverseK(Queue<Integer> queue, int k) { 
        //enter your code here

        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<k;i++){

            st.push(queue.remove());

        }

        while(!st.empty()){
            q.add(st.pop());
        }

        while(!queue.isEmpty()){
            q.add(queue.remove());
        }
         

        // System.out.println(st);
        return q;
    }
}

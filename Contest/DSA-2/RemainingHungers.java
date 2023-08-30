import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// https://my.newtonschool.co/playground/code/yop0ru14k36c
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
        // Your code here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> studentsQ = new LinkedList<>();
        Stack<Integer> parathas = new Stack<>();

        
        int n = Integer.parseInt(br.readLine());
        String st = br.readLine();
        String pr = br.readLine();

        // System.out.println(st);
        // System.out.println(pr);

        String [] stAr = st.split(" ");
        
        String [] prAr = pr.split(" ");

        // System.out.println(stAr[2]);

        for(int i=0;i<stAr.length;i++){
            // System.out.println("st: "+i);
            studentsQ.add(Integer.parseInt(stAr[i]));

        }
        for(int i=prAr.length-1;i>=0;i--){
            
        //    System.out.println("pr: "+i);
            parathas.push(Integer.parseInt(prAr[i]));

        }

        // System.out.println(parathas.peek());
        int i=0;
        while(!studentsQ.isEmpty() && !parathas.empty() && i++<n*n){

            if(studentsQ.peek() == parathas.peek()){
                
                studentsQ.remove();
                parathas.pop();
            } else{

                studentsQ.add(studentsQ.remove());
                

            }


        }

        System.out.println(studentsQ.size());



    }
}

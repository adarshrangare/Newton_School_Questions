class LeftShiftAndMultiply {    
    public void multiply(long N, long M) {
           // write your code here
      // https://my.newtonschool.co/playground/code/tx7akdxtehaj

    StringBuilder eqn = new StringBuilder();

    int count = 0;

    while(M>0){

        if((M & 1) == 1){

            if(eqn.length() > 0){
                eqn.insert(0," + ");
            }
            eqn.insert(0, "("+N+"<<"+count+")");

        }

        M = M >> 1;
        count++;

        }

        System.out.println(eqn.toString());
        
    }





}

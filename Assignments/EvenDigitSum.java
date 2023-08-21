// https://my.newtonschool.co/playground/code/65576pdid483

class EvenDigitSum {
    public int countEven(int num) {
// enter your code here

    int count=0;

    for(int i=1;i<=num;i++){
        if(digitSum(i)%2==0){
            count++;
        }
    }
    return count;

    }

    public int digitSum(int a){
        int sum=0;
        while(a>0){
            int rem = a%10;
            sum+=rem;
            a/=10;
        }
        return sum;
    }
}

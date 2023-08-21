// https://my.newtonschool.co/playground/code/53erlg6wy4n5 
class KnightProblem{
static int Knight(int x, int y){
//Ener your code here
int count=0;
if(x-2 > 0 && y+1 <=8 ) count++;
if(x-2 > 0 && y-1 > 0) count++;
if(x+2 <= 8 && y+1 <=8 ) count++;
if(x+2 <= 8 && y-1 > 0 ) count++;
if(x-1 > 0 && y+2 <=8) count++;
if(x-1 > 0 && y-2 > 0) count++;
if(x+1 <=8 && y+2 <=8) count++;
if(x+1 <=8 && y-2 >0 ) count++;

return count;
}
}

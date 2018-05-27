public class ReverseThings{
  public static void main(String[] args){
    
        System.out.println(reverseNum(123)); //returns 321
	System.out.println(reverseNum(1923)); //returns 3291
}
        
    public static int reverseNum(int num){
      int reverse=0;
      while(num != 0){
        reverse=(reverse*10)+(num%10);
        num=num/10;
           	}
      		return reverse;
		}
}
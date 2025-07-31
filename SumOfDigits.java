import java.util.*;
public class SumOfDigits{
       public static void main(String[]args){
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter a number:");
              int num=sc.nextInt();
              int sum=0;
              for(int i=num;i>0;){
                  int rem=i%10;
                  i=i/10;
                  sum=sum+rem;
                  
}System.out.println(sum);

}
}
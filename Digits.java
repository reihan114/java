import java.util.Scanner;
public class Digits{
       public static void main (String[]args){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a number:");
             int num=sc.nextInt();
             
             int count=0;
             for(int i=num;i>0;){
                  i=i/10;
                  count++;
}
  System.out.println(count);           
}
}










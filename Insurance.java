import java.util.*;
class Insurance{
       public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Mr.Shyam, Enter your age:");
            int age=sc.nextInt();
            int premium;
            if(age>60){
                premium=5000;
                       }
            else if(age>=40&&age<=60){
                premium=3000;       
                       }
            else if(age>=20&&age<=39){
                premium=1500;

                       }
            else{
                 premium=1000;
                }
       System.out.println("Mr.Shyam, Your Policy premium is Rs."+premium);
      }

}
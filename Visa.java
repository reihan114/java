import java.util.*;
public class Visa{
     public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your age:");
            int age=sc.nextInt();
            System.out.print("Do you have a passport(yes/no):");
            String passport=sc.next().toLowerCase();
            if(age>=18){
               if(passport.equals("yes")){
                         System.out.println("Visa application is accepted");
}              else if(passport.equals("no")){
                         System.out.println("Visa application is rejected");
}              else{
                         System.out.println("Enter a valid input");
}
}
           else{
                         System.out.println("Visa not allowed");
}
}

}
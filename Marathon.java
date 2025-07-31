import java.util.*;
public class Marathon{
      public static void main(String[]args){
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter your age:");
              int age=sc.nextInt();
              System.out.println("Do you have a valid certificate? yes/no");
              String certificate=sc.next();
              if(age>=18&&age<45){
                    if(certificate.equals("yes")){
                         System.out.println("You can participate in Marathon");
                          
}                   else{
                       System.out.println("Participation is denied. You need a valid certificate.");
}      }      else{
                 System.out.println("Participation not allowed.Your age must be in between 18 to 45 years");
}



}

}
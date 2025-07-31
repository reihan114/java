import java.util.*;
class Ramoutingplan{
     public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter today's Temperature:");
       int temperature=sc.nextInt();
          if(temperature>45){
             System.out.println("Stay in home Ram.It's too hot outside");
                    }
          else if(temperature>=30&&temperature<=45){
              System.out.println("Carry water bottle.You may feel thirsty.");
                    }
          
          else{
               System.out.println("You can go outside normally.Enjoy your outing!!");
     }
   }


}
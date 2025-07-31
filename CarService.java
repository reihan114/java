import java.util.*;
public class CarService{
       public static void main(String[]args){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the no.of kms car run till now:");
              int car_run=sc.nextInt();
              if(car_run>20000)
                       System.out.println("Your car needs full service");
              else if(car_run>=10000&&car_run<=20000)
                       System.out.println("Your car needs semi service");
              else
                       System.out.println("Your car needs general Checkup");
}

}
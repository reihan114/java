import java.util.*;
class ExamResult{
    public static void main(String[]args){
     int total_subjects=5;
     Scanner sc=new Scanner(System.in);
     int subject1=sc.nextInt();
     int subject2=sc.nextInt();
     int subject3=sc.nextInt();
     int subject4=sc.nextInt();
     int subject5=sc.nextInt();
     int avg=(subject1+subject2+subject3+subject4+subject5)/5;
     System.out.println("Your avg marks are:"+avg);
     if((subject1>=35)&&(subject2>=35)&&(subject3>=35)&&(subject4>=35)&&(subject5>=35)){
            System.out.println("Passed");

               if(avg>=90){
                       System.out.println("Outstanding!!");
                       }
               else if(avg>=75){
                       System.out.println("Distinction");
                        }
               else if(avg>=60){
                        System.out.println("First Class");

                        }
           }
      else{
            System.out.println("Fail");
             }    
}
}

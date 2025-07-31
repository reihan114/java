import java.util.*;
class visaEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        sc.nextLine();
        if(age<18){
               System.out.println("Not Eligible you are too young for visa");
             }
        else{
        System.out.print("Do you have any criminal records(yes/no)?:");
        String criminalRecord=sc.nextLine();
        boolean hasNoCriminalRecord=criminalRecord.equals("no");
        System.out.print("Do you have passport?(yes/no):");
        String passport=sc.nextLine();
        boolean hasPassport=passport.equals("yes");
   
        if(hasNoCriminalRecord&&hasPassport){
            System.out.println("Eligible for visa.");
        }
        else if(hasNoCriminalRecord&&!hasPassport){
            System.out.println("Apply for passport and get visa");
        }

        else if(!hasNoCriminalRecord){
            System.out.println("Not Eligible as you have a criminal record");
        }else{
            System.out.println("Please check your inputs");
        }
    }}
}
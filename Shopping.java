public class Shopping{
      public static void main(String[]args){
            float amount=8500f;
            float discount=0f;
            Boolean isMember=true;
            if(amount>=10000&&isMember){
               System.out.println("You get discount of 30%");
               discount=0.3f*amount;
              }
           else if(amount>=5000&&isMember){
               System.out.println("You get discount of 20%");
                discount=0.2f*amount;
                }
           else if(!isMember){
                System.out.println("You get discount of 5%");
                discount=0.05f*amount;
                 }
                amount=amount-discount;
                System.out.println("Your shopping bill is:"+amount);

}

}


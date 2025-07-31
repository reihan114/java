public class ReverseNumber{
        public static void main(String[]args){
              int num=1331;
        int reverse=0;
        for(int i=num;i>0;){//12332
            int rem=i%10;//12
            reverse=reverse*10+rem;//1
            i=i/10;//12332
        }
        if(reverse==num){
            System.out.println(num+" "+"Palindrome Number");
        }
        else{
        System.out.println(num+"Not a Palindrome Number");
        } 
}
}
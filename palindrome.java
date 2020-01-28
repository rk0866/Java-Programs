public class palindrome{
    public static void main(String args[]) {
       int a=Integer.parseInt(args[0]);
       int k=a;
       int rem=0,b=0;
       while(k>0)
       {
           b=k%10;
           rem=(rem*10)+b;
           k=k/10;
       }
       if(a==rem)
       System.out.println("palindrome number");
       else
       System.out.println("Not palindrome number");
    }
}
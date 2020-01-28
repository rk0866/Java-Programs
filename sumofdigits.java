public class sumofdigits{
    public static void main(String args[]) {
       int a=Integer.parseInt(args[0]);
       int k=a;
       int rem=0,b=0;
       while(k>0)
       {
           b=k%10;
           rem=rem+b;
           k=k/10;
       }
       System.out.print("The sum of the digits is : "+rem);
    }
}

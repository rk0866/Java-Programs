public class prime{
    public static void main(String args[]) {
       int a=Integer.parseInt(args[0]);
       int c=0;
       if(a==1)
       System.out.println("1 is nither prime nor composite number");
       for(int i=2;i<=a/2;i++)
       {
           if(a%i==0)
           c++;
       }
       if(c==0)
       System.out.println("prime number");
       else
       System.out.println("composite number");
    }
}
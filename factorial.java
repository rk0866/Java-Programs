public class factorial{
    public static void main(String args[]) {
       int a=Integer.parseInt(args[0]);
       long f=1;
       if(a==0)
       System.out.println("The factorial is : "+1);
       else{
       for(int i=1;i<=a;i++)
       {
           f=f*i;
       }
       System.out.println("The factorial is : "+f);
       }
       }
    }

public class matrixmax {
   public static void main(String args[]) {
       int[][] a=new int[100][100];
       int k=0,max=0;
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               a[i][j]=Integer.parseInt(args[k]);
               k++;
           }
       }
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
       max=a[0][0];
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               if(a[i][j]>max)
               max=a[i][j];
           }
       }
       System.out.println("The maximum element is: "+max);
       }
       }



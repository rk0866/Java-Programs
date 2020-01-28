import java.util.*;
public class volumeofbox{
    void MyClass()
      {
          int width;
          int height;
          double depth;
      }     
      double ans=0;
      double volume(int width,int height,double depth)
      {
          ans=width*height*depth;
          return ans;
      }
    public static void main(String args[]) {
       MyClass c=new MyClass();
      System.out.println("The volume is: "+c.volume(10,10,10.2));
      
    }
}



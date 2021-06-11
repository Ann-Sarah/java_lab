import java.io.*;
import java.util.Scanner;
class Product
{ 
 int pcode;
 String pname;
 Float price;
 
 void read() throws IOException
 {
   System.out.print("\n");
   Scanner po = new Scanner(System.in);
   System.out.print("Enter the Product code: ");
		
   pcode=po.nextInt();
   System.out.print("Enter the product name: ");
		
   pname=po.next();
   System.out.print("Enter the product price: ");
		
   price=po.nextFloat();
   
 }
 void Display() throws IOException
 {
  System.out.print("\nProduct code: \n" + pcode);
  System.out.print("\nName of the Product: \n" + pname);
   System.out.print("\nPrice of the product: \n" + price);
  
  }
public static void main(String args[])throws IOException
{
 
 Product p[]=new Product[5];
 for(int i=1;i<=3;i++)
 {
  p[i]=new Product();
  p[i].read();
  
 }
 
 int min=1;
 for(int i=1;i<=3;i++)
 {
  
  if(p[min].price>p[i].price)
  {
   min=i; 
     }
  }

System.out.print("\nProduct with min price: \n");
p[min].Display();


 }

}

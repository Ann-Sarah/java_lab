import java.lang.*;
import java.io.*;
class Products
{
public static void main( String args[] )throws IOException
{
product s= new product();
s.getdata();
s.dis();
}
}
class product
{
int pcode;
int pprice;
String pname;
void getdata() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the name of product: ");
pname=br.readLine();
System.out.println("Enter the code of prduct:");
pcode=Integer.parseInt(br.readLine());
System.out.println("enter the price of prodcut: ");
pprice=Integer.parseInt(br.readLine());

}
void dis()
{
System.out.println("Product name: "+pname);
    System.out.println("Product code: "+pcode);
    System.out.println("Product price:  "+pprice);
}
}

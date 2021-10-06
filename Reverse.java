import java.io.*;
import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:\n");
int a=sc.nextInt();

int b;
int c;
b=a%10;
c=a*10+b;
a=a/10;
System.out.println("rev :" +a);
}
}



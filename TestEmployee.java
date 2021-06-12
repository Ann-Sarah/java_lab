import java.io.*;
import java.util.Scanner;
class Person
{
 String name;
 String gender;
 String address;
 int age;
 Person( )
{
 name=" ";
 gender=" ";
 address=" ";
 age=0;
}
void read()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Name:" );
 name=sc.nextLine();
 System.out.println("Enter Gender-M/F:");
 gender=sc.nextLine();
 System.out.println("Enter Address:" );
 address=sc.nextLine();
 System.out.println("Enter Age:" );
 age=sc.nextInt();
 }
 void display()
{
 System.out.println("\nName of the Person :"+name);
 System.out.println("\nGender :"+gender);
 System.out.println("\nAddress :"+address);
 System.out.println("\nAge :"+age);
}
}
class Employee extends Person 
{
 String Empid;
 String Company_name;
 String Qualification;
 int Salary;
 Employee()
 {
 Empid=" ";
 Company_name=" ";
 Qualification=" ";
 Salary =0;
 }
 void read()
 {
 super.read();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Empid:" );
 Empid=sc.nextLine();
 System.out.println("Enter Company Name:");
 Company_name=sc.nextLine();
 System.out.println("Enter Qualification:" );
 Qualification=sc.nextLine();
 System.out.println("Enter Salary:" );
 Salary=sc.nextInt();
 }
 void display()
 {
 super.display();
 System.out.println("\nEmpid :" +Empid);
 System.out.println("\nCompany Name :" +Company_name);
 System.out.println("\nQualification :" +Qualification);
 System.out.println("\nSalary :" +Salary);
 }
}

class Teacher extends Employee
{
 String Dept;
 String Subj;
 String Tid;
 Teacher()
 {
 Dept=" ";
 Subj =" ";
 Tid=" ";
 }
 void read()
 {
 super.read();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Department Name:" );
 Dept=sc.nextLine();
 System.out.println("Enter Subject:");
 Subj=sc.nextLine();
 System.out.println("Teacher Id:" );
 Tid=sc.nextLine();
 }
 void display() 
{
 super.display();
 System.out.println("\nDepartment :" +Dept);
 System.out.println("\nSubject :" +Subj);
 System.out.println("\nTeacher id:" +Tid);
 }
}

class TestEmployee 
{
 public static void main(String args[]) 
{
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the number of teacher details: ");
 int n = s.nextInt();
 Teacher t[] = new Teacher[n];
 for (int i = 0; i < n; i++) 
{
 t[i] = new Teacher();
 t[i].read();
 }
 for (int j = 0; j < n; j++) 
{
 t[j].display();
 }
 }
}
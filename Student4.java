
import java.util.Scanner;
 class Student4{

static String gender;
static String firstName;
static String lastName;
static int age;
static int hight;
static int studentId;
static String address;


public static void main(String[]args){

Scanner sc=new Scanner(System.in);

Student4 c=new Student4();

System.out.println("Enter gender");
 gender=sc.nextLine();

System.out.println("Enter firstName");
 firstName=sc.nextLine();

System.out.println("enter lastName");
 lastName=sc.nextLine();

 System.out.println("enter age");
 age=sc.nextInt();
  sc.nextLine();

 System.out.println("enter hight");
 hight=sc.nextInt();

System.out.println("enter stundentId");
 studentId=sc.nextInt();
 sc.nextLine();
System.out.println("enter address");
 address= sc.nextLine();

System.out.println("gender= "+ gender);
System.out.println("firstName= "+firstName);
System.out.println("lastName= "+lastName);
System.out.println("age= "+age);
System.out.println("hight= "+hight);
System.out.println("studentId= "+studentId);
System.out.println("address = " + address);



}//end of the main method
}//end of the class

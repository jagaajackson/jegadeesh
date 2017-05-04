import java.util.Scanner;
public class switchcase{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice");
int choice;
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("sunday");
break;
case 2:
System.out.println("Monday");
break;
case 3:
System.out.println("Tuesday");
break;
case 4:
System.out.println("Wednessday");
break;
case 5:
System.out.println("Thursday");
break;
case 6:
System.out.println("Friday");
break;
case 7:
System.out.println("Saturday");
Default:
System.out.println("please enter the correct options");
break;
}
}
}
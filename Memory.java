import java.util.Scanner;
class Memory{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int num1=scan.nextInt();
int num2=scan.nextInt();
if(num1>num2)
System.out.print("num1 is greater number");
else
System.out.print("num2 is greater number");
}
}
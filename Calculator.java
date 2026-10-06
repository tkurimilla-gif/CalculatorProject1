public class Calculator
{
public int add(int a,int b){

int c=a+b;
return c;
}
public static void main(String[] args)
{
calculator cal= new Calculator();
System.out.println("The sumof the two numbers is "+(cal.add(2,3)));

}
}

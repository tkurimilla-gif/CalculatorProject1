public class Calculator
{
public int add(int a,int b){

int c=a+b;
return c;
}
public int square(int x) {
int z=x*x;
return z;
}

public static void main(String[] args)
{
calculator cal= new Calculator();
System.out.println("The sumof the two numbers is "+(cal.add(2,3)));
System.out.println("The square of the number is: "+(cal.square(4));

}
}

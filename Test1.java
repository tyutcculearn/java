import java.util.Scanner;
public class Test1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input numerator and denominator of rational A:");
		int x = input.nextInt();
		int y = input.nextInt();
		if(x == 0 || y == 0)
		{
			System.out.printf("Wrong rational%n");
			return;
		}
		Rational a = new Rational(x,y);
		System.out.println("Please input numerator and denominator of rational B:");
		x = input.nextInt();
		y = input.nextInt();
		if(x == 0 || y == 0)
		{
			System.out.printf("Wrong rational%n");
			return;
		}
		Rational b = new Rational(x,y);
		System.out.printf("The rational A is %s%n",a.toString());
		System.out.printf("The rational B is %s%n",b.toString());
		System.out.printf("The result of A Add B is %s%n",Rational.Add(a,b).toString());
		System.out.printf("The result of A Subtract B is %s%n",Rational.Subtract(a,b).toString());
		System.out.printf("The result of A Multiply B is %s%n",Rational.Multiply(a,b).toString());
		System.out.printf("The result of A Divide B is %s%n",Rational.Divide(a,b).toString());
		System.out.printf("Please input floating-point number you want of rational A :%n");
		int num = input.nextInt();
		System.out.printf("The a in floating-point format is %s%n",a.FormatString(num));
	}
}
import java.util.Scanner;
public class Test2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		HugeInteger a = new HugeInteger();
		HugeInteger b = new HugeInteger();
		System.out.printf("Please input the first number:");
		a.parse(input.next());
		System.out.printf("Please input the second number:");
		b.parse(input.next());
		System.out.printf("The first number num1 is %s%n",a);
		System.out.printf("The first number num2 is %s%n",b);
		System.out.printf("The result of num1 add num2 is %s%n",a.add(b));
		System.out.printf("The result of num1 subtract num2 is %s%n",a.subtract(b));
		System.out.printf("The result of num1 multiply num2 is %s%n",a.multiply(b));
		System.out.printf("The result of num1 divide num2 is %s%n",a.divide(b));
		System.out.printf("The result of num1 mod num2 is %s%n",a.mod(b));
		System.out.printf("The result of num1 isEqualTo num2 is %b%n",a.isEqualTo(b));
		System.out.printf("The result of num1 isNotEqualTo num2 is %b%n",a.isNotEqualTo(b));
		System.out.printf("The result of num1 isGreaterThan num2 is %b%n",a.isGreaterThan(b));
		System.out.printf("The result of num1 isLessThan num2 is %b%n",a.isLessThan(b));
		System.out.printf("The result of num1 isGreaterThanorEqualTo num2 is %b%n",a.isGreaterThanorEqualTo(b));
		System.out.printf("The result of num1 isLessThanorEqualTo num2 is %b%n",a.isLessThanorEqualTo(b));
	}
}
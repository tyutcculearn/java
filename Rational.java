import java.text.NumberFormat;
public class Rational
{
	private int numerator;
	private int denominator;

	public Rational()
	{
		this.numerator = 0;
		this.denominator = 0;
	}
	static public int Gcd(int a,int b)
	{
		return b == 0 ? a : Gcd(b, a % b);
	}

	public int GetNumerator()
	{
		return this.numerator;
	}

	public int Getdenominator()
	{
		return this.denominator;
	}

	public Rational(int numerator,int denominator)
	{
		int d = Gcd(numerator, denominator);
		int x = numerator / d;
		int y = denominator / d;
		if(x > 0 && y < 0)
		{
			x = -x;
			y = -y;
		}
		this.numerator = x;
		this.denominator = y;
	}
	static public Rational Add(Rational a,Rational b)
	{
		int x,y,d;
		x = a.GetNumerator() * b.Getdenominator() + b.GetNumerator() * a.Getdenominator();
		y = a.Getdenominator() * b.Getdenominator();
		d = Gcd(x,y);
		x = x / d;
		y = y / d;
		if(x > 0 && y < 0)
		{
			x = -x;
			y = -y;
		}
		return new Rational(x,y);
	}

	static public Rational Subtract(Rational a,Rational b)
	{
		int x,y,d;
		x = a.GetNumerator() * b.Getdenominator() - b.GetNumerator() * a.Getdenominator();
		y = a.Getdenominator() * b.Getdenominator();
		d = Gcd(x,y);
		x = x / d;
		y = y / d;
		if(x > 0 && y < 0)
		{
			x = -x;
			y = -y;
		}
		return new Rational(x,y);
	} 

	static public Rational Multiply(Rational a,Rational b)
	{
		int x,y,d;
		x = a.GetNumerator() * b.GetNumerator();
		y = a.Getdenominator() * b.Getdenominator();
		d = Gcd(x,y);
		x = x / d;
		y = y / d;
		if(x > 0 && y < 0)
		{
			x = -x;
			y = -y;
		}
		return new Rational(x,y);
	} 

	static public Rational Divide(Rational a,Rational b)
	{
		int x,y,d;
		x = a.GetNumerator() * b.Getdenominator();
		y = a.Getdenominator() * b.GetNumerator();
		d = Gcd(x,y);
		x = x / d;
		y = y / d;
		if(x > 0 && y < 0)
		{
			x = -x;
			y = -y;
		}
		return new Rational(x,y);
	}

	public String toString()
	{
		return this.numerator + "/" + this.denominator;
	}

	public String FormatString(int num)
	{
		NumberFormat nFormat=NumberFormat.getNumberInstance(); 
		nFormat.setMaximumFractionDigits(num);
		return nFormat.format((double)this.numerator / (double)this.denominator);
	}
}
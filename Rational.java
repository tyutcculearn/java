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
	static public int gcd(int a,int b)
	{
		return b == 0 ? a : gcd(b, a % b);
	}

	public int getNumerator()
	{
		return this.numerator;
	}

	public int getdenominator()
	{
		return this.denominator;
	}

	public Rational(int numerator,int denominator)
	{
		int d = gcd(numerator, denominator);
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
	
	static public Rational add(Rational a,Rational b)
	{
		int x,y,d;
		x = a.getNumerator() * b.getdenominator() + b.getNumerator() * a.getdenominator();
		y = a.getdenominator() * b.getdenominator();
		d = gcd(x,y);
		x = x / d;
		y = y / d;
		if(x > 0 && y < 0)
		{
			x = -x;
			y = -y;
		}
		return new Rational(x,y);
	}

	static public Rational subtract(Rational a,Rational b)
	{
		int x,y,d;
		x = a.getNumerator() * b.getdenominator() - b.getNumerator() * a.getdenominator();
		y = a.getdenominator() * b.getdenominator();
		d = gcd(x,y);
		x = x / d;
		y = y / d;
		if(x > 0 && y < 0)
		{
			x = -x;
			y = -y;
		}
		return new Rational(x,y);
	} 

	static public Rational multiply(Rational a,Rational b)
	{
		int x,y,d;
		x = a.getNumerator() * b.getNumerator();
		y = a.getdenominator() * b.getdenominator();
		d = gcd(x,y);
		x = x / d;
		y = y / d;
		if(x > 0 && y < 0)
		{
			x = -x;
			y = -y;
		}
		return new Rational(x,y);
	} 

	static public Rational divide(Rational a,Rational b)
	{
		int x,y,d;
		x = a.getNumerator() * b.getdenominator();
		y = a.getdenominator() * b.getNumerator();
		d = gcd(x,y);
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

	public String formatString(int num)
	{
		NumberFormat nFormat=NumberFormat.getNumberInstance(); 
		nFormat.setMaximumFractionDigits(num);
		return nFormat.format((double)this.numerator / (double)this.denominator);
	}
}
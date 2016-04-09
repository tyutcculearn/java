import java.math.BigInteger;
public class HugeInteger
{
	private int[] num = new int[40];
	private int n;

	public void parse(String s)
	{
		this.n = s.length();
		for(int i = 0; i < this.n; i++)
			this.num[i] = s.charAt(i) - '0';
	}

	public String toString()
	{
		String s = "";
		for(int i = 0; i < this.n; i++)
			s += this.num[i];
		return s;
	}

	public HugeInteger add(HugeInteger y)
	{
		BigInteger a = new BigInteger(this.toString());
		BigInteger b = new BigInteger(y.toString());
		BigInteger c = a.add(b);
		HugeInteger d = new HugeInteger();
		d.parse(c.toString());
		return d;
	}

	public HugeInteger subtract(HugeInteger y)
	{
		BigInteger a = new BigInteger(this.toString());
		BigInteger b = new BigInteger(y.toString());
		BigInteger c = a.subtract(b);
		HugeInteger d = new HugeInteger();
		d.parse(c.toString());
		return d;
	}

	public boolean isEqualTo(HugeInteger b)
	{
		return this.toString().equals(b.toString());
	}

	public boolean isNotEqualTo(HugeInteger b)
	{
		return !this.toString().equals(b.toString());
	}

	public boolean isGreaterThan(HugeInteger b)
	{
		if(this.n > b.n) return true;
		else if(this.n < b.n) return false;
		boolean flag = false;
		for(int i = 0; i < this.n; i++)
		{
			if(this.num[i] > b.num[i])
			{
				flag = true;
				break;
			}
			else if(this.num[i] < b.num[i])
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

	public boolean isLessThan(HugeInteger b)
	{
		if(this.n > b.n) return false;
		else if(this.n < b.n) return true;
		boolean flag = false;
		for(int i = 0; i < this.n; i++)
		{
			if(this.num[i] < b.num[i])
			{
				flag = true;
				break;
			}
			else if(this.num[i] > b.num[i])
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

	public boolean isGreaterThanorEqualTo(HugeInteger b)
	{
		if(this.n > b.n) return true;
		else if(this.n < b.n) return false;
		boolean flag = true;
		for(int i = 0; i < this.n; i++)
		{
			if(this.num[i] > b.num[i])
			{
				flag = true;
				break;
			}
			else if(this.num[i] < b.num[i])
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

	public boolean isLessThanorEqualTo(HugeInteger b)
	{
		if(this.n > b.n) return false;
		else if(this.n < b.n) return true;
		boolean flag = true;
		for(int i = 0; i < this.n; i++)
		{
			if(this.num[i] < b.num[i])
			{
				flag = true;
				break;
			}
			else if(this.num[i] > b.num[i])
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

 	public boolean isZero()
 	{
 		boolean flag = true;
 		for(int i = 0; i < this.n; i++)
 			if(this.num[i] != 0) flag = false;
 		return flag;
 	}

	public HugeInteger multiply(HugeInteger y)
	{
		BigInteger a = new BigInteger(this.toString());
		BigInteger b = new BigInteger(y.toString());
		BigInteger c = a.multiply(b);
		HugeInteger d = new HugeInteger();
		d.parse(c.toString());
		return d;
	}

	public HugeInteger divide(HugeInteger y)
	{
		BigInteger a = new BigInteger(this.toString());
		BigInteger b = new BigInteger(y.toString());
		BigInteger c = a.divide(b);
		HugeInteger d = new HugeInteger();
		d.parse(c.toString());
		return d;
	}

	public HugeInteger mod(HugeInteger y)
	{
		BigInteger a = new BigInteger(this.toString());
		BigInteger b = new BigInteger(y.toString());
		BigInteger c = a.remainder(b);
		HugeInteger d = new HugeInteger();
		d.parse(c.toString());
		return d;
	}
}
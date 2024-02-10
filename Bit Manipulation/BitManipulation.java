import java.util.Scanner;

public class BitManipulation {

	public static void EvenOdd(int n)
	{
		if((n&1)==0)
			System.out.println(n+" is an even number");
		else
			System.out.println(n+" is an odd number");
	}
	public static int GetBit(int n,int i)
	{
		int BitMask=1<<i;
		if((n&BitMask)==0)
			return 0;
		else
			return 1;
	}
	public static int setBit(int n,int i)
	{
		int BitMask=1<<i;
		return (n|BitMask);
	}
	public static int clearBit(int n,int i)
	{
		int bitMask=~(1<<i);
		return (n&bitMask);
	}
	public static int updateBit(int n,int i,int newBit)
	{
//		if(newBit==0)
//			return clearBit(n,i);
//		else
//			return setBit(n,i);
		n=clearBit(n,i);
		int bitMask=newBit<<i;
		return (n|bitMask);
	}
	public static int clearLastIbit(int n,int i)
	{
		int bitMask=(-1)<<i;
		return n&bitMask;
	}
	public static int clearRangeOfBits(int n,int i,int j)
	{
		int a=(-1)<<(j+1);
		int b=(1<<i)-1;
		int bitMask=a|b;
		return n&bitMask;
	}
	public static void checkPowerOf2(int n)
	{
		if((n&(n-1))==0)
			System.out.println(n+" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");
	}
	public static int countSetBits(int n)
	{
		int count=0;
		while(n>0)
		{
			if((n&1)!=0)
				count++;
			n=n>>1;
		}
		return count;
	}
	public static void swap(int x,int y)
	{
		System.out.println("Before swap: x="+x+" and y="+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After swap: x="+x+" and y="+y);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		EvenOdd(n);
		int get=GetBit(n,3);
		System.out.println("3rd bit of "+n+" is "+get);
		int set=setBit(n,2);
		System.out.println("result after set 2nd bit of "+n+" is "+set);
		int clear=clearBit(n,1);
		System.out.println("Result after clear 1st bit of "+n+" is "+clear);
		int update=updateBit(n,2,1);
		System.out.println("Result after update 2nd bit of "+n+" is "+update);
		int clearIbit=clearLastIbit(n,2);
		System.out.println("Result after clear last 2 bit of "+n+" is "+clearIbit);
		int result=clearRangeOfBits(n,2,4);
		System.out.println("Result after clear bits from range of 2 and 7 of "+n+" is "+result);
		checkPowerOf2(n);
		int count=countSetBits(n);
		System.out.println(count+" set bits in "+n);
		swap(13,19);
		sc.close();
	}
}

//output

Enter a number
15
15 is an odd number
3rd bit of 15 is 1
result after set 2nd bit of 15 is 15
Result after clear 1st bit of 15 is 13
Result after update 2nd bit of 15 is 15
Result after clear last 2 bit of 15 is 12
Result after clear bits from range of 2 and 7 of 15 is 3
15 is not a power of 2
4 set bits in 15
Before swap: x=13 and y=19
After swap: x=19 and y=13

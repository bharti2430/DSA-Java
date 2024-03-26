public class PascalTriangle {
	public static ArrayList<Integer> generateRow(int n)
	{
		ArrayList<Integer> row=new ArrayList<>();
		row.add(1);
		for(int i=1;i<n;i++)
		{
			row.add(row.get(i - 1) * (n - i) / i);
		}
		return row;
	}
	public static ArrayList<Integer> printPascal(int N)
	{
		ArrayList<Integer> result=new ArrayList<>();
		for(int i=1;i<=N;i++)
			result.addAll(generateRow(i));
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows= ");
		int n=sc.nextInt();
		ArrayList<Integer> result=printPascal(n);
		for(int num:result)
			System.out.print(num+" ");
	}
}

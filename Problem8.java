import java.util.*;
class Problem8{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int Base = sc.nextInt();
		int Exponent = sc.nextInt();
		
		double Power = Math.pow(Base, Exponent);
		
		System.out.print(Power);
	}
}
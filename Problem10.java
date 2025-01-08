import java.util.*;
class Problem10{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int Kilometers = sc.nextInt();
		
		double Miles = Kilometers * 0.621;
		
		System.out.print(Miles);
	}
}
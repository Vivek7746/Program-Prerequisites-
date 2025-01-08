import java.util.*;
class Problem7{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int Length = sc.nextInt();
		int Width = sc.nextInt();
		
		int Perimeter = 2 * (Length + Width);
		
		System.out.print(Perimeter);
	}
}
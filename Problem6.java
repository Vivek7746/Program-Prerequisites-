import java.util.*;
class Problem6{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int Principal = sc.nextInt();
		int Rate = sc.nextInt();
		int Time = sc.nextInt();
		int SimpleInterest = (Principal * Rate * Time)/100;
		
		System.out.print(SimpleInterest);
	}
}
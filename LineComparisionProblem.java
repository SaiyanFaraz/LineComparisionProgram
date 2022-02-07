import java.lang.Integer;
import java.util.Scanner;

public class LineComparisionProblem {
	public Integer compareLines(int x1,int x2, int y1, int y2, int p1, int p2, int q1, int q2)
	{
		Integer lengthOfLine1;
		Integer lengthOfLine2;
		
		System.out.println("Point1 of line1 is at: "+(x1+","+y1));
		System.out.println("Point2 of line1 is at: "+(x2+","+y2));
		System.out.println("Point1 of line2 is at: "+(p1+","+q1));
		System.out.println("Point2 of line3 is at: "+(p2+","+q2));
		lengthOfLine1= (int)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		lengthOfLine2= (int)Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
		System.out.println("The lenghth of line1 is: "+lengthOfLine1);
		System.out.println("The lenghth of line2 is: "+lengthOfLine2);
		
		if(lengthOfLine1.equals(lengthOfLine2))
		{
			System.out.println("The lines are equal");
		}
		else
		{
			System.out.println("The Lines are not equal");
		}
		
		Integer comparision= Integer.compare(lengthOfLine1,lengthOfLine2);
		if(comparision==0)
		{
			System.out.println("Line1 is equal to Line2 through comparision");
		}
		else if(comparision==1)
		{
			System.out.println("Line1 is greater than Line2 through comparision");
		}
		else
		{
			System.out.println("Line1 is lesser than line 2 through comparision");
		}

	}
	
	public static void main(String[] srgs)
	{
		System.out.println("Welcome to Line Comparison Computation Program");
		
		System.out.println("Enter the co ordinates of Line-1 an Line-2");
		Scanner input = new Scanner(System.in);
				int x1 = input.nextInt();
				int x2 = input.nextInt();
				int y1 = input.nextInt();
				int y2 = input.nextInt();
				int p1 = input.nextInt();
				int p2 = input.nextInt();
				int q1 = input.nextInt();
				int q2 = input.nextInt();
		LineComparisionProblem object1 = new LineComparisionProblem();
		
		object1.compareLines(x1, x2, y1, y2, p1, p2, q1, q2);
	}
}
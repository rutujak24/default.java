/*Assignment: Once lived an old Painter in old town road. The painter used to get dozens of orders daily for painting rectangular sheets. 
He needed to find out how much paint will be required for a particular sheet if the paint used per cm square is 1ml. 
So GrowIND tried to solve his problem through an application where he can enter the dimensions of rectangular sheets 
and will know how much paint he will need in total for that sheet. Write a program for this application in java?
*/

import java.util.*;

public class painter
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of the Rectangle in cm");
		float length = sc.nextFloat();
		
		System.out.println("Enter the Breadth of the Rectangle in cm");
		float breadth = sc.nextFloat();
		
		double area = length* breadth;
		System.out.println("The paint required for this Rectangle is "+area+ " ml");
		
	}
}

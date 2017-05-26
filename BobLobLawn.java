

package BobLobLawn;
import java.util.*;

public class BobLobLawn {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	
		System.out.println("Enter the length in yards: ");
		
		while(!s.hasNextDouble()){
			System.out.println("wrong data type. enter a valid numberfor length");
			s.nextDouble();
		}
		double yardLength= s.nextDouble();
		
		System.out.println("Enter the width in yards: ");
		while(!s.hasNextDouble()){
			System.out.println("wrong data type. enter a valid number for width");
			s.nextDouble();
		}
		double yardWidth= s.nextDouble();
		
		double yardArea= yardLength * yardWidth;
		double time= yardArea / 20;
		
		System.out.println("The length is: "+ yardLength+ " yards");
		System.out.println("The width is: "+ yardWidth + " yards");
		System.out.println("The area of yard is: "+ yardArea + " square yards");
		if (time>=60){
			double hourTime=time/60;
			System.out.println("The time it will take to mow is: "+ hourTime + " hours");
		}else{
			System.out.println("The time it will take to mow is "+ time + "minutes");
		}
		s.close();
		
	}

}

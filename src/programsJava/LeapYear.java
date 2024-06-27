package programsJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//count the number of leap years in between 2 dates
		
		String toDate;
		String fromDate;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter end year");
		toDate = scan.nextLine();
		System.out.println("Enter beginning year");
		fromDate = scan.nextLine();
		//int total_leap_years= countLeapYears(toDate,fromDate);
		//System.out.println("total number of leap years between " + fromDate + " to " + toDate+ " is: " +  total_leap_years +" years.");	
		 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

		//see if a given year is leap year or not
		/*System.out.println("Enter the year to check if it is leap year");
		Scanner scan = new Scanner(System.in);
		String check_year = scan.nextLine();
		int year = Integer.valueOf(check_year);
		boolean leap_year_check = checkIfYearIsLeap(year);
		if(leap_year_check==true)
		{
			System.out.println("Its a leap year");
		}
		else {
			System.out.println("Its not a leap year");
		}
		*/

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		//Print all leap years between a range
		List LeapYears=  leapYearRange(fromDate, toDate);
		System.out.println("Leap years are: " +LeapYears);
	}		
	
	
	
	private static List<Integer> leapYearRange(String fromDate, String toDate) {
		// TODO Auto-generated method stub
		int start_year = Integer.valueOf(fromDate);
		int end_year = Integer.valueOf(toDate);
		List<Integer> li = new ArrayList<Integer>();
		for (int i= start_year; i<= end_year; i++) {
			if(i%4==0) {
				if(i%100==0 && i%400==0) {
					li.add(i);
				}
				else if(i%100!=0) {
					li.add(i);
				}
			}
		}
		return li;
	}
	
 	private static boolean checkIfYearIsLeap(int year) {
		// TODO Auto-generated method stub
		int flag =1;

		if(year%4==0) {
			if(year%100==0 && year%400==0) {

				flag =1;
			}

			else if(year%100==0 && year%400!=0) {

				flag = 0;
			}
			else if(year%100!=0) {

				flag = 1;
			}
		}
		else {

			flag =0;
		}

		if (flag==0)
			return false;
		else
			return true;

	}

	public static int countLeapYears(String toDate, String fromDate) {
		// TODO Auto-generated method stub
		int begin_date = Integer.valueOf(fromDate);
		int last_date = Integer.valueOf(toDate);		
		int numberOfYears = last_date-begin_date;
		System.out.println(numberOfYears);
		int total_leap_years = numberOfYears/4;
		return  total_leap_years;		
	}

}

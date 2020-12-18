package US;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		complaints C = new complaints();
		
		ArrayList<DataGiven> list = new ArrayList<>();
		
		list = C.readCsv(list);
		
	
		int ans;
		
		Display_Data data = new Display_Data();
		do {
			
		
		System.out.println("Welcome..!! \n Choose any one option to display complaints:>");
		System.out.println("1. Display Based on the year provided by the user.");
		System.out.println("2. Display based on the Name of the Bank.");
		System.out.println("3. Display based on the complaint Id given by user.");
		System.out.println("4. Display Complaints based on the no. of days bank took to resolve");
		System.out.println("5. Display the complaints which is closed with explanation.");
		System.out.println("6. Display Complaints which have timely response.");
		System.out.println("7. Hit 7 if you want to enter the data.");
		
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice)
		{
		case 1:
			data.displayBasedOnYearProvided(list);
			break;
		case 2:
			data.displayBasedOnBankProvided(list);
			break;
		case 3:
			data.displayBasedOnComplaintIdProvided(list);
			break;
		case 4:
			data.displayNumberOfDaysBankTook(list);
			break;
		case 5:
			data.displayClosedWithExplaination(list);
			break;
		case 6:
			data.displayHavingTimelyResponse(list);
			break;
		case 7:
		{
			System.out.println("Enter the data (Supported format is (dd/mm/yyyy)) :>");
			String date = sc.nextLine();
			System.out.println("Enter the Product :>");
			String prod = sc.nextLine();
			System.out.println("Enter the Sub-Product :>");
			String sprod = sc.nextLine();
			System.out.println("Enter the Issue :>");
			String issue = sc.nextLine();
			System.out.println("Enter the Sub-issue :>");
			String subissue = sc.nextLine();
			System.out.println("Enter the Company :>");
			String company = sc.nextLine();
			System.out.println("Enter the State :>");
			String state = sc.nextLine();
			System.out.println("Enter the Zip code :>");
			String zipcode = sc.nextLine();
			System.out.println("Submitted  via:>");
			String  subvia= sc.nextLine();
			System.out.println("Enter the Date Sent to company:>");
			String datetocomp = sc.nextLine();
			System.out.println("Enter the Company Response :>");
			String compresp = sc.nextLine();
			System.out.println("Enter the Timely Response :>");
			String timeresp = sc.nextLine();
			System.out.println("Enter the Consumer Disputed :>");
			String consumerdesp = sc.nextLine();
			System.out.println("Enter the Complaint Id :>");
			String compid = sc.nextLine();
			
//			com.opencsv.CSVWriter FW =null;
//			try {
//				FW = new com.opencsv.CSVWriter(new FileWriter("C:\\\\\\\\Users\\\\\\\\TEMP\\\\\\\\Desktop\\\\\\\\complaint.csv",true));
//				String[] Append= {date,prod,sprod,issue,subissue,company,state,zipcode,subvia,datetocomp,compresp,timeresp,consumerdesp,compid};
//				
//				FW.writeNext(Append);
//				FW.flush();
//				
//				System.out.println("Data Inserted...!!!");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}finally {
//				try {
//					FW.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//			}
//			
		}
		break;
		default:
			System.out.println("Wrong Input. Start from the beginning Sir.");
		}
		
		System.out.println("Do you want to continue \n if yes press 1 otherwise press 0?");
		ans = sc.nextInt();
		sc.nextLine();
		
	}while(ans==1);

}
	
	
	
}

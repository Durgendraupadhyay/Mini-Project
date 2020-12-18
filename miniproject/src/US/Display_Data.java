package US;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Display_Data {

	Scanner sc = new Scanner(System.in);
	
	public void displayBasedOnYearProvided(ArrayList<DataGiven> list)
	{
		
		DataGiven D=null;
		
		System.out.println("Enter the year:>");
		int year =sc.nextInt();
		
		sc.nextLine();
		
		int y=0;
		int flag=0;
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			D =(DataGiven)itr.next();
			
			SimpleDateFormat F = null;
			String S= D.getDateRecieved();
			if(S.contains("/"))
				F = new SimpleDateFormat("mm/dd/yyyy");
			else
				F = new SimpleDateFormat("dd-mm-yyyy");
			
			try
			{
				 Date date = F.parse(S);
				 
				 Calendar cal = new GregorianCalendar();
				 cal.setTime(date);
				 
				 y= cal.get(Calendar.YEAR);
				 
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			if(y==year)
			{
				System.out.println(D.getDateRecieved()+" "+ D.getProduct()+" "+ D.getSubProduct()+" "+ D.getIssue()+" "+
									D.getSubIssue()+" "+D.getCompany()+" "+D.getState()+" "+D.getZipCode()+" "+D.getSubProduct()
									+" "+D.getDateSentToComp()+" "+D.getCompanyResponse()+" "+D.getTimelyResponse()+" "+D.getConsumerDisputed()
									+" "+D.getComplaintID());
				flag=1;
				
			}
			
			
		}
		if (flag==0)
		{
			System.out.println("No such complaint Record present for year "+year);
		}
					
	}
	
	
	public void displayBasedOnBankProvided(ArrayList<DataGiven> list)
	{
		DataGiven D= null;
		
		System.out.println("Enter the Bank Name:>");
		String bankName = sc.nextLine();
		
		int flag=0;
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			D = (DataGiven)itr.next();
			if(D.getCompany().equals(bankName))
			{
				System.out.println(D.getDateRecieved()+" "+ D.getProduct()+" "+ D.getSubProduct()+" "+ D.getIssue()+" "+
						D.getSubIssue()+" "+D.getCompany()+" "+D.getState()+" "+D.getZipCode()+" "+D.getSubProduct()
						+" "+D.getDateSentToComp()+" "+D.getCompanyResponse()+" "+D.getTimelyResponse()+" "+D.getConsumerDisputed()
						+" "+D.getComplaintID());
				
				
				flag=1;
		
			}
		}
		if(flag==0)
		{
			System.out.println("No such complaint Record present for bank named :> "+ bankName);
		}
	}
	
	
	
	
	public void displayBasedOnComplaintIdProvided(ArrayList<DataGiven> list)
	{
		DataGiven D = null;
		
		System.out.println("Enter the complaint ID :>");
		String id = sc.nextLine();
		
		
		int flag = 0;
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			D = (DataGiven)itr.next();
			if(D.getComplaintID().equals(id))
			{
				System.out.println(D.getDateRecieved()+" "+ D.getProduct()+" "+ D.getSubProduct()+" "+ D.getIssue()+" "+
						D.getSubIssue()+" "+D.getCompany()+" "+D.getState()+" "+D.getZipCode()+" "+D.getSubProduct()
						+" "+D.getDateSentToComp()+" "+D.getCompanyResponse()+" "+D.getTimelyResponse()+" "+D.getConsumerDisputed()
						+" "+D.getComplaintID());
				
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("No such complaint record present for the complaint ID :> "+ id);
		}
		
	}
	
	
	
	
	
	public void displayNumberOfDaysBankTook(ArrayList<DataGiven> list)
	{
		DataGiven D = null;
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			D=(DataGiven)itr.next();
			
			SimpleDateFormat F = null;
			String S1 = D.getDateRecieved();
			String S2 = D.getDateSentToComp();
			
			if(S1.contains("/") && S2.contains("/"))
			{
				F = new SimpleDateFormat("mm/dd/yyyy",Locale.ENGLISH);
			
				try
				{
					Date d1 = F.parse(S1);
					Date d2 = F.parse(S2);
					
					long diff = Math.abs(d2.getTime()-d1.getTime());
					long diff1 = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
					
					System.out.println(D.getCompany()+" "+D.getIssue()+" "+diff1);
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			if(S1.contains("-") && S2.contains("-"))
			{
				F = new SimpleDateFormat("dd-mm-yyyy",Locale.ENGLISH);
			
				try
				{
					Date d1 = F.parse(S1);
					Date d2 = F.parse(S2);
					
					long diff = Math.abs(d2.getTime()-d1.getTime());
					long diff1 = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
					
					System.out.println(D.getCompany()+" "+D.getIssue()+" "+diff1);
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
	
	public void displayClosedWithExplaination(ArrayList<DataGiven> list)
	{
		DataGiven D = null;
		
		int flag = 0;
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			D = (DataGiven)itr.next();
			
			if(D.getCompanyResponse().equals("Closed with explanation"))
			{
				System.out.println(D.getDateRecieved()+" "+ D.getProduct()+" "+ D.getSubProduct()+" "+ D.getIssue()+" "+
						D.getSubIssue()+" "+D.getCompany()+" "+D.getState()+" "+D.getZipCode()+" "+D.getSubProduct()
						+" "+D.getDateSentToComp()+" "+D.getCompanyResponse()+" "+D.getTimelyResponse()+" "+D.getConsumerDisputed()
						+" "+D.getComplaintID());
				
				
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("None of the complaints are closed with an explaination");
		}
	}
	
	
	
	
	
	public void displayHavingTimelyResponse(ArrayList<DataGiven> list)
	{
		DataGiven D =null;
		
		int flag = 0;
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			D = (DataGiven)itr.next();
			if(D.getTimelyResponse().equals("Yes"))
			{
				
				System.out.println(D.getDateRecieved()+" "+ D.getProduct()+" "+ D.getSubProduct()+" "+ D.getIssue()+" "+
						D.getSubIssue()+" "+D.getCompany()+" "+D.getState()+" "+D.getZipCode()+" "+D.getSubProduct()
						+" "+D.getDateSentToComp()+" "+D.getCompanyResponse()+" "+D.getTimelyResponse()+" "+D.getConsumerDisputed()
						+" "+D.getComplaintID());
				
				
				flag = 1;
				
			}
		}
		if(flag==0)
		{
			System.out.println("No such complaint with timely response");
		}
		
	}
	
	


}

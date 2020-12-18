package US;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class complaints {

	//private String filePath = "C:\\Users\\TEMP\\Desktop\\complaint.csv";
	
	public ArrayList<DataGiven> readCsv(ArrayList<DataGiven> list)
	{
	BufferedReader reader = null;
	
	String line = "";
	int i=0;
	try
	{
		//List<complaints> data = new ArrayList<complaints>();
		
		
		reader = new BufferedReader(new FileReader("C:\\\\Users\\\\TEMP\\\\Desktop\\\\complaint.csv"));
		reader.readLine();
		
		while((line = reader.readLine()) != null)
		{
			String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)",-1);
			if(fields.length > 0)
			{
				list.add(new DataGiven(fields[0],fields[1],fields[2],fields[3],fields[4],fields[5],fields[6],fields[7],fields[8],fields[9],fields[10],fields[11],fields[12],fields[13]));
				
			}
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	finally 
	{
		try {
				reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	return list;
	}

}



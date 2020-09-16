package troubleShootSearch.util;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.File;


public class FileProcessor 
{	
	//public String[] strValues=new String[3];
	//public String[] strValues1=new String[4];
	public ArrayList<String> strValues= new ArrayList<String>();  
	public ArrayList<String> strValues1= new ArrayList<String>();  
	
	
	
			
	public ArrayList<String> readfile1(String input)  
	{
	//	ArrayList<String> ret = new ArrayList<String>(); 
			//CITED CODE https://www.journaldev.com/709/java-read-file-line-by-line
		
		//int i=0;
		
		
		
		File f = new File(input);
		if(f.exists() )
		{

			
		}
		else
		{
			MyLogger ml=new MyLogger();
					ml.setDebugValue(5);
					ml.writeMessage(" FILE DOES NOT EXISTS ",MyLogger.DebugLevel.FileDoesNotExists);
			
		}
		
		BufferedReader reader;
		try {
					reader = new BufferedReader(new FileReader(input));
					String line = reader.readLine();
					
					
					while (line != null) 
					{
					 strValues.add(line);
			//			i++;
						//input.add("hi");
						//input.add(line);

						line = reader.readLine();
					}

		//	ArrayList<String> infile = new ArrayList<String>(Arrays.asList(strValues)); 
			//ret=infile;
	
		reader.close();
			
			} catch (IOException e) 
				{
					MyLogger ml=new MyLogger();
					ml.setDebugValue(4);
					ml.writeMessage(" IO EXCEPTION ",MyLogger.DebugLevel.FILE_PROCESSOR);
				}
				finally
				{
					
				}
		return strValues; 
		

	}






		public ArrayList<String> get_technicalInfo(String Technical_Info)
	 {
		 
		
		int i=0;
		BufferedReader reader;
		try {
					reader = new BufferedReader(new FileReader(Technical_Info));
					String line = reader.readLine();
					
					
					while (line != null) 
					{
					 strValues1.add(line);

						
						line = reader.readLine();
					}
					
				reader.close();
			
			} catch (IOException e) 
				{
					MyLogger ml=new MyLogger();
					ml.setDebugValue(4);
					ml.writeMessage(" IO EXCEPTION ",MyLogger.DebugLevel.FILE_PROCESSOR);
				}
				finally
				{
					
				}

			
	
			return strValues1;
	 }



	
	
}



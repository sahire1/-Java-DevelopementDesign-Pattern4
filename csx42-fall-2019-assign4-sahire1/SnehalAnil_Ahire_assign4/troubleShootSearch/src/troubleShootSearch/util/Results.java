package troubleShootSearch.util;
import java.io.FileWriter;  
import troubleShootSearch.visitor.Visitor1;
import troubleShootSearch.visitor.Visitor2;
import troubleShootSearch.visitor.Exact_Match;
import troubleShootSearch.visitor.Semantic_Match;
import troubleShootSearch.visitor.Naive_Stemming;
import java.util.ArrayList;
import troubleShootSearch.util.Populate;

public class Results implements FileDisplayInterface,StdoutDisplayInterface{
	//{
	
	int level;
	public void getargs5(String in)
	{//level=in;
		 level = Integer.parseInt(in);
		//System.out.println(level);
	}
	
	
	//To write in a file
	public void write(String nameIn,Exact_Match Exact_Match_Visitor,Semantic_Match Semantic_Match_Visitor,Naive_Stemming Naive_Stemming_Visitor,Populate p)
	{
		
		try{    
           FileWriter fw=new FileWriter(nameIn);   
			//fw.write(so[0].sid+":");	
			int input_no=0,no=0,no_copy=0;
		for(String i:p.comparekaro)
		{
		fw.write("user input -"+i+"\n");
		fw.write("Exact Match"+"\n");
		fw.write("-----------"+"\n");
		fw.write(Exact_Match_Visitor.res1.get(input_no)+"\n");
		fw.write("Naive Stemming Match"+"\n");
		fw.write("-----------"+"\n");
		if(p.count_keeper[input_no]==0)
				{
					fw.write("No naive stemming match"+"\n");
				}
				else
					fw.write("Word Count ="+p.count_keeper[input_no]+"\n");
				
				//while(p.count_keeper[input_no]!=no)
				for(int k=0;k<p.count_keeper[input_no];k++)
				{
					fw.write(Naive_Stemming_Visitor.Naive_Stemming_lineNumbersFoundIn.get(no)+1);
					fw.write("\n");
					no++;
					//no_copy=no;
				}
		
		
		fw.write("Semantic Match"+"\n");
		fw.write("-----------"+"\n");
		fw.write(Semantic_Match_Visitor.res.get(input_no)+"\n");
		
		
		input_no++;
		
		}
			
           fw.close();    
          }catch(Exception e){System.out.println(e);} 
		
		
	}	
	
	//To write to standard output
	public void write1(Exact_Match Exact_Match_Visitor,Semantic_Match Semantic_Match_Visitor,Naive_Stemming Naive_Stemming_Visitor,Populate p)
	{
		//System.out.println("hit -"); //ArrayList<String> comparekaro,int[] count_keeper
		//Populate p=new Populate();
					MyLogger ml=new MyLogger();
					ml.setDebugValue(level);
					
		
		int input_no=0,no=0,no_copy=0;
		for(String i:p.comparekaro)
		{
			//no=0;
			//no=no_copy++;
			ml.writeMessage("user input -"+i,MyLogger.DebugLevel.Results);
			
		//System.out.println("user input -"+i);
		
		ml.writeMessage("Exact Match",MyLogger.DebugLevel.Results);
			//System.out.println("Exact Match");
			
		ml.writeMessage("-----------",MyLogger.DebugLevel.Results);
		//System.out.println("-----------");
		ml.writeMessage(Exact_Match_Visitor.res1.get(input_no),MyLogger.DebugLevel.Results);
		//System.out.println(Exact_Match_Visitor.res1.get(input_no));
		
		ml.writeMessage("Naive Stemming Match",MyLogger.DebugLevel.Results);
		//System.out.println("Naive Stemming Match");
		
		ml.writeMessage("-----------",MyLogger.DebugLevel.Results);
		//System.out.println("-----------");
		//for(int i=0;i<p.count_keeper.length;i++)
		//{
				if(p.count_keeper[input_no]==0)
				{
					ml.writeMessage("No naive stemming match",MyLogger.DebugLevel.Results);
				}
				else
					ml.writeMessage("Word Count ="+p.count_keeper[input_no],MyLogger.DebugLevel.Results);
				
				//while(p.count_keeper[input_no]!=no)
				for(int k=0;k<p.count_keeper[input_no];k++)
				{
					//ml.writeMessage(""+Naive_Stemming_Visitor.Naive_Stemming_lineNumbersFoundIn.get(no)+1,MyLogger.DebugLevel.Results);
					ml.writeMessage("Line Numbers =",MyLogger.DebugLevel.Results);
					System.out.println(Naive_Stemming_Visitor.Naive_Stemming_lineNumbersFoundIn.get(no)+1);
					no++;
					//no_copy=no;
				}
		//}
		
		ml.writeMessage("Semantic Match",MyLogger.DebugLevel.Results);
		ml.writeMessage("-----------",MyLogger.DebugLevel.Results);
		ml.writeMessage(Semantic_Match_Visitor.res.get(input_no),MyLogger.DebugLevel.Results);
		
		
		input_no++;
		
		}
	}
	
}

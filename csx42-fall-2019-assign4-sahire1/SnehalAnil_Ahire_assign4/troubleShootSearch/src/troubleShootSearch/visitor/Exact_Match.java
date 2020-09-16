package troubleShootSearch.visitor;
import troubleShootSearch.util.FileProcessor;
import troubleShootSearch.Structure.Tree;
import troubleShootSearch.Structure.Arrlist;
import java.util.ArrayList;
import java.util.Arrays;

public class Exact_Match implements Visitor1
{
	public String[] infile=new String[]{""};
	
	public String currentres;
	public ArrayList<String> res1= new ArrayList<String>();
			/*public String getres()
			{
				return res1;
			}
			*/
   public void visit1(Arrlist A_Object,String j)
    {
		
		/*
		System.out.println("infile");
		for(String i:A_Object.infile)
		{
			
			System.out.println(i);
		}
		System.out.println("arr_values");
		for(String i:A_Object.arr_values)
		{
			System.out.println(i);
		}
		
		*/
		int check=0;
		for(String i:A_Object.arr_values)
		{
				
					if(i.contains(j))
					{
						currentres=i;
						res1.add(i);
						check=1;
					//	System.out.println("Exact_Match");
					//	System.out.println("arr_values"+i);
					}
					
					
				
		}
		if(check==0)
		{
			res1.add("No exact match");
			currentres="No exact match";
		}
		
		
    }
   

}
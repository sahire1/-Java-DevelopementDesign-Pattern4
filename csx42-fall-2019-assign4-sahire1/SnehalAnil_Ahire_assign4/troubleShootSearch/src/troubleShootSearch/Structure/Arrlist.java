package troubleShootSearch.Structure;
import java.util.ArrayList; 
import java.util.Arrays;
import troubleShootSearch.visitor.Visitor1;
public class Arrlist 
{
	public ArrayList<String> arr_values = new ArrayList<String>();  
    //public ArrayList<String> infile = new ArrayList<String>(); //tech
	public ArrayList<String> arr_from_sematic_match = new ArrayList<String>();
	
	public ArrayList<String> syn = new ArrayList<String>();
	public void add_arraylist(String addIn)
    {
		      arr_values.add(addIn);

         // ArrayList<String> arr_values = new ArrayList<String>(Arrays.asList(infileIn)); 
          //ret=arr_values;
		 
    }
	
    public void add_arraylist1(String addIn)
    {
		arr_from_sematic_match.add(addIn);
		
	}
	
	public void set_syn(String syn_fileIn)
    {
         // infile= new ArrayList<String>(Arrays.asList(infileIn)); 
          //ret=arr_values;
		  syn.add(syn_fileIn);
		  
    }
	
    public void accept(Visitor1 visitor,String j)
     {
		
    		visitor.visit1(this,j);
			//okay for this
   	}
}
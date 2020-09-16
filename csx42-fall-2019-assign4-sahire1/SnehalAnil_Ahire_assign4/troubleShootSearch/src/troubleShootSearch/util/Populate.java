package troubleShootSearch.util;
import troubleShootSearch.util.FileProcessor;
import troubleShootSearch.Structure.Arrlist;
import troubleShootSearch.visitor.Visitor1;
import troubleShootSearch.visitor.Visitor2;
import troubleShootSearch.Structure.Tree;
import troubleShootSearch.visitor.Naive_Stemming;
import java.util.ArrayList; 

public class Populate 
{	
    public Arrlist a=new Arrlist();
	public Arrlist b =new Arrlist();
	public Tree[] t=new Tree[1800];
	public ArrayList<String> comparekaro = new ArrayList<String>();
	//public Tree tr=new Tree();
	
	public String store;
	public int[] count_keeper=new int[80];
	
	public int check;
	public int count;
	
	public void start_populate(String args0)
	{
		//tech
		FileProcessor f=new FileProcessor();
		 ArrayList<String> infile = new ArrayList<String>();
		//String[] infile=new String[]{""};
		
 
  
		infile=f.readfile1(args0);
		
		
		for(int i=0;i<infile.size();i++)
		{
			a.add_arraylist(infile.get(i));
			
			//System.out.println("putting"+infile.get(i));
		}
		
		
		
	}
	public void populate_from_semant_match(String in)
	{
		a.add_arraylist1(in);
	}
	public Arrlist return_semantic_match()
	{
		return b;
	}
	
	
	public void setsyn(String args2)
	{
		FileProcessor f=new FileProcessor();
		//String[] syn_file=new String[]{""};
		 ArrayList<String> syn_file = new ArrayList<String>();
		syn_file=f.readfile1(args2);
		
		
		for(int i=0;i<syn_file.size();i++)
		{
			String[] l1 = syn_file.get(i).split(" ");
				for(int j=0;j<l1.length;j++)
				{
					//System.out.println(l1[j]);
					a.set_syn(l1[j]);
				}
		}
		
		/*
		for(String i:a.syn)
		{
			System.out.println("syn"+i);
		}
		*/
	}
	
	
	
	public void callaccept(Visitor1 visitor)
	{
		//FileProcessor f=new FileProcessor();
		
		//technical info
		//ArrayList<String> infile = new ArrayList<String>();
  
		//infile=f.readfile1(args1);
		//for(int i=0;i<infile.size();i++)
		//{
			for(String j:comparekaro)
					{
						
						//System.out.println("j thing"+j);
						a.accept(visitor,j);
					}
		//}
		
		
		
	}
	
	public void start_populate_tree(String args0)
	{
		FileProcessor f=new FileProcessor();
		
		//technical info
		ArrayList<String> infile = new ArrayList<String>();
  
		infile=f.readfile1(args0);
		store=args0;
		
		for(int i=0;i<infile.size();i++)
		{
			t[i]=new Tree();
			String[] l1 = infile.get(i).split(" ");
				for(int j=0;j<l1.length;j++)
				{
					//System.out.println("tree no"+i);
					//System.out.println(l1[j]);
					//t[i].lineNumbersFoundIn.add(i);
					//tree no is line no
					t[i].insert(t[i],l1[j],i);
				}
		}
		
		
	}
	
	
	public void read_input(String args1)
	{
		FileProcessor f=new FileProcessor();
		
		
		//ArrayList<String> infile = new ArrayList<String>();
  
		comparekaro=f.readfile1(args1);
		
	}
	
	
	
	public void callaccept2(Visitor2 visitor)
	{
		FileProcessor f=new FileProcessor();
		
		//technical info
		ArrayList<String> infile = new ArrayList<String>();
  
		infile=f.readfile1(store);
		
			
						 
						 //System.out.println("count from p itself"+count);
						
						int c=0;check=0;
						for(String j:comparekaro) //USER iNPUT
						{ count=0;
									String[] l2 = j.split(" ");
										for(int i=0;i<infile.size();i++) //TECH
												{
															//count=0;
															
																 
																
																int ret=t[i].accept(visitor,l2[0]);
																if(ret==1)
																{
																	count++;
																	check=1;
																}
																
																	
																
												}
												count_keeper[c++]=count;
												
												//count here
												//System.out.println("count"+count)
			
						}
					
	
	}
	

	
	
}



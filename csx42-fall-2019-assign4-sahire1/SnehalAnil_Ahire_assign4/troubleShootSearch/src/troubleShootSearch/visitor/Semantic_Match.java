package troubleShootSearch.visitor;
import troubleShootSearch.Structure.Tree;
import troubleShootSearch.Structure.Arrlist;
import java.util.ArrayList;
import troubleShootSearch.util.Populate;
//import troubleShootSearch.visitor.Exact_Match;

public class Semantic_Match implements Visitor1
{
	//String res;
	public ArrayList<String> res= new ArrayList<String>();
	
   public void visit1(Arrlist A_Object,String a)
    {
		
		
		
		
			String last=a;
			//System.out.println("new		");
			String[] l2 = last.split(" ");
			//System.out.println(l2.length);
			/*
			for(int z=0;z<l2.length;z++)
							{ System.out.println("l2"+l2[z]);
							}
							*/
			int store=-1;
			int check=0;
			String rakh="";
				for(String j:A_Object.syn)
				{
					
					String[] l1 = j.split("=");
					System.out.println(l1.length);
					for(int k=0;k<l1.length;k++)
							{
								
								
												if(l1[k].contains(l2[1]))
												{
													
													store=k;
													if(k==0)
													{
														rakh=l1[1];
													}
													check=1;
												}
												
												/*
												else
												{
													res.add("No semantic match");
													//break;
												}
												*/
												
							}
							
							Exact_Match Exact_Match_Visitor=new Exact_Match();
							if((store==0) || (store==1))
							{
								//A_Object.arr_values.remove(A_Object.arr_values.size()-1);
								String temp=new String();
								if(store==0)
								{
								 temp=l2[0]+" "+rakh;
								}
								else
									temp=l2[0]+" "+l1[0];
								
								
								
								
								Exact_Match_Visitor.visit1(A_Object,temp);
								
								if(Exact_Match_Visitor.currentres.equals("No exact match"))
								{
									res.add("No semantic match");
									//System.out.println("Exact_Match_Visitor.getres()"+Exact_Match_Visitor.getres());
								}
								else
								{
									res.add(Exact_Match_Visitor.currentres);
									//System.out.println("res"+res);
								}
							}
							
				}
				if(check==0)
				{
					res.add("No semantic match");
				}
		//}
		
    
    }
   
}
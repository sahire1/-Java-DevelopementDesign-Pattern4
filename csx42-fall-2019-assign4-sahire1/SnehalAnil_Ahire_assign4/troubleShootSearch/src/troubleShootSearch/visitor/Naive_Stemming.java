package troubleShootSearch.visitor;
import troubleShootSearch.Structure.Tree;
import java.util.ArrayList;
//import java.util.HashMap;
import troubleShootSearch.Structure.Tree.TreeNode;
import troubleShootSearch.util.Populate;
import java.util.HashMap;
import troubleShootSearch.util.MyLogger;


public class Naive_Stemming implements Visitor2
{
	int c;
	//String res2;
	//int count;
  public ArrayList<Integer> Naive_Stemming_lineNumbersFoundIn= new ArrayList<Integer>(); //according to count see this
  
  public ArrayList<String> res2= new ArrayList<String>();
  
  
  
  
    public int visit(Tree T_Object,String j)
    {
		int ret=0;
		if(T_Object.root==null)
			{
				//System.out.println("null");
				//cannt be
				MyLogger ml=new MyLogger();
					ml.setDebugValue(3);
					ml.writeMessage("Please populate the tree before visiting, EMPTY FILE PROVIDED",MyLogger.DebugLevel.EMPTY_INPUT);
			}
			else
			{
				TreeNode traverse=T_Object.root; 
						while (traverse.next != null)
						{ String in1=traverse.data;
							//System.out.println("traverse.data"+traverse.data);
							String in2=j;
							//System.out.println("j"+j);
							if(in1.length()>3 && in2.length()>3)
							{
							//System.out.println("in1"+in1);
							//System.out.println("in2"+in2);
									in1=in1.substring(0,3);
									in2=in2.substring(0,3);
									if(in1.equals(in2))
									{
										if(traverse.data.equals(j))
										{
											
										}
										else
										{
											
											for(Integer i:traverse.lineNumbersFoundIn)
													{
													//System.out.println("line no"+i);
													
													Naive_Stemming_lineNumbersFoundIn.add(i);
													}
													
													return 1;
										}
										
										
									}

							}
							
							
							

							
									traverse = traverse.next; 
									
						}
				
			}
		
		
		//prev_j=j;
		
		
			return ret;		
    }
	
		

	

}
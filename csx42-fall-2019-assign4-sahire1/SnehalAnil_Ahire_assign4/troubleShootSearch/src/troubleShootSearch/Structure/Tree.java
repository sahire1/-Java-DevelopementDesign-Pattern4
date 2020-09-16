package troubleShootSearch.Structure;
import troubleShootSearch.visitor.Visitor2;
import troubleShootSearch.Structure.Tree;
import java.util.Iterator; 
import java.util.HashMap;
import java.util.Map; 
import java.util.ArrayList; 

public class Tree 
{
	
	
	public class TreeNode 
	{
		public String data;
		public TreeNode next;
		public ArrayList<Integer> lineNumbersFoundIn= new ArrayList<Integer>();
		public TreeNode(String d)
			{
				data=d;
			}
		public int count;
	}
	//String n=new String();
	//n="null";
	public TreeNode root=new TreeNode("empty");
	
	
	
	
	
	
    public void insert(Tree t,String word,int i) {
        //HashMap<String, TreeNode> children = root.getChildren();
      // set linenumbers
	  
		  TreeNode temp=new TreeNode(word); 
		  temp.lineNumbersFoundIn.add(i);
		  temp.next=null;
		   //temp.lineNumbersFoundIn.add(i);
		  if(t.root.data.equals("empty"))
		  {
			 t.root= temp; 
			// t.lineNumbersFoundIn.add(i);
			 //System.out.println("putroot");
		  }
		  else
		  {
			  TreeNode traverse =t.root; 
            while (traverse.next != null) { 
                traverse = traverse.next; 
				
            } 
  
            // Insert the new_node at last node 
           traverse.next = temp;
			//System.out.println("put");		   
		   
		  }
		   
        }

		
	
    public int accept(Visitor2 visitor,String j)
    {
    		int ret=visitor.visit(this,j);
			return ret;
   	}


}
package troubleShootSearch.util;
import troubleShootSearch.visitor.Visitor1;
import troubleShootSearch.visitor.Visitor2;
import troubleShootSearch.visitor.Exact_Match;
import troubleShootSearch.visitor.Semantic_Match;
import troubleShootSearch.visitor.Naive_Stemming;
import troubleShootSearch.util.Populate;
import java.util.ArrayList;

public interface StdoutDisplayInterface {
	//void write();
	 public void write1(Exact_Match Exact_Match_Visitor,Semantic_Match Semantic_Match_Visitor,Naive_Stemming Naive_Stemming_Visitor,Populate p); 
//ArrayList<String> p,int[] count_keeper

}

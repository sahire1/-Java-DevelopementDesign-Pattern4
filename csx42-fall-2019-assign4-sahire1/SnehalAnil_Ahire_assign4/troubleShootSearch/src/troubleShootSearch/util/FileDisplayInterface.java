package troubleShootSearch.util;
import troubleShootSearch.visitor.Exact_Match;
import troubleShootSearch.visitor.Semantic_Match;
import troubleShootSearch.visitor.Naive_Stemming;
import java.util.ArrayList;


public interface FileDisplayInterface {

 public void write(String nameIn,Exact_Match Exact_Match_Visitor,Semantic_Match Semantic_Match_Visitor,Naive_Stemming Naive_Stemming_Visitor,Populate p); 



}

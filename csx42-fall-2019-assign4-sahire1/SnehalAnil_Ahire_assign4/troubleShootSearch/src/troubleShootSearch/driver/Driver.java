package troubleShootSearch.driver;

import troubleShootSearch.Structure.Arrlist;
import java.io.FileNotFoundException;
import troubleShootSearch.visitor.Exact_Match;
import troubleShootSearch.visitor.Semantic_Match;
import troubleShootSearch.visitor.Naive_Stemming;
import troubleShootSearch.visitor.Visitor1;
import troubleShootSearch.visitor.Visitor2;
import troubleShootSearch.Structure.Tree;
import troubleShootSearch.util.Populate;
import troubleShootSearch.util.Results;
import troubleShootSearch.util.MyLogger;
public class Driver {
	//create a waitlist 
	//public String waitlist=new String();
	public static void main(String[] args) throws FileNotFoundException {

		
		if (args.length != 5 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}") || args[3].equals("${arg3}") || args[4].equals("${arg4}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 5 argumnets.");
			System.exit(0);
		}
		/*
		technicalInfo.txt
userInfo.txt
synonyms.txt
output.txt
		*/
		
		
		Populate p=new Populate();
		//Exact Match
		p.start_populate(args[0]);
		p.read_input(args[1]);
		Exact_Match Exact_Match_Visitor=new Exact_Match();
		p.callaccept(Exact_Match_Visitor);
		//Semantic Match
		
		p.setsyn(args[2]);
		Semantic_Match Semantic_Match_Visitor=new Semantic_Match();
		p.callaccept(Semantic_Match_Visitor);
		
		
		p.start_populate_tree(args[0]);
		//p.read_input(args[1]);
		Naive_Stemming Naive_Stemming_Visitor=new Naive_Stemming();
		p.callaccept2(Naive_Stemming_Visitor);
		//p.write_to_results(Naive_Stemming_Visitor);
		Results r=new Results();
		r.getargs5(args[4]);
		r.write1(Exact_Match_Visitor,Semantic_Match_Visitor,Naive_Stemming_Visitor,p);
		r.write(args[3],Exact_Match_Visitor,Semantic_Match_Visitor,Naive_Stemming_Visitor,p);
		
		/*
		for(String i:a.ret)
		{
			System.out.println(i);
		}
		*/
		
		
	}
		

		
		
}

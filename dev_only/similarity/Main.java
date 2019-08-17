package similarity;

import java.io.IOException;
import com.github.gumtreediff.client.Run;
import com.github.gumtreediff.gen.Generators;
import com.github.gumtreediff.matchers.MappingStore;
import com.github.gumtreediff.matchers.Matcher;
import com.github.gumtreediff.matchers.Matchers;
import com.github.gumtreediff.matchers.SimilarityMetrics;
import com.github.gumtreediff.tree.ITree;

public class Main {

	public static void main (String[] args){
		Run.initGenerators();
		String file1 = "file_v0.java";
		String file2 = "file_v1.java";
		ITree src = null;
		try {
			src = Generators.getInstance().getTree(file1).getRoot();
		} catch (UnsupportedOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ITree dst = null;
		try {
			dst = Generators.getInstance().getTree(file2).getRoot();
		} catch (UnsupportedOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Matcher m = Matchers.getInstance().getMatcher(); // retrieve the default matcher
		MappingStore map = m.match(src,dst);
		System.out.println("chawatche similarity: " + String.valueOf(SimilarityMetrics.chawatheSimilarity(src, dst, map)));
		System.out.println("dice similarity: " + String.valueOf(SimilarityMetrics.diceSimilarity(src, dst, map)));
		System.out.println("jaccard similarity: " + String.valueOf(SimilarityMetrics.jaccardSimilarity(src, dst, map)));
		System.out.println("overlap similarity: " + String.valueOf(SimilarityMetrics.overlapSimilarity(src, dst, map)));
		
	}
	
}
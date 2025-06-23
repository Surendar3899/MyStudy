package check;
import org.apache.commons.text.similarity.JaroWinklerSimilarity;
public class NameMatcher {
	
	 public static void main(String[] args) {
		    System.out.println("hello");
	        JaroWinklerSimilarity similarity = new JaroWinklerSimilarity();
	        String yourName = "John Doe";
	        String ofacName = "Jon Doe";
	        double score = similarity.apply(yourName, ofacName);
	        System.out.println("Similarity Score: " + score);
	        if (score > 0.85) {
	            System.out.println("Possible match found!");
	        }
		 
	    }

}

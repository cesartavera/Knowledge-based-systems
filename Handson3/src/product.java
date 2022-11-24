package examples.clips;

import net.sf.clipsrules.jni.Environment;


public class product {

	public static void main(String s[]) throws Exception {
		Environment clips;

		clips = new Environment();
        try{
            System.out.println("Program Start");
			clips.load("src/clips/products/load-prod-cust.clp");
			clips.load("src/clips/products/load-prodcust-rules.clp");
			clips.reset();
			clips.run();
			clips.clear();
        }
		catch(Exception e) {}
	}
}
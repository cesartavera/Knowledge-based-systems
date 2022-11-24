package examples.clips;

import net.sf.clipsrules.jni.Environment;


public class market {

	public static void main(String s[]) throws Exception {
		Environment clips;

		clips = new Environment();
        try{
            System.out.println("Program Start");
			clips.load("src/clips/market/facts.clp");
			clips.load("src/clips/market/persons.clp");
			clips.load("src/clips/market/rules.clp");
			clips.load("src/clips/market/run.clp");
			clips.load("src/clips/market/templates.clp");
			clips.reset();
			clips.run();
			clips.clear();
        }
		catch(Exception e) {}
	}
}
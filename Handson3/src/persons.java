package examples.clips;

import net.sf.clipsrules.jni.Environment;


public class persons {

	public static void main(String s[]) throws Exception {
		Environment clips;

		clips = new Environment();
        try{
            System.out.println("Program Start");
			clips.load("src/clips/persons/load-persons.clp");
			clips.load("src/clips/persons/load-persons-rules.clp");
			clips.reset();
			clips.run();
			clips.clear();
        }
		catch(Exception e) {}
	}
}
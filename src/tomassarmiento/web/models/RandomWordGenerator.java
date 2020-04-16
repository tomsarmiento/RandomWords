package tomassarmiento.web.models;

import java.util.Random;

public class RandomWordGenerator {
	public String randomWordGenerator() {
		 Random r = new Random();
	      char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','\u00f1','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
	      String str = ""+abc[r.nextInt(37)]+""+abc[r.nextInt(37)]+""+abc[r.nextInt(37)]+""+abc[r.nextInt(37)]+""+abc[r.nextInt(37)]+abc[r.nextInt(37)]+""+abc[r.nextInt(37)]+""+abc[r.nextInt(37)]+""+abc[r.nextInt(37)]+""+abc[r.nextInt(37)]+"";
	      return str;
	}
	
	
}

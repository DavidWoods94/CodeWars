package cw;

public class Order {
	public static String order(String words) {
		String sentence = "";
		String[] split = words.split(" ");
		Integer i = 1;
		
		for(String s: split) {
			for(String w : split) {
				if(w.contains(String.valueOf(i))) {
					
					sentence += w + " ";
				}
			}
			i++;
		}
		return sentence.trim();
	}
}

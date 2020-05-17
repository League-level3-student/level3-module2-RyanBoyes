package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		
		
		for(int i=0; i<eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
			
			
		}
				
		return -1;
	}


public static int countPearls(List<Boolean> pearls) {
	int total = 0;
	
	for(int i=0; i<pearls.size();i++) {
		if(pearls.get(i)==true) {
			total++;
		}
	}
	
	return total;
	
}

public static double findTallest(List<Double> height) {
	
	
	
	
	
	
	
	
	

	
	
	return height.get(height.size()-1);

}


public static String findLongestWord(List<String> words) {
	int l = 0;
	
	for(int i = 1; i<words.size(); i++) {
		int longest = words.get(0).length();
		if(words.get(i).length()>longest) {
			longest = words.get(i).length();
			 l = i;
			
		}
	}
	
	
	
	
	return words.get(l);
}
























}


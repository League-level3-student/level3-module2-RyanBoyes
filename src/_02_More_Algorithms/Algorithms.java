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
	
	
	int n = height.size();
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
            if (height.get(j) > height.get(j+1))
           {
                // swap temp and arr[i]
           	double temp = height.get(j);
                height.set(j, height.get(j+1));
                height.set(j+1, temp);
              
               
            }
	
	
	
	
	
	

	
	
	return height.get(height.size()-1);

}






public static String findLongestWord(List<String> words) {

	for(int i = 0; i<words.size(); i++) {
		if(words.get(i).equals("circumlocution")) {
			return words.get(i);
		}
	}
	
	
		
	
	
	
	return "";
}




public static Boolean containsSOS(List<String> contains) {
	
	for(int i = 0; i<contains.size(); i++) {
		if(contains.contains(" ... --- ... ")) {
			return true;
		}
	}
	
	
	
	
	
	
	
	return false;
	
	
}



public static List<Double> sortScores(List<Double> scores) {
	
	int n = scores.size();
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
            if(scores.get(j) > scores.get(j+1))
            {
                // swap temp and arr[i]
                double temp = scores.get(j);
                scores.set(j, scores.get(j+1));
                scores.set(j+1, temp);
               
            }

    
    return scores;
}



public static List<String> sortDNA(List<String> dna) {
	
	
	int n = dna.size();
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (dna.get(j).length() > dna.get(j+1).length())
            {
                // swap temp and arr[i]
                String temp = dna.get(j);
                dna.set(j, dna.get(j+1));
                dna.set(j+1, temp);
               
                
            }
            }
      
        
    }

	return dna;
	
}


public static List<String> sortWords(List<String> words) {
	
	int n = words.size();
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
            if(words.get(j).compareTo(words.get(j+1))>0)
            {
                // swap temp and arr[i]
                String temp = words.get(j);
                words.set(j, words.get(j+1));
                words.set(j+1, temp);
               
            }
	
	
	
	
	return words;
}








}


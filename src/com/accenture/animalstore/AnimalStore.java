package com.accenture.animalstore;
import java.util.regex.Pattern;

public class AnimalStore {
	
	private static final String[] LIST_OF_MAMMALS = {"Leopard", "Bear", "Lion", "Manatee", "Wombat", "Aardvark", "Racoon", "Skunk", "Fox", "Giraffe", "Horse", "Walrus", "Koala"}; // static variable names in uppercase
	
	private static final String[] LIST_OF_BIRDS = {"Flycatcher", "Swan", "Gull", "Puffbird", "Barbuda Warbler", "Brushturkey", "Buzzard", "Cactus Finch", "Cuckoo", "Goliath Heron", "Galapagos Hawk", "Inca Jay", "Merlin", "Albatros"};
	
	private static final String[] LIST_OF_FISH = {"Reef Shark", "Barracuda", "Bat ray", "Goatfish", "Hammerjaw", "Javelin", "Ling", "Menhaden", "Nibble Fish", "Perch"};
	
	
	private static final String MAMMAL_SUFFIX = " (Mammal)"; // to avoid magic strings
	private static final String BIRD_SUFFIX = " (Bird)"; 
	private static final String FISH_SUFFIX = " (Fish)"; 
	
	private static final String MAMMAL = "Mammal"; // to avoid magic strings
	private static final String BIRD = "Bird";
	private static final String FISH = "Fish";
	private static final String ERROR_NO_ANIMALTYPE_MATCHING = "Error: Please provide a supported animal type.";
	
	public static void main(String args[]) {
		
		if(args.length == 0) { // if program runs without input parameter
			for(String currentMammal : LIST_OF_MAMMALS) {
				System.out.println(currentMammal + MAMMAL_SUFFIX);
			}
			
			for(String currentBird : LIST_OF_BIRDS) {
				System.out.println(currentBird + BIRD_SUFFIX);
			}
			
			for(String currentFish : LIST_OF_FISH) {
				System.out.println(currentFish + FISH_SUFFIX);
			}
			
		} else if(args.length == 1) { // if program runs with 1 input parameter
			if(args[0].equalsIgnoreCase(MAMMAL)) {
				for(String currentMammal : LIST_OF_MAMMALS) {
					System.out.println(currentMammal);
				}
			} else if(args[0].equalsIgnoreCase(BIRD)) {
				for(String currentBird : LIST_OF_BIRDS) {
					System.out.println(currentBird);
				}
			} else if(args[0].equalsIgnoreCase(FISH)) {
				for(String currentFish : LIST_OF_FISH) {
					System.out.println(currentFish);
				}
			} else {
				System.err.println(ERROR_NO_ANIMALTYPE_MATCHING);
			}
		} else if(args.length == 2) {
			Pattern pattern = Pattern.compile(args[1]); // compile regex pattern
			
			if(args[0].equalsIgnoreCase(MAMMAL)) {
				for(String currentMammal : LIST_OF_MAMMALS) {
					if(pattern.matcher(currentMammal).find()) { //see if pattern matches current mammal
						System.out.println(currentMammal);
					}
				}
			} else if(args[0].equalsIgnoreCase(BIRD)) {
				for(String currentBird : LIST_OF_BIRDS) {
					if(pattern.matcher(currentBird).find()) {
						System.out.println(currentBird);
					}
				}
			} else if(args[0].equalsIgnoreCase(FISH)) {
				for(String currentFish : LIST_OF_FISH) {
					if(pattern.matcher(currentFish).find()) {
						System.out.println(currentFish);
					}
				}
			} else {
				System.err.println(ERROR_NO_ANIMALTYPE_MATCHING);
			}
		}
	}
}

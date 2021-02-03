package competition1;

import java.util.*;
import io.* ;
import java.lang.* ;
import competition1.strategy.*;

public class MainV2 {

	/**
	 * Verifies if the number given by the user is a good number
	 * 
	 * @param args the number of competitors given by the user
	 * @throws NotRightNumberException
	 */
	
	
	
	
	public static void main(final String[] args) throws NotRightNumberException , java.io.IOException{
		
		
		System.out.println("---------------------------BEGINNING OF THE COMPETITION---------------------------");
		List<Competitor> competitors = new ArrayList<Competitor>();
		
		List<String> strategies = new ArrayList<String>();
		strategies.add("FIRST");
		strategies.add("FIRSTTWO");
		strategies.add("RANDOM");
		strategies.add("LAST");
		
		try {
			System.out.println( "Enter a number between 0 and 2 NB: (0 ==> League Competition ; 1 ==> Tournament Competition ; 2 ==> Master Competition) \n" ) ;
			int userInt;
			userInt = Input.readInt();
			Competition ligue ;
			Competition tournoi ;
			Competition master;
			System.out.println("Give numbers of competitors: (The number must be a multiple of 2)");
			int nbCompetitors = Input.readInt();
			try {
				if (userInt == 0) {
					while( !(nbCompetitors %2 == 0) ){
						System.out.println("The number of competitor must be  a multiple of 2. Please, enter a other number !!! )");
						nbCompetitors = Input.readInt();
					}
					String str = "Enter " + nbCompetitors + " names of competitors: " ;
					System.out.println(str);
					for (int i = 0; i < nbCompetitors; i++) {
						String name = Input.readString();
						Competitor c = new Competitor(name);
						while(competitors.contains(c)) {
							name = Input.readString();
						}
						competitors.add(c);
					}
					ligue = new League(competitors);
					System.out.println(" ");
					ligue.play();
					System.out.println(" ");
					ligue.printRanking();
			
				} else if (userInt == 1) {
					while( ! (Tournament.isPowerOf2(nbCompetitors))){
						System.out.println("The number of competitor must be  a power of 2. Please, entry a other number !!! )");
						nbCompetitors = Input.readInt();
					}
					String str = "Enter " + nbCompetitors + " names of competitors: " ;
					System.out.println(str);
					for (int i = 0; i < nbCompetitors; i++) {
						String name = Input.readString();
						Competitor c = new Competitor(name);
						competitors.add(c);
					}
					tournoi = new Tournament(competitors);
					System.out.println(" ");
					tournoi.play();
					System.out.println(" ");
					tournoi.printRanking();
 
				} else if (userInt == 2){
					while( !(nbCompetitors %2 == 0) ){
						System.out.println("The number of competitor must be  a multiple of 2. Please, enter a other number !!! )");
						nbCompetitors = Input.readInt();
					}
					String str = "Enter " + nbCompetitors + " names of competitors: " ;
					System.out.println(str);
					for (int i = 0; i < nbCompetitors; i++) {
						String name = Input.readString();
						Competitor c = new Competitor(name);
						competitors.add(c);
					}
					
					Strategy strategy = null ;
					String s = "" ;
					
					while(!(strategies.contains(s))) {
						System.out.println("Choose a strategy: first ==> FIRST ; first two ==> FIRSTTWO ; random ==> RANDOM ; last ==> LAST");
						s = Input.readString();
					}
					switch (s) {
					case "FIRST":
						strategy = StrategyEnum.FIRST.makeStrategy();
						break;
					case "FIRSTTWO":
						strategy = StrategyEnum.FIRSTTWO.makeStrategy();
					case "RANDOM":
						strategy = StrategyEnum.RANDOM.makeStrategy();
					case "LAST":
						strategy = StrategyEnum.LAST.makeStrategy();
					}
					
					master = new Master(competitors);
					master.setStrategy(strategy);
					System.out.println(" ");
					master.play(); //print inside play()
					System.out.println(" "); 
					
				} else {
					throw new IllegalArgumentException("Bad argument !!! it must be either  0 or 1 :)");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}

		} catch (Exception e) {
			throw new NotRightNumberException("The number must be a power of 2");
		}
		
		
	}

}

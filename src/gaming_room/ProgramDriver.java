package gaming_room;

//============================================================================
//Name        : com.gamingroom
//Author      : Corey Nance
//Description : ProgramDriver.java
//============================================================================



/**
* Application start-up program
* 
* @author coce@snhu.edu
*/
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		
		// added GameService getGameService() call to reference to the singleton instance
		GameService service = GameService.getGameService();
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		Game game3 = service.addGame("Game #3");
		System.out.println(game3);
		Game game4 = service.addGame("Game #3");
		System.out.println(game4);

		
		
	
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
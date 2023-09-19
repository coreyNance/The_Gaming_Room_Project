package gaming_room;

//============================================================================
//Name        : com.gamingroom
//Author      : Corey Nance
//Description : SingleTonTester.java
//============================================================================



/**
* A class to test a singleton's behavior
* 
* @author coce@snhu.edu
*/
public class SingletonTester {

	public void testSingleton() {
	
		System.out.println("\nAbout to test the singleton...");
		
		// added GameService getGameService() call to reference to the singleton instance
		GameService service = GameService.getGameService();
		
		// a simple for loop to print the games
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}
		
		System.out.println(service.getGame(2L) + "This is testing the getgame()");
		
	}
	
}

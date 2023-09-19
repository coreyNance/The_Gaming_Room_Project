package gaming_room;

//============================================================================
//Name        : com.gamingroom
//Author      : Corey Nance
//Description : GameService.java
//============================================================================



import java.util.ArrayList;
import java.util.List;

//-------------------------------------------------------------------------------------------
import java.util.Iterator;

/**
* A singleton service for the game engine
* 
* @author coce@snhu.edu
*/
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	/* Added class a singleton to ensure that there is only one instance of the game service. 
	 * and that a second game service cannot be instantiated.
	*/
	private static GameService gameService = new GameService();
	
	//Created a private constructor to prevent attempts to instantiate more than one instance. 
	private GameService() {
		
		
	}
	
	// The public call that creates the game service.
	public static GameService getGameService() {
		return gameService;
	}

	

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		
		
		/* An iterator is created to check the game name and see if it matches a current game name already.
		 * If so it returns the current game and does not add the game to the array of games.*/
		Iterator<Game> thisGame = games.iterator();
		while(thisGame.hasNext()) {
			
			Game currentGame = thisGame.next();
			
			if(currentGame.getName().equals(name)) {
				game = currentGame;
			}
		}
			
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		/*
		 * Created an iterator to search through the array list of games by ID
		 * Then there is an if statement to compare the current ID to the ID given 
		 * and return the game that matches that ID.
		 */
		Iterator<Game> thisGame = games.iterator();
		while(thisGame.hasNext()) {
			
			Game currentGame = thisGame.next();
			
			
			if(currentGame.getId() == id) {
				game = currentGame;
			}
			
		}

		return game;
	}
	
	
	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;
		
		/*
		 * Created an iterator to search through the array list of games by Name
		 * Then there is an if statement to compare the current Name to the Name given 
		 * and return the game that matches that Name.
		 */
		
		Iterator<Game> thisGame = games.iterator();
		while(thisGame.hasNext()) {
			
			Game currentGame = thisGame.next();
			
			if(currentGame.getName().equals(name)) {
				game = currentGame;
			}
			
		}
		
		
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	
}

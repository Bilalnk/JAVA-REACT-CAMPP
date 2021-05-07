package concrete;

import abstracts.IGameService;
import entities.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" is added");
	}

	@Override
	public void delete(Game game) {

		System.out.println(game.getGameName()+" is deleted from db");
		
	}

	
}

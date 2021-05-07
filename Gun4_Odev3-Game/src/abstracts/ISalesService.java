package abstracts;

import entities.Campaign;
import entities.Game;

public interface ISalesService {
	
	void sell(Game game);
	
	void sell(Game game, Campaign campaign);
	
	

}

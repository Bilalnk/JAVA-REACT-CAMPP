import java.util.Date;

import adapter.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.SalesManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		User user1 = new User(1, "Bilal Nadir", "Karataþ", new Date(1999,1,26), "11111111");
		UserManager  userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user1);
		
		Game game = new Game(223, "CoD", 250);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		Campaign campaignCoD = new Campaign("CoD oyununda yuzde 50 indirim", "1S58aV8b", 50);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaignCoD);
		
		SalesManager manager = new SalesManager();
		manager.sell(game, campaignCoD);
	}

}

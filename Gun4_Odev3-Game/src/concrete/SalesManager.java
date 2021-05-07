package concrete;

import abstracts.ISalesService;
import entities.Campaign;
import entities.Game;

public class SalesManager implements ISalesService{

	@Override
	public void sell(Game game) {
		
		
		System.out.println(game.getGameName()+ "oyunu "+ game.getPrice()+ "fiyatý ile satýldý");
		
	}

	@Override
	public void sell(Game game, Campaign campaign) {
		
		System.out.println("Önceki fiyat: "+game.getPrice());
		int discountAmount = game.getPrice()*campaign.getDiscount()/100;
		System.out.println("indirim tutarý: "+ discountAmount);
		System.out.println("indirimli fiyat: " + (game.getPrice()-discountAmount));
		
	}

		
}

package concrete;

import abstracts.ICampaignService;
import entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		
		
	System.out.println(campaign.getCampaignCode()+ "kodlu "+campaign.getCampaignName()+ " kampanyası eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignCode()+ "kodlu "+campaign.getCampaignName()+ " kampanyası silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignCode()+ "kodlu "+campaign.getCampaignName()+ " kampanyası güncellendi");
		
	}

	
}

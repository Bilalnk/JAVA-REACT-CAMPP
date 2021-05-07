package entities;

public class Campaign {
	
	private String campaignName;
	private String campaignCode;
	private int discount;
	
	
	public Campaign() {
		
	}
	
	public Campaign(String campaignName, String campaignCode, int discount) {
		super();
		this.campaignName = campaignName;
		this.campaignCode = campaignCode;
		this.discount = discount;
	}
	
	
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	
	

}

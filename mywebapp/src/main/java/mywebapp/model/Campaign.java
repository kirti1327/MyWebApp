package mywebapp.model;

public class Campaign {
	private Integer id;
	private String title;
	private String adCopy;
	private String image;
	private String campaignObjective;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAdCopy() {
		return this.adCopy;
	}

	public void setAdCopy(String adCopy) {
		this.adCopy = adCopy;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCampaignObjective() {
		return this.campaignObjective;
	}

	public void setCampaignObjective(String campaignObjective) {
		this.campaignObjective = campaignObjective;
	}

}

package mywebapp.model;

public class Template {
	private String templateName;
	private Campaign campaign;

	public String getTemplateName() {
		return this.templateName;
	}

	public Campaign getCampaign() {
		return this.campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}


}

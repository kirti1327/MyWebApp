package mywebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mywebapp.dao.CampaignDao;
import mywebapp.model.Template;

@Service
public class CampaignServiceImpl implements CampaignService {

	CampaignDao campaignDao;

	@Override
	public void addCampaign(Template template) {
		this.campaignDao.addCampaign(template);
	}

	@Autowired
	public void setCampaignDao(CampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}
}

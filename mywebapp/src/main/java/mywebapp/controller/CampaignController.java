package mywebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mywebapp.model.Template;
import mywebapp.service.CampaignService;

@RestController
public class CampaignController {

	@Autowired
	CampaignService campaignService;

	@RequestMapping(value = "/add/", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Void> add(@RequestBody Template template) {
		this.campaignService.addCampaign(template);
		final HttpHeaders header = new HttpHeaders();
		return new ResponseEntity<>(header, HttpStatus.CREATED);
	}

}

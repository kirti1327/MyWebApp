package mywebapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import mywebapp.model.Template;

@Repository
public class CampaignDaoImpl implements CampaignDao {

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate)
			throws DataAccessException {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public void addCampaign(Template template) {

		final String sql = "INSERT INTO TEMPLATE(templateName, INSERT INTO CAMPAIGN(title,adCopy,image,campaignObjective) VALUES (:title,:adCopy,:image,:campaignObjective)) VALUES (:templateName,:campaign)";
		this.namedParameterJdbcTemplate.update(sql, this.getSqlParameterSource(template));
	}

	private SqlParameterSource getSqlParameterSource(Template template) {
		final MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		if (template != null) {
			mapSqlParameterSource.addValue("templateName", template.getTemplateName());
			mapSqlParameterSource.addValue("campaign", template.getCampaign());
			mapSqlParameterSource.addValue("title", template.getCampaign().getTitle());
			mapSqlParameterSource.addValue("adCopy", template.getCampaign().getAdCopy());
			mapSqlParameterSource.addValue("image", template.getCampaign().getImage());
			mapSqlParameterSource.addValue("campaignObjective", template.getCampaign().getCampaignObjective());
		}
		return mapSqlParameterSource;
	}
}

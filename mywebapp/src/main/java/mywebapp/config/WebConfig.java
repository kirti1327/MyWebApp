package mywebapp.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "mywebapp")
public class WebConfig {

	@Autowired
	DataSource dataSource;

	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(this.dataSource);
	}

	@Bean
	public DataSource getDataSource() throws NamingException {
		final JndiTemplate jndiTemplate = new JndiTemplate();
		final DataSource dataSource = (DataSource) jndiTemplate.lookup("java:comp/env/jdbc/mywebapp");
		return dataSource;

	}
}

package com.boot.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/* proper way to configure multiple data sources
 * https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-two-datasources
 */

@Configuration
public class PersistenceConfiguration {
	
	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource")
	public DataSourceProperties springDataSourceProperties() {
		return new DataSourceProperties();
	}
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return springDataSourceProperties().initializeDataSourceBuilder().build();				
	}
	
	@Bean
	@ConfigurationProperties("datasource.flyway")
	public DataSourceProperties flywayDataSourceProperties() {
		return new DataSourceProperties();
	}
	
	@Bean
	@ConfigurationProperties(prefix = "datasource.flyway")
	public DataSource flywayDataSource() {
		return flywayDataSourceProperties().initializeDataSourceBuilder().build();				
	}
	
	/*
	@Bean
	@ConfigurationProperties(prefix = "datasource.flyway")
	@FlywayDataSource
	public DataSource flywayDataSource() {
		return DataSourceBuilder.create().build();				
	}
	
	@ConfigurationProperties(prefix = "datasource.flyway")
	public DataSource flywayDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:file:~/.h2/dasboot/data");
	    dataSource.setUsername("sa");
	    dataSource.setPassword("");	    

		return dataSource		
	}
	*/
}

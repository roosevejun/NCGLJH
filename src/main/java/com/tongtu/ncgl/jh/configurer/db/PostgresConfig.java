package com.tongtu.ncgl.jh.configurer.db;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "postgresEntityManagerFactory",
        transactionManagerRef = "postgresTransactionManager",
        basePackages = {"com.tongtu.ncgl.jh.repository.postgres"}
)
public class PostgresConfig {
    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties postgresProperties(){
        return  new DataSourceProperties();
    }
    @Primary
    @Bean(name = "postgresDataSource")
    public DataSource dataSource(@Qualifier("postgresProperties") DataSourceProperties postgresProperties) {
        return postgresProperties.initializeDataSourceBuilder().build();
    }
    @Primary
    @Bean(name = "postgresEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean postgresEntityManagerFactory(@Qualifier("postgresDataSource") DataSource dataSource, EntityManagerFactoryBuilder builder){
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = builder
                .dataSource(dataSource)
                .packages("com.tongtu.ncgl.jh.beans.orm")
                .persistenceUnit("postgres")
                .build();
        return localContainerEntityManagerFactoryBean;
    }
    @Primary
    @Bean(name = "postgresTransactionManager")
    public PlatformTransactionManager postgresTransactionManager(
            @Qualifier("postgresEntityManagerFactory") EntityManagerFactory
                    barEntityManagerFactory
    ) {
        return new JpaTransactionManager(barEntityManagerFactory);
    }
}

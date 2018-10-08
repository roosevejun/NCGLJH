package com.tongtu.ncgl.jh.configurer.db;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
        entityManagerFactoryRef = "sqlserverEntityManagerFactory",
        basePackages = {"com.tongtu.ncgl.jh.repository.sqlserver"}
)
public class SqlserverConfig {
    @Bean
    @ConfigurationProperties("spring.sqlserverdatasource")
    public DataSourceProperties sqlserverProperties(){
        return  new DataSourceProperties();
    }
    @Bean(name = "sqlserverDataSource")
    public DataSource dataSource(@Qualifier("sqlserverProperties") DataSourceProperties sqlserverProperties) {
        return sqlserverProperties.initializeDataSourceBuilder().build();
    }
    @Bean(name = "sqlserverEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean sqlserverEntityManagerFactory(@Qualifier("sqlserverDataSource") DataSource dataSource, EntityManagerFactoryBuilder builder){
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = builder
                .dataSource(dataSource)
                .packages("com.tongtu.ncgl.jh.beans.sys")
                .persistenceUnit("sqlserver")
                .build();
        return localContainerEntityManagerFactoryBean;
    }
    @Bean(name = "sqlserverTransactionManager")
    public PlatformTransactionManager psqlserverTransactionManager( @Qualifier("sqlserverEntityManagerFactory") EntityManagerFactory barEntityManagerFactory ) {
        return new JpaTransactionManager(barEntityManagerFactory);
    }
}

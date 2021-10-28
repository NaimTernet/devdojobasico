//package br.com.devdojo.awesome.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.Database;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
//import br.com.devdojo.awesome.repository.StudentRepository;
//
//@Configuration
//@EnableJpaRepositories(basePackageClasses = {StudentRepository.class})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//
//public class JpaConfig {
//	@Bean
//	public DataSource dataSource() {
//		
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
//        dataSource.setUsername( "root" );
//        dataSource.setPassword( "root" );
//    
//		return null;
//	}
//
//@Bean
//public JpaTransactionManager transactionManager(StudentRepository emf) {
//  return new JpaTransactionManager();
//}
//
//@Bean
//public JpaVendorAdapter jpaVendorAdapter() {
//  HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
//  jpaVendorAdapter.setDatabase(Database.MYSQL);
//  jpaVendorAdapter.setGenerateDdl(true);
//  return jpaVendorAdapter;
//}
//
//@Bean
//public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//  LocalContainerEntityManagerFactoryBean lemfb = new LocalContainerEntityManagerFactoryBean();
//  lemfb.setDataSource(dataSource());
//  lemfb.setJpaVendorAdapter(jpaVendorAdapter());
//  lemfb.setPackagesToScan("packages.containing.entity.classes");
//  return lemfb;
//	
//}
//
//}

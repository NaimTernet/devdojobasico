
 package br.com.devdojo.awesome.config;
 
 import org.springframework.beans.factory.annotation.Autowired; import
 org.springframework.security.config.annotation.authentication.builders.
 AuthenticationManagerBuilder; import
 org.springframework.security.config.annotation.web.builders.HttpSecurity;
 import org.springframework.security.config.annotation.web.configuration.
 EnableWebSecurity; import
 org.springframework.security.config.annotation.web.configuration.
 WebSecurityConfigurerAdapter;
 
 @EnableWebSecurity 
 public class securityconfig extends WebSecurityConfigurerAdapter {

// @Override protected void configure(HttpSecurity http) throws Exception {
// super.configure(http);
// http.authorizeRequests().anyRequest().authenticated().and().httpBasic(); }
 
// @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
// throws Exception { auth.inMemoryAuthentication()
// .withUser("william").password("devdojo").roles("USER") .and()
// .withUser("admin").password("devdojo").roles("USER", "ADMIN");
// 
//}
 
 }
 

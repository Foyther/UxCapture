package ru.kpfu.itis.uxcapture.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import ru.kpfu.itis.uxcapture.security.AuthenticationProviderImpl;

@Configuration
@EnableWebSecurity
@Order(3)
@ComponentScan("ru.kpfu.itis.uxcapture.security")
public class AdminSecurityConfig extends WebSecurityConfigurerAdapter {

    private final AuthenticationProviderImpl authProvider;

    @Autowired
    public AdminSecurityConfig(AuthenticationProviderImpl authProvider) {
        this.authProvider = authProvider;
    }

    public void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authProvider);
    }

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll();


        http
                .formLogin()
                .loginPage("/admin/login")
                .loginProcessingUrl("/admin/login/process")
                .defaultSuccessUrl("/admin", true)
                .failureUrl("/admin/login?error=true")
                .usernameParameter("login").passwordParameter("password")
                .permitAll();

        http
                .logout()
                .permitAll()
                .invalidateHttpSession(true)
                .logoutUrl("/admin/logout")
                .logoutSuccessUrl("/");

        http
                .csrf().disable();
    }
}
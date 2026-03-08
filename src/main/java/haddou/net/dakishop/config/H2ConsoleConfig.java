package haddou.net.dakishop.config;

import org.h2.server.web.JakartaWebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration manuelle de la console H2 pour Spring Boot 4.
 * Dans Spring Boot 4 avec spring-boot-starter-webmvc, la console H2
 * n'est plus toujours auto-configurée en tant que Servlet.
 * Ce bean l'enregistre explicitement sur le chemin /h2-console/
 */
@Configuration
public class H2ConsoleConfig {

    @Bean
    public ServletRegistrationBean<JakartaWebServlet> h2ConsoleServlet() {
        JakartaWebServlet servlet = new JakartaWebServlet();
        ServletRegistrationBean<JakartaWebServlet> registration = new ServletRegistrationBean<>(servlet,
                "/h2-console/*");
        registration.addInitParameter("webAllowOthers", "true");
        registration.addInitParameter("trace", "");
        registration.setLoadOnStartup(1);
        registration.setName("H2Console");
        return registration;
    }
}

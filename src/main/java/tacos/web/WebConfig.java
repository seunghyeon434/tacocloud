package tacos.web;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

public class WebConfig {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login");
    }

}

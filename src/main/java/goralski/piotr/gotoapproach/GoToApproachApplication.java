package goralski.piotr.gotoapproach;

import goralski.piotr.gotoapproach.api.ApiConfiguration;
import goralski.piotr.gotoapproach.business.BusinessConfiguration;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
@PropertySource("classpath:goToApproachApplication.properties")
public class GoToApproachApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(GoToApproachApplication.class).web(WebApplicationType.NONE)
                .child(ApiConfiguration.class).web(WebApplicationType.SERVLET)
                .sibling(BusinessConfiguration.class).web(WebApplicationType.NONE)
                .run(args);
    }

}

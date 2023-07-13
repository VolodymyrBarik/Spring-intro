package mate.academy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "mate.academy.controller")
public class WebConfig implements WebMvcConfigurer {

    @Bean                                                               // у цьому біні ми кажемо Спрінгу де саме потрібно буде шукати файли
    public InternalResourceViewResolver resolver() {                   // які потрібно буде відображати для користувача
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");                          // всі файли будуть за цим шляхом
        resolver.setSuffix(".jsp");                                    // вони матимуть розширення таке як тут
        return resolver;                                               // в коному контроллері коли ми кажемо що будемо
    }                                                                  // повртати сторінку, спрінг іде сюди і шукає тут сторінку
}

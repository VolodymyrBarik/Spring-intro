package mate.academy;

import mate.academy.config.AppConfig;
import mate.academy.model.Phone;
import mate.academy.service.PhoneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setName("Sony");
        phone.setPrice(new BigDecimal(345));


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        PhoneService phoneService = context.getBean(PhoneService.class);

        phoneService.save(phone);

        System.out.println(phoneService.findAll());


    }
}

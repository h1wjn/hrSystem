package org.boluo.mailserver;

import org.boluo.hr.pojo.MailConstants;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author boluo
 */
@SpringBootApplication
public class MailServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailServerApplication.class, args);
    }

    @Bean
    Queue queue() {
        return new Queue(MailConstants.MAIL_QUEUE_NAME);
    }
}

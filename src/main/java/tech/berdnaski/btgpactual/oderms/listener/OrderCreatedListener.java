package tech.berdnaski.btgpactual.oderms.listener;

import org.springframework.messaging.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import tech.berdnaski.btgpactual.oderms.config.RabbitMqConfig;
import tech.berdnaski.btgpactual.oderms.listener.dto.OrderCreatedEvent;

@Component
public class OrderCreatedListener {

    @RabbitListener(queues = RabbitMqConfig.ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message) {

    }
}

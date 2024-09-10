package tech.berdnaski.btgpactual.oderms.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.berdnaski.btgpactual.oderms.entities.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}

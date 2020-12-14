package distributedsystems.FairyAnimalService.rabbitmq;


import distributedsystems.FairyAnimalService.model.FairyAnimal;
import distributedsystems.FairyAnimalService.services.FairyAnimalService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    FairyAnimalService FairyAnimalService;

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void consume(FairyAnimal FairyAnimal) {
        FairyAnimalService.addFairyAnimal(FairyAnimal);
    }
}

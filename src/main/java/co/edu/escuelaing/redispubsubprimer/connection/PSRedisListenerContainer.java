package co.edu.escuelaing.redispubsubprimer.connection;

import javax.inject.Inject;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;

@Component
public class PSRedisListenerContainer extends RedisMessageListenerContainer {

    @Inject
    PSRedisListenerContainer(RedisConnectionFactory connectionFactory) {
        this.setConnectionFactory(connectionFactory);
    }
}

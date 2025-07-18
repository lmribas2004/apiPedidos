package br.com.cotiinformatica.configurations;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {
	/*
	 * Mapeamento de uma fila para gravar / ler enventos de pedidos criados
	 */
	@Bean
	Queue filaPedidosCriados() {
		/*
		 * 'fila.pedidos_criados' : Nome da fila
		 * 'true' : Fila durável (mantida mesmo depois de reiniciar o servidor)
		 */
		return new Queue("fila.pedidos_criados", true);
	}
}

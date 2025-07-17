package br.com.cotiinformatica.infrastructure.outbox;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class OutboxMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String aggregateType;   // Ex: Pedido  (nome da origem do evento)	
	private String aggregateId;     // Ex: Pedido  (nome da origem do evento)	
	private String type;		    // Tipo do evento (Ex: "PedidoCriado")	
	private String payLoad;			// Dados do evento em JSON transmitidos p/ a fila
	
	private boolean published = false;
	
	private LocalDateTime createdAt = LocalDateTime.now();	
	private LocalDateTime transmittedAt;
}

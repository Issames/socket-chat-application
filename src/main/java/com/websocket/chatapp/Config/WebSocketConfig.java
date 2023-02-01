package com.websocket.chatapp.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);
			/*open connection in /connect with JS form 
			First point to start connection between Server & Client*/
			// registry linked to the server
		
		 registry.addEndpoint("/connect").withSockJS();
		 //registry.addEndpoint("/topic").withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		// registry here is for the message 
		WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);
			registry.enableSimpleBroker("/topic");
			registry.setApplicationDestinationPrefixes("/app");
	}
	
	 

}

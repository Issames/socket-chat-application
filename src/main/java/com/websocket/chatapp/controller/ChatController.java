package com.websocket.chatapp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.websocket.chatapp.model.ChatMessage;

@Controller
public class ChatController {
		
	
		@MessageMapping("/chat.LogIn") //match it to logIn method to handle it later 
		// Open Connection API & add username after registration 
		@SendTo("/topic/all")
		public ChatMessage logIn(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
			headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
				return chatMessage;
		}
		@MessageMapping("/chat.send")
		@SendTo("/topic/all")
		public ChatMessage send(@Payload ChatMessage chatMessage) {
			return chatMessage;
		}

}

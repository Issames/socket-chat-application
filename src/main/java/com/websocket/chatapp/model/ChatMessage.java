package com.websocket.chatapp.model;



public class ChatMessage {
	
	private String message;
	private String sender;
	private ChatType chatType;
	
	

	
	public ChatMessage() {
		super();
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public ChatType getChatType() {
		return chatType;
	}
	public void setChatType(ChatType chatType) {
		this.chatType = chatType;
	}
	
	
	
	
	

}

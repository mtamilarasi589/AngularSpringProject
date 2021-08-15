package com.example.demo.model;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chat")
public class ChatModel {
	@Id
	private String chatId;
	
	private UserModel primaryUser;
	private UserModel secondaryUser;
	private List<String> chatHistory;
	private Boolean status;
	private Date lastSeen;
	
	
	
	public ChatModel() {
		// TODO Auto-generated constructor stub
	}



	public ChatModel(String chatId, UserModel primaryUser, UserModel secondaryUser, List<String> chatHistory,
			Boolean status, Date lastSeen) {
		super();
		this.chatId = chatId;
		this.primaryUser = primaryUser;
		this.secondaryUser = secondaryUser;
		this.chatHistory = chatHistory;
		this.status = status;
		this.lastSeen = lastSeen;
	}



	public String getChatId() {
		return chatId;
	}



	public void setChatId(String chatId) {
		this.chatId = chatId;
	}



	public UserModel getPrimaryUser() {
		return primaryUser;
	}



	public void setPrimaryUser(UserModel primaryUser) {
		this.primaryUser = primaryUser;
	}



	public UserModel getSecondaryUser() {
		return secondaryUser;
	}



	public void setSecondaryUser(UserModel secondaryUser) {
		this.secondaryUser = secondaryUser;
	}



	public List<String> getChatHistory() {
		return chatHistory;
	}



	public void setChatHistory(List<String> chatHistory) {
		this.chatHistory = chatHistory;
	}



	public Boolean getStatus() {
		return status;
	}



	public void setStatus(Boolean status) {
		this.status = status;
	}



	public Date getLastSeen() {
		return lastSeen;
	}



	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}



	@Override
	public String toString() {
		return "ChatModel [chatId=" + chatId + ", primaryUser=" + primaryUser + ", secondaryUser=" + secondaryUser
				+ ", chatHistory=" + chatHistory + ", status=" + status + ", lastSeen=" + lastSeen + "]";
	}
	
	

}

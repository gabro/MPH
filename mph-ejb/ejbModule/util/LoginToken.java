package util;

import java.io.Serializable;

public class LoginToken implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String username;
	private long sessionID;
	
	public LoginToken(String username, long sessionID) {
		this.username = username;
		this.sessionID = sessionID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getSessionID() {
		return sessionID;
	}
	public void setSessionID(long sessionID) {
		this.sessionID = sessionID;
	}
}

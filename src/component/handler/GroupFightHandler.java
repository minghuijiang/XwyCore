package component.handler;

import component.User;

public class GroupFightHandler {

	private User user;
	private final Object lock = new Object();
	public GroupFightHandler(User user) {
		this.user = user;
	}

	
	
}

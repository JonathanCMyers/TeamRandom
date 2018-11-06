package businessObject;

import java.util.ArrayList;
import java.util.List;

import exception.RandomException;
import role.Role;

public class User {
	private String name;
	private String id;
	
	private Team teamBelongsTo;
	
	private List<Role> roles;
	
	
	public User(String name, String id) throws RandomException {
		if(name == null) {
			throw new RandomException("User's name cannot be null.");
		}
		if(name.length() == 0) {
			throw new RandomException("User's name cannot be empty.");
		}
		if(id == null) {
			throw new RandomException("User's id cannot be null.");
		}
		if(id.length() == 0) {
			throw new RandomException("User's id cannot be empty.");
		}
		this.name = name;
		this.id = id;
		roles = new ArrayList<Role>();
	}
	
	public void addRole(Role add_role) throws RandomException {
		for(Role current_role : roles) {
			if(current_role.getClass() == add_role.getClass()) {
				throw new RandomException("This user already has this role.");
			}
		}
		roles.add(add_role);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Team getTeamBelongsTo() {
		return teamBelongsTo;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	
	
	
}

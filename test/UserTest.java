package test;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import businessObject.Team;
import businessObject.User;
import exception.RandomException;
import role.Role;
import role.Submitter;

public class UserTest {
	
	@Test(expected=RandomException.class)
	public void testCannotSetNullUserName() throws RandomException {
		new User(null, "1");
	}
	
	@Test(expected=RandomException.class)
	public void testCannotSetNullUserId() throws RandomException {
		new User("Randy", null);
	}
	
	@Test(expected=RandomException.class)
	public void testCannotSetEmptyUserName() throws RandomException {
		new User("", "1");
	}
	
	@Test(expected=RandomException.class)
	public void testCannotSetEmptyUserId() throws RandomException {
		new User("Randy", "");
	}
	
	@Test
	public void testRoleAddedSuccessfully() throws RandomException {
		User randy = new User("Randy", "1");
		Role role = new Submitter();
		randy.addRole(role);
		assertEquals(randy.getRoles().size(), 1);
		assertEquals(randy.getRoles().get(0), role);
	}

	
	
	/*
	 
	 	public User(String name, String id) {
		this.name = name;
		this.id = id;
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
	 
	 */
}

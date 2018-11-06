package role;

import businessObject.User;
import component.Artifact;
import component.Template;

public class Administrator extends Role {
	
	public Administrator() {
		throw new UnsupportedOperationException();
	}
	
	public void setupNotificationTemplates(Template template) {
		throw new UnsupportedOperationException();
	}
	
	public void setupReviewTemplates(Template template) {
		throw new UnsupportedOperationException();
	}
	
	public void setupNotification() {
		throw new UnsupportedOperationException();
	}
	
	public void addUserAccount(String username, String userId) {
		throw new UnsupportedOperationException();
	}
	
	public void deleteUserAccount(User user) {
		throw new UnsupportedOperationException();
	}
	
	public void changingUserAccount(User user) {
		throw new UnsupportedOperationException();
	}
	
	public void viewArtifact(Artifact artifact) {
		
	}
}

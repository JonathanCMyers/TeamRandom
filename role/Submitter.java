package role;

import java.util.ArrayList;
import java.util.List;

import component.Artifact;
import component.Review;

public class Submitter extends Role {
	
	private List<Artifact> artifactsSubmitted;
	

	public Submitter() {
		artifactsSubmitted = new ArrayList<Artifact>();
	}
	
	public void submitArtifact(Artifact artifact) {
		artifactsSubmitted.add(artifact);
		throw new UnsupportedOperationException();
	}
	
	public void viewArtifact(Artifact artifact) {
		throw new UnsupportedOperationException();
	}
	
	public void viewComment(Review review) {
		throw new UnsupportedOperationException();
	}
	
}

package jcube;

public class Face {
	
	private String titre;
	//private String description;
	
	public Face(String string) {
		this.titre=string;
	}
	
	public String getTitre(){
		return titre;
	}
	
	public boolean equals(Face face2){
		return this.titre.equals(face2.titre);
	}
	
}

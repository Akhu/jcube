package jcube;

import java.util.ArrayList;

public class Face {
	
	private String titre;
	//private String description;
	private ArrayList<Cheat> cheats = new ArrayList<Cheat>();
	
	public Face(String string) {
		this.titre=string;
	}
	
	public Face() {
		// TODO Auto-generated constructor stub
	}

	public String getTitre(){
		return titre;
	}
	
	public boolean equals(Object face2){
		return this.titre.equals(((Face)face2).titre) && this.cheats.equals(((Face)face2).cheats);
	}

	public Face addCheat(String cheatTitle) {
		cheats.add(new Cheat(cheatTitle));
		return this;
	}

	public void setTitre(String titre) {
		this.titre = titre;
		
	}
	
}

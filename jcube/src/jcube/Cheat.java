package jcube;

public class Cheat {

	private String title;
	private String description;

	public Cheat(String cheatTitle) {
		this.title = cheatTitle;
	}
	
	public Cheat(String title2, String description) {
		this.title = title2;
		this.setDescription(description);
	}

	public boolean equals(Object cheat2){
		
		return this.title.equals(((Cheat)cheat2).title);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

} 

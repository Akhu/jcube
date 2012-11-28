package jcube;

public class Cheat {

	@SuppressWarnings("unused")
	private String title;

	public Cheat(String cheatTitle) {
		this.title = cheatTitle;
	}
	
	public boolean equals(Object cheat2){
		
		return this.title.equals(((Cheat)cheat2).title);
	}
	

} 

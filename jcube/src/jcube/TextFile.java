package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class TextFile {

	private String path;
	private ArrayList<String> lines = new ArrayList<String>();
	HashMap<String, String> spelines = new HashMap<String, String>();

	public TextFile(String filepath) {
		this.path=filepath;
	}
	
	public Cube createCubeFromFile() throws IOException {
		Cube cube = new Cube();
		this.createFacesAndCheats(cube);
		return cube;
		
		/*Cube cube = new Cube();
		this.getContent();
		for(String titre : this.lines){
			cube.addFace(titre);
		}
		return cube;*/
	}

	public Cube createFacesAndCheats (Cube aCube) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(new File(this.path)));
		String line;
	
		Face currentFace = new Face();
		while ((line = reader.readLine()) != null){		
			if(line.startsWith("* ")){				
				currentFace = new Face();
				aCube.getFaces().add(currentFace);
				currentFace.setTitre(line.substring(2));
			}			
			if(line.startsWith("** ")){
				currentFace.addCheat(line.substring(3));
			}
			if(line.startsWith("*** ")){
				currentFace.getCheats().get((currentFace.getCheats().size())-1).setDescription(line.substring(4));
			}
		}
		reader.close();
		
		return aCube; // Ajout d'une face au CUBE
	}

	public void getContent() throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(new File(this.path)));
		String line;
		
		while ((line = reader.readLine()) != null){
			lines.add(line.substring(2));
		}
		reader.close();
	}

	public Cube createCubeFromOneFaceFile() throws IOException {
		Cube cube = new Cube();
		this.createFacesAndCheats(cube);
		return cube;
	}
	
}

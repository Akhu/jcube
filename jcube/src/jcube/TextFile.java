package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextFile {

	private String path;
	private ArrayList<String> lines = new ArrayList<String>();

	public TextFile(String filepath) {
		this.path=filepath;
	}
	
	public Cube createCubeFromFile() throws IOException {
		Cube cube = new Cube();
		this.getContent();
		for(String titre : this.lines){
			cube.addFace(titre);
		}
		return cube;
	}

	
	public void getContent() throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(new File(this.path)));
		String line;
		while ((line = reader.readLine()) != null) 
			lines.add(line.substring(2));
		reader.close();
	}
	
}

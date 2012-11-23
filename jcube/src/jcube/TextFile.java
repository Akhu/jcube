package jcube;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFile {

	private String path;

	public TextFile(String filepath) {
		this.path=filepath;
	}

	public Cube createCubeFromFile() throws IOException {
		Cube cube = new Cube();
		cube.addFace(getContent());
		return cube;
	}
	
	public String getContent() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(new File(this.path)));
		String line = reader.readLine().substring(2);
		reader.close();
		return line;
	}
	
}

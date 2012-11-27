package jcube;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class CubeFrom4LinesTextFile {

	@Test
	public void fourLinesInTextFileMeans4Faces() throws IOException {
		Cube cube4face = (new Cube())
				.addFace("Copier")
				.addFace("Coller")
				.addFace("Manger")
				.addFace("Couper");
		assertEquals(cube4face.getNombreDeFace(),Cube.fromTextFile("templates/four-line-cube.txt").getNombreDeFace());
	}
	
	@Test
	public void twoCubeWithTwoEqualFacesAreEquals(){
		Cube cube2faces = (new Cube()).addFace("Hey").addFace("Ho");
		Cube cube2faces2 = (new Cube()).addFace("Hey").addFace("Ho");
		
		assertEquals(cube2faces,cube2faces2);
	}
	
	

}

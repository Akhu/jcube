package jcube;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class CubeFrom4LinesTextFile {

	@Test
	public void fourLinesInTextFileMeans4Faces() throws IOException {
		Cube cube4face = (new Cube())
				.addMultipleFaces("Copier")
				.addMultipleFaces("Coller")
				.addMultipleFaces("Manger")
				.addMultipleFaces("Couper");
		assertEquals(cube4face.getNombreDeFace(),Cube.fromMultipleLinesTextFile("templates/four-line-cube.txt").getNombreDeFace());
	}
	
	@Test
	public void twoCubeWithTwoEqualFacesAreEquals(){
		Cube cube2faces = (new Cube()).addMultipleFaces("Hey").addMultipleFaces("Ho");
		Cube cube2faces2 = (new Cube()).addMultipleFaces("Hey").addMultipleFaces("Ho");
		
		assertEquals(cube2faces,cube2faces2);
	}

}

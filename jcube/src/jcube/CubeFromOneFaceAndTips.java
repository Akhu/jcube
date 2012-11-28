package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CubeFromOneFaceAndTips {
	
	@Test
	public void oneStarLineAndTwoStarsLineShouldBeAFace() throws IOException{
		Face face1 = new Face("Copier");
		face1.addCheat("Ctrl+C");
		Face thisFace=(Cube.fromOneFaceTextFile("templates/one-faces-tips.txt")).getFaces().get(0);
		assertEquals(face1,thisFace);
	}
	
	@Test
	public void fileWithThreeStarsLineShouldHaveADescriptionInFace() throws IOException{
		Face face1 = new Face("Copier");
		face1.addCheat("Ctrl+C","Copier dans le presse PAPIER");
		Face thisFace=(Cube.fromOneFaceTextFile("templates/one-faces-tips.txt")).getFaces().get(0);
		assertEquals(face1,thisFace);
	}
}

package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CubeFromOneFaceAndTips {
	
	@Test
	public void oneStarLineAndTwoStarsLineShouldBeAFace() throws IOException{
		Face face1 = new Face("Copier");
		face1.addCheat("Ctrl+C");
		Face thisFace=(Cube.fromTextFile("templates/one-faces-tips.txt")).getFaces().get(0);
		assertEquals(face1,thisFace);
	}
}

package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CubeFromFourFacesAndTips {
	
	
	public void twoStarsInFileShouldBeEqualToACubeWithCheats() throws IOException{
		Cube cubeWithCheats = new Cube();
		cubeWithCheats.newFace("Copier").addCheat("Ctrl+C");
		cubeWithCheats.newFace("Coller").addCheat("Ctrl+V");
		cubeWithCheats.newFace("Manger").addCheat("Ouvrir la bouche");
		cubeWithCheats.newFace("Digerer").addCheat("Gerer! Dit-il");
		
		Cube thisCube = Cube.fromTextFile("templates/four-face-tips.txt");
		assertEquals(cubeWithCheats,thisCube);
	}
	
	@Test
	public void cubeShouldHaveFourFacesWithCheatsAndDescription() throws IOException{
		Cube cubeWithCheats = new Cube();
		cubeWithCheats.newFace("Copier").addCheat("Ctrl+C","DescCopie");
		
		cubeWithCheats.newFace("Coller").addCheat("Ctrl+V","DescColler");
		cubeWithCheats.newFace("Manger").addCheat("Ouvrir la bouche","DescManger");
		cubeWithCheats.newFace("Digerer").addCheat("Gerer! Dit-il","DescDigerer");
		
		Cube thisCube = Cube.fromTextFile("templates/four-face-tips.txt");
		assertEquals(cubeWithCheats,thisCube);		
	}
}

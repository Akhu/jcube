package jcube;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class Cube {
	private Face faceOne;
	private ArrayList<Face> faces = new ArrayList<Face>();
	
	public Integer getNombreDeFace(){
		return this.faces.size();
	}
	public ArrayList<Face> getFaces() {
		return faces;
	}

	public void setFaces(ArrayList<Face> faces) {
		this.faces = faces;
	}

	public static Cube fromTextFile(String filepath) throws IOException {
		TextFile tFile= new TextFile(filepath);
		return tFile.createCubeFromFile();
	}
	
	public static Cube fromMultipleLinesTextFile(String filepath) throws IOException{
		TextFile tFile= new TextFile(filepath);
		return tFile.createCubeFromMultipleLinesFile();
	}
	
	public Cube addFace(String string) {
		this.faceOne = new Face(string);
		return this;
	}
	
	public boolean equals(Object other) {
		Cube otherCube = (Cube)other;
		if(this.faceOne.equals(otherCube.faceOne) || this.faces.equals(otherCube.getFaces())){
			return true;
		}else{
			return false;
		}
	}

	public XMLDocument toSVG(String filePath) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		// Remplacer par la liste des faces plus tard
		return SVGFile.replaceTitleInSVG(filePath, this.faceOne.getTitre());
	}

	public Cube addMultipleFaces(String titreFace) {	
		faces.add((new Face(titreFace)));
		return this;
	}

}

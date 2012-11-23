package jcube;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class Cube {
	private Face faceOne;
	
	public static Cube fromTextFile(String filepath) throws IOException {
		TextFile tFile= new TextFile(filepath);
		return tFile.createCube();
	}
	
	public Cube addFace(String string) {
		this.faceOne = new Face(string);
		return this;
	}
	
	public boolean equals(Object other) {
		Cube otherCube = (Cube)other;
		return this.faceOne.equals(otherCube.faceOne);
	}

	public XMLDocument toSVG(String filePath) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		// Remplacer par la liste des faces plus tard
		return SVGFile.replaceTitleInSVG(filePath, this.faceOne.getTitre());
	}

}

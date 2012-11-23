package jcube;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Element;
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

	public XMLDocument toSVG(String string) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		XMLDocument doc = (new XMLDocument()).loadXMLFile(string);
		Element blocNode = doc.getFirstNodeFromXPath("//tspan[contains(text(), \"$BLOCK1\")]");
		blocNode.setTextContent(this.faceOne.getTitre());
		return doc;
	}

}

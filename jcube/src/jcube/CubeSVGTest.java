package jcube;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;
import org.xml.sax.SAXException;

public class CubeSVGTest {
	@Test
	public void lineFromTextShouldBeInSVG() throws IOException, XPathExpressionException, SAXException, ParserConfigurationException{
		Cube cube;
		
		cube = Cube.fromTextFile("templates/one-line-cube.txt");
		
		XMLDocument xml = (XMLDocument) cube.toSVG("templates/cube.svg");
		assertTrue(xml.match("//tspan[contains(text(),\"Comment sortir\")]"));
	}
}

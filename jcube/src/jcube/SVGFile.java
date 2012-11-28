package jcube;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class SVGFile {

	public static XMLDocument replaceTitleInSVG(String filePath, String titre) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		XMLDocument doc = (new XMLDocument()).loadXMLFile(filePath);
		Element blocNode = doc.getFirstNodeFromXPath("//tspan[contains(text(), \"$BLOCK1\")]");
		blocNode.setTextContent(titre);
		return doc;
	}
}
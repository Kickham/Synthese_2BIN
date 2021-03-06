import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class MainSAXB {
	
	public static void main(String args[]){
		try {
			File inputFile = new File("library.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			SAXB userHandler = new SAXB();
			saxParser.parse(inputFile, userHandler);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}

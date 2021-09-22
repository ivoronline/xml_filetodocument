import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;

public class UtilXML {

  //================================================================================
  // READ XML FROM FILE
  //================================================================================
  // Document document = readXMLFromFile(fileXMLInput);
  public static Document readXMLFromFile(String fileName) throws Exception {

    //OPEN FILE FOR READING
    InputStream            inputStream     = UtilXML.class.getResourceAsStream(fileName);

    //PREPARE DOCUMENT BUILDER
    DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
                           documentFactory.setNamespaceAware(true);

    //READ DOCUMENT FROM FILE
    Document               document        = documentFactory.newDocumentBuilder().parse(inputStream);

    //RETURN DOCUMENT
    return document;

  }

}

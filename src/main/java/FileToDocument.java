import org.w3c.dom.Document;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;

public class FileToDocument {

  static String fileXMLInput = "src/main/resources/Person.xml";

  //================================================================================
  // MAIN
  //================================================================================
  public static void main(String[] args) throws Exception {

    //GET DOCUMENT
    Document document = readXMLFromFile(fileXMLInput);

    //GET AGE VALUE
    Node     ageNode  = document.getElementsByTagName("age").item(0);
    String   age      = ageNode.getFirstChild().getNodeValue();

    //DISPLAY AGE VALUE
    System.out.println(age);

  }

  //================================================================================
  // READ XML FROM FILE
  //================================================================================
  // Document document = readXMLFromFile(fileXMLInput);
  public static Document readXMLFromFile(String fileName) throws Exception {

    //OPEN XML FILE FOR READING
    FileInputStream        fileInputStream        = new FileInputStream(fileName);

    //CREATE DOCUMENT
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                           documentBuilderFactory.setNamespaceAware(true);    //IMPORTANT
    DocumentBuilder        documentBuilder        = documentBuilderFactory.newDocumentBuilder();
    Document               document               = documentBuilder.parse(fileInputStream);

    //RETURN DOCUMENT
    return document;

  }

}

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class Main {

  static String fileXMLInput = "Person.xml";

  //================================================================================
  // MAIN
  //================================================================================
  public static void main(String[] args) throws Exception {

    //GET DOCUMENT
    Document document = UtilXML.fileToDocument(fileXMLInput);

    //GET NAME
    Node     nameNode = document.getElementsByTagName("name").item(0);
    String   name     = nameNode.getFirstChild().getNodeValue();

    //DISPLAY AGE VALUE
    System.out.println("Hello" + name);

  }

}


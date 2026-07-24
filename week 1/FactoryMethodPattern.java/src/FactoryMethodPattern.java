// Product Interface
interface Document {
    void open();
}

// Concrete Products
class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
}

class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}

class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}

// Factory Class
class DocumentFactory {

    public Document createDocument(String type) {

        if (type.equalsIgnoreCase("WORD")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("PDF")) {
            return new PdfDocument();
        } else if (type.equalsIgnoreCase("EXCEL")) {
            return new ExcelDocument();
        }

        return null;
    }
}

// Main Class
public class FactoryMethodPattern {

    public static void main(String[] args) {

        DocumentFactory factory = new DocumentFactory();

        Document doc1 = factory.createDocument("WORD");
        doc1.open();

        Document doc2 = factory.createDocument("PDF");
        doc2.open();

        Document doc3 = factory.createDocument("EXCEL");
        doc3.open();
    }
}
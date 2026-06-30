interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}
    
interface FaxMachine {
    void faxDocument();
}

class MultiFunctionCopier implements Printer, Scanner, FaxMachine {

   public void printDocument() {
    System.out.println("Printing...");
   }

   public void scanDocument() {
    System.out.println("Scanning...");
   }

   public void faxDocument() {
    System.out.println("Faxing...");
   }
}

class BasicPrinter implements Printer {
    public void printDocument() {
        System.out.println("Printing...");
    }
}

public class Main1 {
    public static void main(String[] args) {
        BasicPrinter printer = new BasicPrinter();
        printer.printDocument();

        MultiFunctionCopier copier = new MultiFunctionCopier();
        copier.printDocument();
        copier.scanDocument();
        copier.faxDocument();
    }
}

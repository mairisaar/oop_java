public class PrinterTest {
    public static void main(String[] args) {
        Printer overall = new Printer(50, false);

        overall.setPabereidPrinteris(100);

        System.out.println("Printeri tooneri tase on " + overall.getTooneriTase() + "%");

        overall.prindi(2);
        overall.lisaTooner(14);

        System.out.println("Õpetaja meetodiga tooneri täitmine. Uus tooneri tase: " + overall.annaLisaTooner(20) + "%");

        overall.annaPrindi(4);

        System.out.println("Anna printimise järel on printeris alles " + overall.getPabereidPrinteris() + " lehte");

    }


}

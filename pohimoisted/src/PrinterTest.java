public class PrinterTest {
    public static void main(String[] args) {
        Printer overall = new Printer(50, true);

        overall.setPabereidPrinteris(45);

        System.out.println("Printeri tooneri tase on " + overall.getTooneriTase() + "%");

        overall.prindi(22);
        overall.lisaTooner(14);

        System.out.println("Õpetaja meetodiga tooneri täitmine. Uus tooneri tase: " + overall.annaLisaTooner(20) + "%");
    }


}

import com.sun.org.apache.xpath.internal.SourceTree;

public class Printer {
    private Integer tooneriTase;
    public Integer paberiArv;
    private Boolean kasKahepoolne;

    public Printer(Integer tooneriTase, Boolean kasKahepoolne) {
        this.tooneriTase = tooneriTase;
        this.kasKahepoolne = kasKahepoolne;
        this.paberiArv = 100;
    }

    public void prindi(Integer lehed) {
        System.out.println("Paberite arv enne printimist: " + this.paberiArv);

        if (paberiArv >= lehed) {
            this.paberiArv -= lehed;
            System.out.println("Paberite arv pärast printimist: " + this.paberiArv);
        } else {
            if (lehed - paberiArv == 1) {
                System.out.println("Prinditi " + paberiArv + " lehte. Printimata jäi " + (lehed - paberiArv) + " leht. Lisa printerisse paberit!");
            } else {
                System.out.println("Prinditi " + paberiArv + " lehte. Printimata jäi " + (lehed - paberiArv) + " lehte. Lisa printerisse paberit!");
            }
        }

    }

    public void lisaTooner(Integer tooner) {
        System.out.println("Tooneri tase enne täitmist on: " + this.tooneriTase + "%");
        if (tooneriTase + tooner <= 100) {
            this.tooneriTase += tooner;
            System.out.println("Uus tooneri tase on: " + this.tooneriTase + "%");
        } else {
            System.out.println("Tooner on täidetud 100%. Üle jäi " + ((tooneriTase + tooner) - 100) + "%");
            this.tooneriTase = 100;
        }

    }
}

import com.sun.org.apache.xpath.internal.SourceTree;

public class Printer {
    public Double tooneriTase;
    public Integer paberiArv;
    public Boolean kasKahepoolne;

    public Printer(Double tooneriTase, Integer paberiArv, Boolean kasKahepoolne) {
        this.tooneriTase = tooneriTase;
        this.paberiArv = paberiArv;
        this.kasKahepoolne = kasKahepoolne;
    }

    public void prindi(Integer lehed) {
        System.out.println("Paberite arv enne printimist: " + this.paberiArv);
        this.paberiArv -= lehed;
        System.out.println("Paberite arv pärast printimist: " + this.paberiArv);
    }

    public void lisaTooner(Integer tooner) {
        System.out.println("Tooneri tase enne täitmist on: " + this.tooneriTase);
        this.tooneriTase += tooner;
        System.out.println("Uus tooneri tase on: " + this.tooneriTase);
    }
}

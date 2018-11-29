public class Printer {
    private Integer tooneriTase;
    private Integer pabereidPrinteris;
    private Boolean kasKahepoolne;

    public Printer(Integer tooneriTase, Boolean kasKahepoolne) {
        this.tooneriTase = tooneriTase;
        this.kasKahepoolne = kasKahepoolne;
        this.pabereidPrinteris = 100;
    }

    public void setPabereidPrinteris(Integer pabereidPrinteris) {
        this.pabereidPrinteris = pabereidPrinteris;
    }

    public Integer getTooneriTase() {
        return tooneriTase;
    }

    public void prindi(Integer lehed) {
        System.out.println("Paberite arv enne printimist: " + this.pabereidPrinteris);

        if (this.pabereidPrinteris >= lehed) {
            this.pabereidPrinteris -= lehed;
            System.out.println("Paberite arv pärast printimist: " + this.pabereidPrinteris);
        } else {
            if (lehed - this.pabereidPrinteris == 1) {
                System.out.println("Prinditi " + pabereidPrinteris + " lehte. Printimata jäi " + (lehed - pabereidPrinteris) + " leht. Lisa printerisse paberit!");
            } else {
                System.out.println("Prinditi " + pabereidPrinteris + " lehte. Printimata jäi " + (lehed - pabereidPrinteris) + " lehte. Lisa printerisse paberit!");
            }
        }

    }

    public void lisaTooner(Integer tooner) {
        System.out.println("Tooneri tase enne täitmist on: " + this.tooneriTase + "%");
        if (this.tooneriTase + tooner <= 100) {
            this.tooneriTase += tooner;
            System.out.println("Uus tooneri tase on: " + this.tooneriTase + "%");
        } else {
            System.out.println("Tooner on täidetud 100%. Üle jäi " + ((tooneriTase + tooner) - 100) + "%");
            this.tooneriTase = 100;
        }

    }

    public Integer annaLisaTooner(Integer toonerJuurde) {
        if (this.tooneriTase >= 0 & this.tooneriTase <= 100) {
            if (this.tooneriTase + toonerJuurde > 100) {
                return -1;
            }
            this.tooneriTase = this.tooneriTase + toonerJuurde;
            return this.tooneriTase;
        } else {
            return -1;
        }
    }
}


public class Kujund {
    // tüübi omadused - klassi muutujad
    private String nimetus;
    private Double pindala;
    private Boolean nurkadeOlemasolu;
    private Integer nurkadeArv;

    // klassi konstruktor
    public Kujund(String nimi) {
        System.out.println("Kujund klassi konstruktor");
        this.nimetus = nimi;
    }

    //tüübi tegevused - klassi meetodid
    public void arvutaPindala() {
        System.out.println("Kujund klassi arvutaPindala() meetod");
    }

    public void valjastaKirjeldus() {
        System.out.println(this.nimetus);
        this.arvutaPindala();
        System.out.println();

    }

    //setterid

    public void setNimetus(String nimi) {
        this.nimetus = nimi;
    }

    public void setNurkadeOlemasolu(Boolean nO) {
        this.nurkadeOlemasolu = nO;
    }

    public void setNurkadeArv(Integer nA) {
        this.nurkadeArv = nA;
    }

    public void setPindala(Double s) {
        this.pindala = s;
    }

    // getterid


    public String getNimetus() {
        return nimetus;
    }

    public Boolean getNurkadeOlemasolu() {
        return nurkadeOlemasolu;
    }

    public Integer getNurkadeArv() {
        return nurkadeArv;
    }
}

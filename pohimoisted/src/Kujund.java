public class Kujund {
    // tüübi omadused - klassi muutujad
    public String nimetus;
    public Double pindala;
    public Boolean nurkadeOlemasolu;
    public Integer nurkadeArv;

    // klassi konstruktor
    public Kujund(String nimi) {
        this.nimetus = nimi;
    }

    //tüübi tegevused - klassi meetodid
    public void arvutaPindala() {
        System.out.println("Kujund klassi arvutaPindala meetod");
    }

    public void valjastaKirjeldus() {
        System.out.println(this.nimetus);
        this.arvutaPindala();
        System.out.println();
    }
}

public class Kujund {
    // tüübi omadused - klassi muutujad
    private String nimetus;
    private Double pindala;
    private Boolean nurkadeOlemasolu;
    private Integer nurkadeArv;

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

    public void setNimetus(String nimi) {
        this.nimetus = nimi;
    }


}

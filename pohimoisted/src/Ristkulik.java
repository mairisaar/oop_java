public class Ristkulik extends Kujund {
    // klassi omadused
    private Double pikkus;
    private Double laius;
    private Integer nurk;

    // klassi konstruktor
    public Ristkulik(String nimi, Double p, Double l) {
        super(nimi);
        this.pikkus = p;
        this.laius = l;
        
        this.nurk = 90;

        System.out.println("Ristküliku klassi konstruktor");
    }
}

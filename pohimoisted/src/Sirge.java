public class Sirge {
    private String nimetus;
    private Punkt punktA;
    private Punkt punktB;
    private Double pikkus;

    public Sirge(String nimetus, Punkt punktA, Punkt punktB) {
        this.nimetus = nimetus;
        this.punktA = punktA;
        this.punktB = punktB;
        this.setPikkus();
    }

    public void setPikkus() {
        Double d = Math.sqrt(Math.pow((punktB.getX() - punktA.getX()), 2) + Math.pow((punktB.getY() - punktA.getY()), 2));
        this.pikkus = d;
    }

    public void valjastaKirjeldus() {
        System.out.println("Sirge " + this.nimetus + " on pikkusega " + this.pikkus);
    }
}

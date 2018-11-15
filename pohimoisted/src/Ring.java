public class Ring {
    public Double raadius;
    public Double x;
    public Double y;

    public Ring() {
        this.raadius = 0.0;
    }

    public Ring(Double r) {
        this.raadius = r;
    }

    public void pindala() {
        Double ringiPindala = (Math.round(100 * (Math.PI * Math.pow(raadius, 2)))) / 100.0;
        System.out.println("Selle ringi pindala on " + ringiPindala);
    }
}

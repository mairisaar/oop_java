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
        Double s = 3.14 * raadius * raadius;
        System.out.println(s);
    }
}
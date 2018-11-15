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

    public Double pindala() {
        Double ringiPindala = (Math.round(100 * (Math.PI * Math.pow(raadius, 2)))) / 100.0;
        return ringiPindala;
    }

    public void ringiKirjeldus() {
        System.out.println("Antud ringi raadius on " + raadius);
        Double ringiPindala = pindala();
        System.out.println("Antud ringi pindala on " + ringiPindala);
    }
}

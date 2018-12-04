public class TervislikBurger extends Burger {
    private String tervislikLisand1;
    private Double tervislikLisand1Hind;
    private String tervislikLisand2;
    private Double tervislikLisand2Hind;


    public TervislikBurger(String liha, Double hind) {
        this.setLiha(liha);
        this.setHind(hind);
        this.setSai("taisteraLeib");
    }

    public Double valiTervislikLisand1(String tervislikLisand1, Double tervislikLisand1Hind) {
        return tervislikLisand1Hind;
    }

    public Double valiTervislikLisand2(String tervislikLisand2, Double tervislikLisand2Hind) {
        return tervislikLisand2Hind;
    }

    @Override
    public void koostaBurger() {
        System.out.println("Tervislik burger on koostatud.");
        Double burgeriHindKokku = this.getHind() + this.getLisand1Hind() + this.getLisand2Hind() + this.getLisand3Hind() + this.getLisand4Hind() + this.tervislikLisand1Hind + this.tervislikLisand2Hind;
        System.out.println("Burgeri hind kokku on " + burgeriHindKokku + " eurot.");
    }

    public Double getTervislikLisand1Hind() {
        return tervislikLisand1Hind;
    }

    public Double getTervislikLisand2Hind() {
        return tervislikLisand2Hind;
    }
}

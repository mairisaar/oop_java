public class TervislikBurger extends Burger {
    private String tervislikLisand1;
    private Double tervislikLisand1Hind;
    private String tervislikLisand2;
    private Double tervislikLisand2Hind;


    @Override
    public TervislikBurger(String liha, Double hind) {
        this.setLiha(liha);
        this.setHind(hind);
        this.setSai("täisteraLeib");
    }

    public Double valiTervislikLisand1(String tervislikLisand1, Double tervislikLisand1Hind) {
        return tervislikLisand1Hind;
    }

    @Override
    public void koostaBurger() {
        System.out.println("Tervislik b on koostatud.");
        Double burgeriHindKokku = this.getHind() + this.getLisand1Hind() + this.getLisand2Hind() + this.getLisand3Hind() + this.getLisand4Hind();
        System.out.println("Burgeri hind kokku on " + burgeriHindKokku + " eurot.");
    }
}

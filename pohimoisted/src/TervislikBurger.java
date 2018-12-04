public class TervislikBurger extends Burger {
    private String tervislikLisand1;
    private Double tervislikLisand1Hind;
    private String tervislikLisand2;
    private Double tervislikLisand2Hind;

    public TervislikBurger(String liha, Double hind) {
        super(nimetus, liha, hind);
        this.getSai() = "mustTeraleb";
    }

    public Double valiTervislikLisand1(String tervislikLisand1, Double tervislikLisand1Hind) {
        return (tervislikLisand1,tervislikLisand1Hind);
    }

    @Override
    public void koostaBurger() {
        System.out.println("Koostati tervislik burger.");
    }

}

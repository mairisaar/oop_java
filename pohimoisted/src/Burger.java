public class Burger {
    private String nimetus;
    private String liha;
    private String sai;
    private Double hind;
    private String lisand1;
    private Double lisand1Hind;
    private String lisand2;
    private Double lisand2Hind;
    private String lisand3;
    private Double lisand3Hind;
    private String lisand4;
    private Double lisand4Hind;

    public Burger(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
    }

    public Double valiLisand1(String lisand1, Double lisand1Hind) {
        this.lisand1 = lisand1;
        this.lisand1Hind = lisand1Hind;

        System.out.println("Esimeseks lisandiks valiti " + this.lisand1);
        return this.lisand1Hind;
    }

    public Double valiLisand2(String lisand2, Double lisand2Hind) {
        this.lisand2 = lisand2;
        this.lisand2Hind = lisand2Hind;

        System.out.println("Teiseks lisandiks valiti " + this.lisand2);
        return this.lisand2Hind;
    }

    public Double valiLisand3(String lisand3, Double lisand3Hind) {
        this.lisand3 = lisand3;
        this.lisand3Hind = lisand3Hind;

        System.out.println("Kolmandaks lisandiks valiti " + this.lisand3);
        return this.lisand3Hind;
    }

    public Double valiLisand4(String lisand4, Double lisand4Hind) {
        this.lisand1 = lisand4;
        this.lisand1Hind = lisand4Hind;

        System.out.println("Neljandaks lisandiks valiti " + this.lisand4);
        return this.lisand4Hind;
    }

    public void koostaBurger() {
        
    }
}

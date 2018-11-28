public class Magamistuba {
    public static void main(String[] args) {
        Sein sein1 = new Sein("põhi");
        Sein sein2 = new Sein("lõuna");
        Sein sein3 = new Sein("lääs");
        Sein sein4 = new Sein("ida");
        Lagi lagi = new Lagi(2.5, "valge");
        Voodi voodi = new Voodi("minuVoodi", 60, 2, 4, 1);
        Lamp lamp = new Lamp("Kati", true);

        System.out.println(sein1.getSuund());
        System.out.println(sein2.getSuund());
        System.out.println(sein3.getSuund());
        System.out.println(sein4.getSuund());
        System.out.println("Lae kõrgus: " + lagi.getKorgus());
        System.out.println("Lae värvus: " + lagi.getVarv());

        voodi.voodiLoomine();

        lamp.lulita();
        System.out.println("Nüüd saab magada.");
        lamp.lulita();
    }


}

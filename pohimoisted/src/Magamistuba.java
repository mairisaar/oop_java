public class Magamistuba {
    public static void main(String[] args) {
        Sein sein1 = new Sein("põhi");
        Sein sein2 = new Sein("lõuna");
        Sein sein3 = new Sein("lääs");
        Sein sein4 = new Sein("ida");
        Lagi lagi = new Lagi(2.5, "valge");

        System.out.println(sein1.getSuund());
        System.out.println(sein2.getSuund());
        System.out.println(sein3.getSuund());
        System.out.println(sein4.getSuund());
        System.out.println("Lae kõrgus: " + lagi.getKorgus());
        System.out.println("Lae värvus: " + lagi.getVarv());
    }


}

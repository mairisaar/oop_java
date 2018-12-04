public class Burgerid {
    public static void main(String[] args) {

        Burger juustuBurger = new Burger("juustu", "pihv", "seemnetega", 1.20);

        juustuBurger.valiLisand1("tomat", 0.30);

        juustuBurger.valiLisand2("salat", 0.45);

        juustuBurger.valiLisand3("juust", 0.90);

        juustuBurger.koostaBurger();

    }
}

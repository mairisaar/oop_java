public class Burgerid {
    public static void main(String[] args) {

        Burger juustuBurger = new Burger("juustu", "pihv", "seemnetega", 1.20);
        TervislikBurger vege = new TervislikBurger("taimne", 1.80);

        juustuBurger.valiLisand1("tomat", 0.30);

        juustuBurger.valiLisand2("salat", 0.45);

        juustuBurger.valiLisand3("juust", 0.90);

        juustuBurger.valiLisand4("kurk", 0.22);

        juustuBurger.koostaBurger();


        vege.valiTervislikLisand1("idud", 1.1);

        vege.valiTervislikLisand2("soja", 0.80);

        vege.koostaBurger();

    }


}

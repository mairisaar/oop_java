public class Burgerid {
    public static void main(String[] args) {

        Burger juustuBurger = new Burger("juustu", "pihv", "seemnetega", 1.20);
        TervislikBurger vege = new TervislikBurger("taimne", 1.80);

        LuxBurger lux = new LuxBurger();

        juustuBurger.valiLisand1("tomat", 0.30);

        juustuBurger.valiLisand2("salat", 0.40);

        juustuBurger.valiLisand3("juust", 0.90);

        juustuBurger.valiLisand4("kurk", 0.20);

        juustuBurger.koostaBurger();


        vege.valiLisand1("tomat", 0.30);

        vege.valiLisand2("salat", 0.40);

        vege.valiLisand3("juust", 0.90);

        vege.valiLisand4("kurk", 0.20);

        vege.valiTervislikLisand1("idud", 1.10);

        vege.valiTervislikLisand2("soja", 0.80);

        vege.koostaBurger();

        lux.koostaBurger();

    }


}

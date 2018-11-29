public class AutoTest {
    public static void main(String[] args) {
        Auto mingiAuto = new Auto("Mingi Auto", 40);

        mingiAuto.kaivita();
        mingiAuto.kiirenda();
        mingiAuto.pidurda();

        Toyota avensis = new Toyota("Avensis", 108);

        avensis.kaivita();
        avensis.kiirenda();
        avensis.pidurda();

        Toyota aygo = new Toyota("Aygo", 53);

        aygo.kaivita();
        aygo.kiirenda();
        aygo.pidurda();
    }
}

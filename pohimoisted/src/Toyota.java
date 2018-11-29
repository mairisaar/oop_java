public class Toyota extends Auto {
    public Toyota(String nimetus, Integer voimsus) {
        super(nimetus, voimsus);
    }

    @Override
    public void kaivita() {
        System.out.println(getClass().getSimpleName() + " " + this.getNimetus() + " käivitus");
    }

    @Override
    public void kiirenda() {
        System.out.println(getClass().getSimpleName() + " " + this.getNimetus() + " kiirendas");
    }

    @Override
    public void pidurda() {
        System.out.println(getClass().getSimpleName() + " " + this.getNimetus() + " pidurdas");
    }
}

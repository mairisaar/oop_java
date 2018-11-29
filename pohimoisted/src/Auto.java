public class Auto {
    private String nimetus;
    private Integer ratasteArv;
    private Boolean mootor;
    private Integer voimsus;

    public Auto(String nimetus, Integer voimsus) {
        this.nimetus = nimetus;
        this.voimsus = voimsus;
        this.ratasteArv = 4;
        this.mootor = true;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void kaivita() {
        System.out.println("Auto käivitus");
    }

    public void kiirenda() {
        System.out.println("Auto kiirendas");
    }

    public void pidurda() {
        System.out.println("Auto pidurdas");
    }
}

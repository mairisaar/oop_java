public class Lamp {
    private String nimetus;
    private Boolean kasPatareidega;
    private Boolean sisseLulitatud = false;

    public Lamp(String nimetus, Boolean kasPatareidega) {
        this.nimetus = nimetus;
        this.kasPatareidega = kasPatareidega;
    }

    public String getNimetus() {
        return nimetus;
    }

    public Boolean getKasPatareidega() {
        return kasPatareidega;
    }

    public Boolean getSisseLulitatud() {
        return sisseLulitatud;
    }

    public void setSisseLulitatud(Boolean sisseLulitatud) {
        this.sisseLulitatud = sisseLulitatud;
    }

    public void lulita() {
        if (sisseLulitatud == false) {
            sisseLulitatud = true;
            System.out.println("Lamp on sisse lülitatud");
        } else {
            sisseLulitatud = false;
            System.out.println("Lamp on välja lülitatud");
        }
    }
}

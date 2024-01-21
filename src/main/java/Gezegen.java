public enum Gezegen {

    MERKUR(1, 57, 2442, 176),
    VENUS(2, 110, 6173, 243),
    DUNYA(3, 148, 6354, 24),
    MARS(4, 230, 3383, 24),
    JUPITER(5, 780, 71323, 9),
    SATURN(6, 1438, 62154, 10),
    URANUS(7, 2970, 25883, 18),
    NEPTUN(8, 4568, 24569, 16);

    private int siraNo;
    private int uzaklik;
    private int yaricap;
    private int donmeSuresi;


    Gezegen(int siraNo, int uzaklik, int yaricap, int donmeSuresi) {
        this.siraNo = siraNo;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiraNo() {
        return siraNo;
    }

    public int getUzaklik() {
        return uzaklik;
    }

    public int getYaricap() {
        return yaricap;
    }

    public int getDonmeSuresi() {
        return donmeSuresi;
    }

}

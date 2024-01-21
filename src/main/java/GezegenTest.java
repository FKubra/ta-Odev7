public class GezegenTest {

    public static void main(String[] args) {

        for(Gezegen g : Gezegen.values()){
            System.out.println(g +" => Güneş sisteminde " + g.getSiraNo() + ". sırada, Güneş'e olan uzaklığı " + g.getUzaklik() + " km, yarıçapı " + g.getYaricap() + " km ve dönme süresi " + g.getDonmeSuresi() + " saattir." );
        }

    }

}

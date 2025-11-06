import java.util.Date;

public class Main{
    public static void main(String args[]){


        Sensore blu = new Sensore();
        Registro bergamo= new Registro();
        blu.setIndirizzoIP("192.168.0.0");
        blu.setLatitudine(45.4642);
        blu.setLongitudine(9.1900);
        blu.setDataUltimaSostituzione(new Date());
        blu.setDataSostituzioneBatteria(new Date(System.currentTimeMillis() - 30L * 24 * 60 * 60 * 1000));


        Sensore sensore1 = new Sensore();
        sensore1.setIndirizzoIP("192.168.0.10");
        sensore1.setLatitudine(45.4642);
        sensore1.setLongitudine(9.1900);
        sensore1.setDataUltimaSostituzione(new Date());
        sensore1.setDataSostituzioneBatteria(new Date(System.currentTimeMillis() - 30L * 24 * 60 * 60 * 1000));



        Coordinate milano = new Coordinate(45.000,9.000,46.000,10.000);
        bergamo.area();


        bergamo.aggiungi(sensore1);
        bergamo.aggiungi(blu);


        System.out.println(sensore1);
        System.out.println(bergamo);

        System.out.println(bergamo.trovadaindirizzoIP("192.168.0.0"));


    }
}
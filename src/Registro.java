public class Registro {

    private Sensore[] elenco;
    private int size;


    public Registro(){
        elenco = new Sensore[10];
        size = 0;

    }


    //ricerca sensore da area
    public void cercadaarea(double latmax, double latmin, double longmin, double longmax){

        Sensore

    }







    //ricerca sensore da 365 giorni di cambio della batteria










    public void aggiungi(Sensore t){
        elenco[size] = t;
        size++;
    }


    public int trovadaindirizzoIP(String indirizzoIP) {
        int posizione = -1;
        for (int i = 0; i < size; i++) {
            if (elenco[i].getIndirizzoIP().equals(indirizzoIP)) {
                posizione = i;
                break;
            }
        }
        return -1;  //da finire
    }




    public void eliminadaindirizzoIP(String indirizzoIP) {
        int posizione = -1;
        for (int i = 0; i < size; i++) {
            if (elenco[i].getIndirizzoIP().equals(indirizzoIP)) {
                posizione = i;
                break;
            }
        }
        if (posizione != -1) {
            for (int i = posizione; i < size - 1; i++) {
                elenco[i] = elenco[i + 1];
            }
            size--;
        }
    }







    public String toString(){
        String toReturn = "Registro[";
        for(int i = 0; i < size; i++){
            toReturn += elenco[i].toString();
            if(i < size - 1) toReturn += ", ";
        }
        toReturn += "]";
        return toReturn;
    }

}

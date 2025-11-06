public class Registro {

    private Sensore[] elenco;
    private int size;

    public Registro(){
        elenco = new Sensore[10];
        size = 0;
    }



    public void aggiungi(Sensore t){
        elenco[size] = t;
        size++;
    }


    public int trovadaindirizzoIP(Sensore t){
        for(int i = 0; i < size; i++){
            if(elenco[i].getIndirizzoIP() == t.getIndirizzoIP()){
                return i;
            }
        }
        return -1;
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

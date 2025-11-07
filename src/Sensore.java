import java.util.Date;

public class Sensore {

    private String indirizzoIP;
    private Date dataSostituzioneBatteria;
    private Date dataUltimaSostituzione;


    Date oggi = new Date();


    public void setIndirizzoIP(String indirizzoIP) {
        this.indirizzoIP = indirizzoIP;
    }

    public String getIndirizzoIP() {
        return indirizzoIP;
    }


    public void setDataSostituzioneBatteria(Date dataSostituzioneBatteria) {
        this.dataSostituzioneBatteria = dataSostituzioneBatteria;
    }

    public Date getDataSostituzioneBatteria() {
        return dataSostituzioneBatteria;
    }

    public void setDataUltimaSostituzione(Date dataUltimaSostituzione) {
        this.dataUltimaSostituzione = dataUltimaSostituzione;
    }

    public Date getDataUltimaSostituzione() {
        return dataUltimaSostituzione;
    }





    public String toString() {
        return "SENSORE{ "+"  IndirizzoIP  "+ indirizzoIP +  "  ultima data di sostituzione  "+ dataUltimaSostituzione+"  data della sostituzione della batteria  "+dataSostituzioneBatteria+"}";
    }


}

public class Coordinate {



    private double latitudinemax;
    private double latitudinemin;
    private double longitutidemax;
    private double longitudinemin;
    private double superficie;

    public Coordinate(double latitudinemin,double longitudinemin, double latitudinemax, double longitutidemax){
        this.latitudinemax=latitudinemax;
        this.latitudinemin=latitudinemin;
        this.longitutidemax=longitutidemax;
        this.longitudinemin=longitudinemin;
    }

    public void setLatitudinemax(double latitudinemax) {
        this.latitudinemax = latitudinemax;
    }

    public double getLatitudinemax() {
        return latitudinemax;
    }

    public double getlongitudinemin() {
        return longitudinemin;
    }

    public void setLongitutidemin(double longitutidemin) {
        longitudinemin = longitutidemin;
    }

    public void setLongitutidemax(double longitutidemax) {
        this.longitutidemax = longitutidemax;
    }

    public void setLatitudinemin(double latitudinemin) {
        this.latitudinemin = latitudinemin;
    }


    public double getLongitutidemax() {
        return longitutidemax;
    }

    public double getLatitudinemin() {
        return latitudinemin;
    }

    public boolean area(double latitudine, double longitudine) {

        if(latitudine <= latitudinemin && latitudine >= latitudinemax && longitudine <= longitudinemin && longitudine >= longitutidemax) {
            return false;
        }else {
            return true;
        }
    }

}



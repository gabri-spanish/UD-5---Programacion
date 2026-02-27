package org.example.exath;

public enum TipoSer {
    THERIAN(0.0),DOMESTICO(10.0),EXOTICO(50.0);



    private final double comision;
    TipoSer(double comision) {
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }


}

package org.example.exament6;

public enum CategoriaDrift {
    STREET(50.0), PRO(150.0), HYPER_DRIFT(300.0);


    private final double pago;
    CategoriaDrift(double pago) {
        this.pago = pago;
    }

    public double getPago() {
        return pago;
    }
}

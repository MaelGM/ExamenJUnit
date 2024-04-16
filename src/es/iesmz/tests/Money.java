package es.iesmz.tests;

public class Money {
    private final double K_EURtoUSD = 1.18798;
    private final double K_USDtoEUR = 0.841815;
    private final double K_EURtoGBP = 0.857839;
    private final double K_GBPtoEUR = 1.165826;

    public Money() {}

    public float change(TipoMoneda origen, TipoMoneda destino, float money) {
        if (money < 0) return -1f;
        if (!origen.equals(TipoMoneda.EUR) && !origen.equals(TipoMoneda.GBP) && !origen.equals(TipoMoneda.USD)) return -1f;
        if (!destino.equals(TipoMoneda.EUR) && !destino.equals(TipoMoneda.GBP) && !destino.equals(TipoMoneda.USD)) return -1f;


        return 1;
    }
}

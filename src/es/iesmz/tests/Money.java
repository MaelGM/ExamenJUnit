package es.iesmz.tests;

public class Money {
    private final double K_EURtoUSD = 1.18798;
    private final double K_USDtoEUR = 0.841815;
    private final double K_EURtoGBP = 0.857839;
    private final double K_GBPtoEUR = 1.165826;
    private final double K_GBPtoUSD = 1.3849f;
    private final double K_USDtoGBP = 1-0.27786f;

    public Money() {}

    public float change(TipoMoneda origen, TipoMoneda destino, float money) {
        if (money < 0) return -1f;
        if (!origen.equals(TipoMoneda.EUR) && !origen.equals(TipoMoneda.GBP) && !origen.equals(TipoMoneda.USD)) return -1f;
        if (!destino.equals(TipoMoneda.EUR) && !destino.equals(TipoMoneda.GBP) && !destino.equals(TipoMoneda.USD)) return -1f;

        if (origen == TipoMoneda.USD && destino == TipoMoneda.EUR) return (float) (money * K_USDtoEUR);
        if (origen == TipoMoneda.GBP && destino == TipoMoneda.EUR) return (float) (money * K_GBPtoEUR);

        if (origen == TipoMoneda.EUR && destino == TipoMoneda.USD) return (float) (money * K_EURtoUSD);
        if (origen == TipoMoneda.EUR && destino == TipoMoneda.GBP) return (float) (money * K_EURtoGBP);

        if (origen == TipoMoneda.USD && destino == TipoMoneda.GBP) return (float) (money * K_USDtoGBP);
        if (origen == TipoMoneda.GBP && destino == TipoMoneda.USD) return (float) (money * K_GBPtoUSD);

        return money;
    }
}

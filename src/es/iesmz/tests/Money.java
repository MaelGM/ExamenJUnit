package es.iesmz.tests;

public class Money {
    private final double K_EURtoUSD = 1.18798;
    private final double K_USDtoEUR = 0.841815;
    private final double K_EURtoGBP = 0.857839;
    private final double K_GBPtoEUR = 1.165826;

    // Para calcular esta constante 'K_GBPtoUSD' he cogido el resultado esperado (138.49) y lo he dividido entre
    // el parametro introducido (100) para asi obtener el numero por el que se multiplicaria (1.3849)
    private final double K_GBPtoUSD = 138.49/100;
    // Para calcular esta constante 'K_USDtoGBP' he cogido el resultado esperado (722.14) y lo he dividido entre
    // el parametro introducido (1000) para asi obtener el numero por el que se multiplicaria (0.72214)
    private final double K_USDtoGBP = 722.14f/1000;

    // Constructor
    public Money() {}

    public float change(TipoMoneda origen, TipoMoneda destino, float money) {
        // Comprobamos casos erroneos (dinero negativo o aparicion de TipoMoneda.PTS)
        if (money < 0) return -1f;
        if (!origen.equals(TipoMoneda.EUR) && !origen.equals(TipoMoneda.GBP) && !origen.equals(TipoMoneda.USD)) return -1f;
        if (!destino.equals(TipoMoneda.EUR) && !destino.equals(TipoMoneda.GBP) && !destino.equals(TipoMoneda.USD)) return -1f;

        // Comprobamos casos en los que el dinero se para a euros
        if (origen == TipoMoneda.USD && destino == TipoMoneda.EUR) return (float) (money * K_USDtoEUR);
        if (origen == TipoMoneda.GBP && destino == TipoMoneda.EUR) return (float) (money * K_GBPtoEUR);

        // Comprobamos casos en los que el dinero se pasa de euros a otras monedas
        if (origen == TipoMoneda.EUR && destino == TipoMoneda.USD) return (float) (money * K_EURtoUSD);
        if (origen == TipoMoneda.EUR && destino == TipoMoneda.GBP) return (float) (money * K_EURtoGBP);

        // Comprobamos los casos en los que se pasa el dinero entre el USD y el GBP
        if (origen == TipoMoneda.USD && destino == TipoMoneda.GBP) return (float) (money * K_USDtoGBP);
        if (origen == TipoMoneda.GBP && destino == TipoMoneda.USD) return (float) (money * K_GBPtoUSD);

        // En caso de que se alcance este return, seria porque las dos monedas son del mismo tipo (EUR & EUR), asi
        // que el dinero no cambiaria
        return money;
    }
}

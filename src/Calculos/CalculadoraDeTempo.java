package Calculos;
import Modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal = titulo.getDuracaoEmMinutos();
    }

}

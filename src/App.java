import java.util.ArrayList;

import Calculos.CalculadoraDeTempo;
import Calculos.FiltroRecomendacao;
import Modelos.Episodio;
import Modelos.Filme;
import Modelos.Serie;

public class App {
    public static void main(String[] args) {
        // Objeto Filme
        Filme meuFilme = new Filme("O Poderoso Chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(7);

        System.out.println("A duração do Filme é: " + meuFilme.getDuracaoEmMinutos());

        // Objeto Série
        Serie minhaSerie = new Serie("Breaking Bad", 2007);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosPorTemporada(8);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println("A duração da Serie é: " + minhaSerie.getDuracaoEmMinutos());

        // Objeto Calculadora
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        // Objeto Filtro
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        // Objeto Episodio
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        // Objeto Filme
        var novoFilme = new Filme("Velozes e Furiosos",2023); // Inferência na criação de variavel do tipo filme
        novoFilme.setNome("Velozes e Furiosos");
        novoFilme.setDuracaoEmMinutos(140);
        novoFilme.avalia(10);

        // Objeto Filme
        var ultimoFilme = new Filme("Vida de Inseto",1999);
        ultimoFilme.setDuracaoEmMinutos(120);
        ultimoFilme.avalia(5.6);

        // Criação de Array de valores
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(novoFilme);
        listaDeFilmes.add(ultimoFilme);

        System.out.println("Tamanho da lista : " + listaDeFilmes.size());

        // Após dar Override no toString da classe Filme esse é o resultado
        System.out.println(listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);
    }
}
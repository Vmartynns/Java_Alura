package Principal;

import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
    Filme meuFilme = new Filme("O Poderoso Chefão",1970);
    Serie minhaSerie = new Serie("Breaking Bad", 2007);
    var novoFilme = new Filme("Velozes e Furiosos",2023);
    var ultimoFilme = new Filme("Vida de Inseto",1999);

    ArrayList<Titulo> lista = new ArrayList<>();
    lista.add(meuFilme);
    meuFilme.avalia(10);
    lista.add(novoFilme);
    novoFilme.avalia(6);
    lista.add(ultimoFilme);
    ultimoFilme.avalia(8);
    lista.add(minhaSerie);
    minhaSerie.avalia(8);
    
    for (Titulo titulo : lista) {
        System.out.println(titulo.getNome());

        if(titulo instanceof Filme filme && filme.getClassificacao() > 2){
            System.out.println("Classificação : " + filme.getClassificacao());
        }
    }

    ArrayList<String> buscaPorArtista = new ArrayList<>();
    buscaPorArtista.add("Ednaldo");
    buscaPorArtista.add("Vitor");
    buscaPorArtista.add("Adam");
    buscaPorArtista.add("Victória");

    System.out.println(buscaPorArtista);
    
    System.out.println("Depois da ordenação por ordem alfabética: ");
    Collections.sort(buscaPorArtista);
    System.out.println(buscaPorArtista);

    // Ordenando a lista de titulos
    Collections.sort(lista);
    System.out.println(lista);
    
    lista.sort(Comparator.comparing(Titulo :: getAnoDeLancamento));
    System.out.println("Ordenando por ano");
    System.out.println(lista);
    }
}

package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalListas {
    static void main() {
        Filme meuFilme = new Filme("O poderoso chefão", 170);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeRoyson = new Filme("Megamente", 2010);
        filmeRoyson.avalia(10);
        Serie lost = new Serie("Lost",2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeRoyson);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for(Titulo item: lista)  {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Jack Black");
        buscaPorArtista.add("Will Smith");
        buscaPorArtista.add("Tom Cruise");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando pr ano");
        System.out.println(lista);
    }
}

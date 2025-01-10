package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);

        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        List<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for(Titulo item : lista) {
            System.out.println("Nome: " +item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " +filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandles");
        buscaPorArtista.add("The Weeknd");
        buscaPorArtista.add("Adam Sandles");

        System.out.println("Antes da comparação");
        System.out.println(lista);
        System.out.println("Depois da comparação");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("Depois da comparação por ano de lançamento");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

        Map<String, Integer> usandoHashMap = new HashMap<>();

        // Adicionando pares chave-valor
        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorros", 2);
        usandoHashMap.put("Roedores", 3);

        // Acessando um valor através de uma chave
        int valor = usandoHashMap.get("Cachorros");
        System.out.println("Valor da chave Cachorros: " + valor);

        // Removendo um par chave-valor
        usandoHashMap.remove("Gatos");

        // Iterando sobre as chaves
        for (String chave : usandoHashMap.keySet()) {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + usandoHashMap.get(chave));
        }

        System.out.println("-------");
        System.out.println(usandoHashMap.keySet());
    }
}

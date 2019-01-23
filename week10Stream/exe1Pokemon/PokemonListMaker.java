package week10Stream.exe1Pokemon;

import week9Stream.exe4WorldHappiness.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonListMaker {
    private FileReader reader = new FileReader();
    private List<String> data = reader.asList("week10Stream/exe1Pokemon/pokemon.csv");


    List<Pokemon> getPokemonList(){
        List<Pokemon> pokemonList;
        return pokemonList = data.stream()
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Pokemon(e[1], e[2], e[3], e[9],Integer.valueOf(e[10]),Boolean.valueOf(e[12])))
                .collect(Collectors.toList());

    }
}

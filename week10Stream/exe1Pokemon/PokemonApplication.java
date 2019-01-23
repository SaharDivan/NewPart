package week10Stream.exe1Pokemon;

import week10Stream.exe1Pokemon.Pokemon;
import week9Stream.exe4WorldHappiness.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonApplication {

    public static void main(String[] args) {
        PokemonListMaker pokemonListMaker = new PokemonListMaker();
        List<Pokemon> pokemonList = pokemonListMaker.getPokemonList();
        PokemonStatistics statistics = new PokemonStatistics();

        statistics.getTotalNumber(pokemonList);
        statistics.getNumberOfType1(pokemonList);
        statistics.getNumberOfType2(pokemonList);
        statistics.groupByType1(pokemonList);
        statistics.groupByGeneration(pokemonList);
        statistics.getTopThreeFastest(pokemonList);
        statistics.groupByLegacy(pokemonList);
        statistics.getTotalNames(pokemonList);
        statistics.getTotalLetters(pokemonList);
        statistics.getFastestWithSpeedHigherThan100(pokemonList);
        statistics.getAllFastPokemon(pokemonList);
        statistics.getAnyMatchPokemonWithSpeed100(pokemonList);
        statistics.getAnyMatchPokemonWithSpeed100AndGeneration2(pokemonList);
    }
}

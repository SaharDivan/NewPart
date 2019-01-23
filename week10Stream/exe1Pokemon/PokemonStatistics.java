package week10Stream.exe1Pokemon;

import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokemonStatistics {

    void getTotalNumber(List<Pokemon> pokemonList){
        System.out.println("Number of Pokemon: \n");
        long numberPokemon = pokemonList.stream()
                .count();
        System.out.println("How many Pokemon exist? "+ numberPokemon);
    }

    void getTotalNames(List<Pokemon> pokemonList){
        System.out.println("Number of Pokemon names: \n");
        List<String> pokemonNames = pokemonList.stream()
                .map(e -> e.getName())
                .sorted()
                .distinct()
                .collect(Collectors.toList());
                pokemonNames.stream()
                    .collect(Collectors.groupingBy(e -> e.charAt(0)))
                    .entrySet().stream()
                    .forEach( System.out::println);

                pokemonNames.stream()
                        .collect(Collectors.groupingBy(e-> e.length()))
                        .entrySet().stream()
                        .forEach(System.out::println);
                pokemonNames.stream()
                        .collect(Collectors.groupingBy(e-> e.charAt(e.length()-1)))
                        .entrySet().stream()
                        .forEach(System.out::println);

    }

    void getTotalLetters(List<Pokemon> pokemonList){
        Map<Object, Long> counted = pokemonList.stream()
                .map(e -> e.getName())
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .map(e -> e.charAt(0))
                .filter(e -> Character.isAlphabetic(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(counted);
    }

    void getNumberOfType1(List<Pokemon> pokemonList) {
        long typeOnePokemon = pokemonList.stream()
                .map(e -> e.getType1())
                .distinct()
                .count();
        System.out.println("How many type1 of Pokemon exist? " + typeOnePokemon);
    }

    void getNumberOfType2(List<Pokemon> pokemonList) {
        long typeTwoPokemon = pokemonList.stream()
                .map(e -> e.getType2())
                .distinct()
                .count();
        System.out.println("How many type1 of Pokemon exist? " + typeTwoPokemon);
    }


    void groupByType1(List<Pokemon> pokemonList) {
        pokemonList.stream()
                .collect(Collectors.groupingBy(e -> e.getType1(), Collectors.toList()))
                .entrySet().stream()
                .forEach(e-> System.out.println("Grouping by type one "+e + " \n "));
    }

    void groupByGeneration(List<Pokemon> pokemonList) {
        pokemonList.stream()
                .collect(Collectors.groupingBy(e -> e.getGeneration(), Collectors.toList()))
                .entrySet().stream()
                .forEach(e-> System.out.println("Grouping by type generation "+ e + " \n "));
    }


    void groupByLegacy(List<Pokemon> pokemonList) {
        pokemonList.stream()
                .collect(Collectors.groupingBy(e -> e.getLegendary()))
                .entrySet().stream()
                .forEach(e-> System.out.println(" \n \n"+e));

    }

    void getTopThreeFastest(List<Pokemon> pokemonList){
        List<Pokemon> topThreeSpead = pokemonList.stream()
                .sorted(Comparator.comparing(Pokemon::getSpeed).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Which are the top three speedy Pokemons? " +  topThreeSpead);

    }

    void getFastestWithSpeedHigherThan100(List<Pokemon> pokemonList){
        Pokemon pokemonFast = pokemonList.stream()
                .sorted(Comparator.comparing(Pokemon::getSpeed).reversed())
                .filter(e -> e.getSpeed() > 100)
                .findAny()
                .get();
        System.out.println("Which are top speedy Pokemon? " +  pokemonFast);

    }

    void getAllFastPokemon(List<Pokemon> pokemonList){
        Optional<Pokemon> pokemonFast = pokemonList.stream()
                .sorted(Comparator.comparing(Pokemon::getSpeed).reversed())
                .filter(e -> e.getSpeed() >= 100)
                .findFirst();


        System.out.println("Which are the first speedy Pokemon? " +  pokemonFast.get());

    }

    void getAnyMatchPokemonWithSpeed100(List<Pokemon> pokemonList){
        boolean anyMatch = pokemonList.stream()
                .anyMatch(e -> e.getSpeed().equals(100));
        System.out.println("Is there a Pokemon with speed 100? " +anyMatch);
    }

    void getAnyMatchPokemonWithSpeed100AndGeneration2(List<Pokemon> pokemonList){
        boolean anyMatch = pokemonList.stream()
                .allMatch(e-> e.getSpeed().equals(100) && e.getGeneration().equals(2));
        System.out.println("Is there a Pokemon with speed 100 and generation 2? " +anyMatch);
    }
}

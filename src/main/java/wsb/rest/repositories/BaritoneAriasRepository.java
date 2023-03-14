package wsb.rest.repositories;

import org.springframework.stereotype.Repository;
import wsb.rest.models.BaritoneArias;

import java.util.LinkedList;
import java.util.List;

@Repository
public class BaritoneAriasRepository {

    private List<BaritoneArias> arias = new LinkedList<>() {{
        add(new BaritoneArias(1L, "Largo al factotum", "Figaro", "Gioachino Rossini", "The Barber of Seville", 1816L, "Italian"));
        add(new BaritoneArias(2L, "Di Provenza il mar", "Germont", "Giuseppe Verdi", "La traviata", 1853L, "Italian"));
        add(new BaritoneArias(3L, "Votre toast, je peux vous le rendre", "Escamillo", "Georges Bizet", "Carmen", 1875L, "French"));
        add(new BaritoneArias(4L, "Bella siccome un angelo", "Don Pasquale", "Gaetano Donizetti", "Don Pasquale", 1843L, "Italian"));
        add(new BaritoneArias(5L, "Hai già vinta la causa!", "Count Almaviva", "Wolfgang Amadeus Mozart", "The Marriage of Figaro", 1786L, "Italian"));
        add(new BaritoneArias(6L, "Là ci darem la mano", "Don Giovanni", "Wolfgang Amadeus Mozart", "Don Giovanni", 1787L, "Italian"));
        add(new BaritoneArias(7L, "Non più andrai", "Figaro", "Wolfgang Amadeus Mozart", "The Marriage of Figaro", 1786L, "Italian"));
        add(new BaritoneArias(8L, "Papageno's Aria", "Papageno", "Wolfgang Amadeus Mozart", "The Magic Flute", 1791L, "German"));
        add(new BaritoneArias(9L, "Bella siccome un angelo", "Belcore", "Gaetano Donizetti", "The Elixir of Love", 1832L, "Italian"));
        add(new BaritoneArias(10L, "La ci darem la mano", "Guglielmo", "Wolfgang Amadeus Mozart", "Così fan tutte", 1790L, "Italian"));
        add(new BaritoneArias(11L, "Largo al factotum", "Figaro", "Gioachino Rossini", "The Barber of Seville", 1816L, "Italian"));
        add(new BaritoneArias(12L, "Di Provenza il mar", "Germont", "Giuseppe Verdi", "La traviata", 1853L, "Italian"));
        add(new BaritoneArias(13L, "Votre toast, je peux vous le rendre", "Escamillo", "Georges Bizet", "Carmen", 1875L, "French"));
        add(new BaritoneArias(14L, "Bella siccome un angelo", "Don Pasquale", "Gaetano Donizetti", "Don Pasquale", 1843L, "Italian"));
        add(new BaritoneArias(15L, "Eri tu", "Renato", "Giuseppe Verdi", "Un ballo in maschera", 1859L, "Italian"));
        add(new BaritoneArias(16L, "Avant de quitter ces lieux", "Valentin", "Charles Gounod", "Faust", 1859L, "French"));
        add(new BaritoneArias(17L, "Prologue: Aleko's cavatina", "Aleko", "Sergei Rachmaninoff", "Aleko", 1893L, "Russian"));
        add(new BaritoneArias(18L, "Nemico della patria", "Gerard", "Umberto Giordano", "Andrea Chénier", 1896L, "Italian"));
        add(new BaritoneArias(19L, "Di sposo, di padre", "Iago", "Giuseppe Verdi", "Otello", 1887L, "Italian"));
        add(new BaritoneArias(20L, "Vision fugitive", "Andréi Chouisky", "Peter Ilyich Tchaikovsky", "The Queen of Spades", 1890L, "Russian"));
        add(new BaritoneArias(21L, "Pierrot's Tanzlied", "Pierrot", "Arnold Schoenberg", "Die Dreigroschenoper", 1928L, "German"));
        add(new BaritoneArias(22L, "Ya vas lyublyu", "Onegin", "Pyotr Ilyich Tchaikovsky", "Eugene Onegin", 1879L, "Russian"));
        add(new BaritoneArias(23L, "Pari siamo", "Rigoletto", "Giuseppe Verdi", "Rigoletto", 1851L, "Italian"));
        add(new BaritoneArias(24L, "Toreador Song", "Toreador", "Georges Bizet", "Carmen", 1875L, "French"));
    }};

    public List<BaritoneArias> findAll() {

        return arias;
    }
}

package wsb.rest.repositories;

import org.springframework.stereotype.Repository;
import wsb.rest.models.Aria;

import java.util.LinkedList;
import java.util.List;

@Repository
public class AriaRepository {

    static Long currentId = 25L;

    private List<Aria> arias = new LinkedList<>() {{
        add(new Aria(1L, "Largo al factotum", "Figaro", "Gioachino Rossini", "The Barber of Seville", 1816L, "Italian"));
        add(new Aria(2L, "Di Provenza il mar", "Germont", "Giuseppe Verdi", "La traviata", 1853L, "Italian"));
        add(new Aria(3L, "Votre toast, je peux vous le rendre", "Escamillo", "Georges Bizet", "Carmen", 1875L, "French"));
        add(new Aria(4L, "Bella siccome un angelo", "Don Pasquale", "Gaetano Donizetti", "Don Pasquale", 1843L, "Italian"));
        add(new Aria(5L, "Hai già vinta la causa!", "Count Almaviva", "Wolfgang Amadeus Mozart", "The Marriage of Figaro", 1786L, "Italian"));
        add(new Aria(6L, "Là ci darem la mano", "Don Giovanni", "Wolfgang Amadeus Mozart", "Don Giovanni", 1787L, "Italian"));
        add(new Aria(7L, "Non più andrai", "Figaro", "Wolfgang Amadeus Mozart", "The Marriage of Figaro", 1786L, "Italian"));
        add(new Aria(8L, "Papageno's Aria", "Papageno", "Wolfgang Amadeus Mozart", "The Magic Flute", 1791L, "German"));
        add(new Aria(9L, "Bella siccome un angelo", "Belcore", "Gaetano Donizetti", "The Elixir of Love", 1832L, "Italian"));
        add(new Aria(10L, "La ci darem la mano", "Guglielmo", "Wolfgang Amadeus Mozart", "Così fan tutte", 1790L, "Italian"));
        add(new Aria(11L, "Largo al factotum", "Figaro", "Gioachino Rossini", "The Barber of Seville", 1816L, "Italian"));
        add(new Aria(12L, "Di Provenza il mar", "Germont", "Giuseppe Verdi", "La traviata", 1853L, "Italian"));
        add(new Aria(13L, "Votre toast, je peux vous le rendre", "Escamillo", "Georges Bizet", "Carmen", 1875L, "French"));
        add(new Aria(14L, "Bella siccome un angelo", "Don Pasquale", "Gaetano Donizetti", "Don Pasquale", 1843L, "Italian"));
        add(new Aria(15L, "Eri tu", "Renato", "Giuseppe Verdi", "Un ballo in maschera", 1859L, "Italian"));
        add(new Aria(16L, "Avant de quitter ces lieux", "Valentin", "Charles Gounod", "Faust", 1859L, "French"));
        add(new Aria(17L, "Prologue: Aleko's cavatina", "Aleko", "Sergei Rachmaninoff", "Aleko", 1893L, "Russian"));
        add(new Aria(18L, "Nemico della patria", "Gerard", "Umberto Giordano", "Andrea Chénier", 1896L, "Italian"));
        add(new Aria(19L, "Di sposo, di padre", "Iago", "Giuseppe Verdi", "Otello", 1887L, "Italian"));
        add(new Aria(20L, "Vision fugitive", "Andréi Chouisky", "Peter Ilyich Tchaikovsky", "The Queen of Spades", 1890L, "Russian"));
        add(new Aria(21L, "Pierrot's Tanzlied", "Pierrot", "Arnold Schoenberg", "Die Dreigroschenoper", 1928L, "German"));
        add(new Aria(22L, "Ya vas lyublyu", "Onegin", "Pyotr Ilyich Tchaikovsky", "Eugene Onegin", 1879L, "Russian"));
        add(new Aria(23L, "Pari siamo", "Rigoletto", "Giuseppe Verdi", "Rigoletto", 1851L, "Italian"));
        add(new Aria(24L, "Toreador Song", "Toreador", "Georges Bizet", "Carmen", 1875L, "French"));
    }};

    public List<Aria> findAll() {
        return arias;
    }

    public Aria find(Long id) {
        return arias.stream()
                .filter(aria -> aria.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Aria create(Aria aria) {
        Aria createdAria = new Aria(
                currentId++,
                aria.getName(),
                aria.getCharacter(),
                aria.getComposer(),
                aria.getOpera(),
                aria.getYear(),
                aria.getLanguage()
        );

        arias.add(createdAria);
        return createdAria;
    }
}

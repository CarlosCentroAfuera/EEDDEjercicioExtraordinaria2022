import org.junit.jupiter.api.Test;

public class PersonajeTest {


    Examen examen = new Examen();


    // TODO: (2,5 puntos) Piensa en que test son necesarios para probar la función "esPokemonObediente" y realizalos.
    //  Si la persona es null deberá devolver la excepción PersonaNulaException
    //  Si el pokemon tiene un nivel igual a 0 debe devolver la excepcion PokemonFallido
    //  Si la pokemon es null debe devolver PokemonNuloException:
    //  Si la persona tiene la medalla 1, los pokémon le obedecen hasta el nivel 10 (no incluido) como máximo. La función devuelve true
    //  Si la persona tiene la medalla 2, los pokémon le obedecen hasta el nivel 20 (no incluido) como máximo. La función devuelve true
    @Test
    public void testEsPokemonObediente_XXX() {
        // TODO 2,5p
        // PersonasFun.Companion.esPokemonObediente(examen.personas[0]);

    }

    // TODO: (2,5 puntos) Piensa en que test son necesarios para probar la función "corroborarTipo" y realizalos.
    //  Si el Pokémon es null deberá devolver PokemonNuloException
    //  Si el Pokémon no es ni Charmander, ni Mew ni Pikachu, devolverá PokemonFallidoException
    //  Si la pokemon es ni Charmander, devolverá "Fuego"
    //  Si la pokemon es ni Pikachu, devolverá "Eléctrico"
    //  Si la pokemon es ni Mew, devolverá "Psíquico"
    @Test
    public void testTipoPokemon_XXX() {
        // TODO 2,5p
        // PersonasFun.Companion.corroborarTipo(examen.personas[0].getPokemon());

    }

}

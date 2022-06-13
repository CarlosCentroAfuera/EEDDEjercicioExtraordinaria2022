public class Examen {

    public Pokemon[] pokemon;

    public Examen() {
        pokemon = ObtenerPersonasRequest.Companion.get();
    }


    /**
     * busca en personas aquellas Pokemon que están vivos (vida superior a 0)
     * @return array con los pokemons vivos
     */
    public Pokemon[] obtenerPokemonVivos() {
        // TODO 1p
        return pokemon;
    }

    /**
     * @return true si el pokemon está vivo
     * @param pokemon array de personas sobre las que vas a buscar
     * @throws VidaNegativaException cuando encuentras una pokemon con vida menor que 0
     * @throws NullPointerException cuando el pokemon es null es null
     */
    public boolean estaVivo(Pokemon pokemon) throws VidaNegativaException {
        // TODO 1p
        return false;
    }

    /**
     * @return cuenta los pokemon que están vivos.
     * @param pokemons array de personas sobre las que vas a buscar
     * @throws VidaNegativaException cuando encuentras una pokemon con vida menor que 0
     * @throws NullPointerException cuando el pokemon es null es null
     */
    public int contarVivos(Pokemon[] pokemons) throws VidaNegativaException {
        // TODO 1p
        return 1;
    }

    /**
     * @return devuelve una array con los pokemon que están vivos.
     * @param pokemons array de personas sobre las que vas a buscar
     * @throws VidaNegativaException cuando encuentras una pokemon con vida menor que 0
     * @throws NullPointerException cuando el pokemon es null es null
     */
    public Pokemon[] devolverVivos(Pokemon[] pokemons) throws VidaNegativaException {
        // TODO 1p
        return new Pokemon[0];
    }

    /**
     * El pokemon 1 ataca al pokemon 2 quitándole vida. El pokemon le quita tantos puntos de vida como esté marcado en su ataque.
     * Si el tipo del ataque es fuerte contra el tipo del pokemon objetivo, entonces quitará el doble.
     * Ej:
     * Ataque de Planta hace doble daño a pokemon de Agua.
     * Ataque de Agua hace doble daño a pokemon de Fuego
     * Ataque de Fuego hace doble daño a pokemon de Planta.
     * Si el ataque es de tipo normal, siempre hace le mismo daño, independientemente del tipo del enemigo.
     * @param pokemonAtacante pokemon que realiza el ataque
     * @param pokemonDefensor pokemon que recibe el daño
     * @throws VidaNegativaException cuando encuentras una persona que es null
     * @throws NullPointerException cuando el pokemon es null es null
     */
    public void atacar(Pokemon pokemonAtacante, Pokemon pokemonDefensor) throws VidaNegativaException, PokemonNuloException {
        // TODO 3p
    }

}

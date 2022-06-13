class DocumentoInvalidoException: Exception()
class PassInvalidaException: Exception()

class PokemonFun {

    companion object {
        fun obtenerPorTipos(pokemons: Array<Pokemon?>): Array<Pokemon?> {
            return pokemons.sortedBy {
                if (it == null) throw PokemonNuloException()
                if (it.vida < 0) throw VidaNegativaException()
                it.name
            }.toTypedArray()
        }

        fun obtenerPorVida(pokemons: Array<Pokemon>): Array<Pokemon> {
            return pokemons.sortedBy {
                if (it.vida < 0) throw VidaNegativaException()
                it.vida
            }.toTypedArray()
        }
    }
}
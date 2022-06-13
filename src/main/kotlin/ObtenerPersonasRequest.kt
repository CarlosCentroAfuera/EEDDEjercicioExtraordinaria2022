
class ObtenerPersonasRequest {

    companion object {
        fun get(): Array<Pokemon> {
            return arrayOf(
                Pokemon("Squirtel", "Agua", "hembra",100, Ataque("Agua", 20, 5)),
                Pokemon("Squirtel", "Agua", "hembra",100, Ataque("Agua", 20, 5)),
                Pokemon("Charmander", "Fuego", "macho",100, Ataque("Fuego", 20, 5)),
                Pokemon("Charmander", "Fuego", "macho",100, Ataque("Normal", 20, 5)),
                Pokemon("Charmander", "Fuego", "hembra",100, Ataque("Dragon", 20, 5)),
                Pokemon("Charmander", "Fuego", "hembra",100, Ataque("Fuego", 20, 5)),
                Pokemon("Bulbasaur", "Planta", "macho",100, Ataque("Planta", 20, 5)),
            )
        }
    }

}
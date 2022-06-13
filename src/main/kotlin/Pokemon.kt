

data class Pokemon (
    var name: String?,
    var type: String?,
    var genero: String?,
    var vida: Int,
    var ataque: Ataque?
)
data class Ataque (
    var tipo: String?,
    var damage: Int?,
    var puntosAccion: Int?
)
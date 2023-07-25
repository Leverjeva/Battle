interface Warrior {
    val isKilled: Boolean
    val evasion: Int
    fun attack(warrior: Warrior)
    fun getDamaged(damage: Int)
}
abstract class AbstractWarrior(
    private val maxHealth: Int,  //максимльный уровень здоровья
    override val evasion: Int,
    private val accuracy: Int, //точность - вероятность попадания
    private val weapon: AbstractWeapon, //оружие
    private var currentHealth: Int =maxHealth
) : Warrior {
    override val isKilled: Boolean
        get() = currentHealth <= 0

    override fun attack(warrior: Warrior) {
        if (accuracy.isChance() && !warrior.evasion.isChance()) {
            try{warrior.getDamaged(weapon.getAmmoForShot())
            } catch (e: NoAmmoException) {weapon.recharge()}
        } else try {weapon.getAmmoForShot()}
        catch (e: NoAmmoException) {weapon.recharge()}
    }

    override fun getDamaged(damage: Int) {
        currentHealth -= damage
    }
}
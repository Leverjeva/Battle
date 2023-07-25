enum class Ammo(private val damage: Int, private val chanceOfCriticalDamage: Int, private val criticalDamageRatio: Int) {
    RevolverAmmo(5, 25, 5),
    MachineGunAmmo(5, 10, 5),
    RifleAmmo(10, 50, 3),
    Grenade(20, 30, 2);

    fun getCurrentDamage(): Int {
        return if (chanceOfCriticalDamage.isChance())
            damage + criticalDamageRatio * damage
        else damage
    }
}
class Soldier(
    isKilled: Boolean = false,
    maxHealth: Int = 20,
    evasion: Int = 5,
    accuracy: Int = 60,
    weapon: AbstractWeapon = Weapons.createMachineGun(),
    currentHealth: Int = maxHealth
) : AbstractWarrior(maxHealth, evasion, accuracy, weapon, currentHealth)
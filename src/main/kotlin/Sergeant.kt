class Sergeant(
    isKilled: Boolean = false,
    maxHealth: Int = 30,
    evasion: Int = 10,
    accuracy: Int = 70,
    weapon: AbstractWeapon = Weapons.createMachineGun(),
    currentHealth: Int = maxHealth
) : AbstractWarrior(maxHealth, evasion, accuracy, weapon, currentHealth)
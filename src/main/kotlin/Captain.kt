class Captain(
    isKilled: Boolean = false,
    maxHealth: Int = 40,
    evasion: Int = 15,
    accuracy: Int = 80,
    weapon: AbstractWeapon = Weapons.createMachineGun(),
    currentHealth: Int = maxHealth
) : AbstractWarrior(maxHealth, evasion, accuracy, weapon, currentHealth)
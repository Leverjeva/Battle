class General(
    isKilled: Boolean = false,
    maxHealth: Int = 50,
    evasion: Int = 20,
    accuracy: Int = 90,
    weapon: AbstractWeapon = Weapons.createGrenadeLauncher(),
    currentHealth: Int = maxHealth
) : AbstractWarrior(maxHealth, evasion, accuracy, weapon, currentHealth)
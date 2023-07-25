object Weapons {
    private val revolver = object :
        AbstractWeapon(6, FireType.SingleShot, ammoInMagazine = Stack()) {
    }

    private val machineGun: AbstractWeapon = object : AbstractWeapon(30, FireType.BurstShooting(10), Stack()) {

        override fun createAmmo() = Ammo.MachineGunAmmo

        override fun recharge() {
            for (i in 0..maxBulletInMagazine)
                ammoInMagazine.push(Ammo.MachineGunAmmo)}

        override fun getAmmoForShot(): Int {
            var damageFromMachineGun = 0
            if (ammoInMagazine.stack.size<10) throw NoAmmoException()
            for (i in 0..10) {
                var damageFromBullet: Int = ammoInMagazine.pop()?.getCurrentDamage() ?: 0
                damageFromMachineGun += damageFromBullet
            }
            return damageFromMachineGun
        }
    }

    private val rifle: AbstractWeapon = object : AbstractWeapon(5, FireType.SingleShot, Stack()) {

        override fun createAmmo() = Ammo.RifleAmmo
        override fun recharge() {
            for (i in 0..maxBulletInMagazine)
                ammoInMagazine.push(Ammo.RifleAmmo)
        }
    }

    private val grenadeLauncher: AbstractWeapon = object : AbstractWeapon(1, FireType.SingleShot, Stack()) {
        fun createAmmoA() = Ammo.Grenade
        override fun recharge() {
            for (i in 0..maxBulletInMagazine)
                ammoInMagazine.push(Ammo.Grenade)
        }

        override fun getAmmoForShot(): Int {
            return ammoInMagazine.pop()?.getCurrentDamage() ?: 0
        }
    }

    fun createRevolver(): AbstractWeapon {
        return revolver
    }

    fun createMachineGun(): AbstractWeapon {
        return machineGun
    }

    fun createRifle(): AbstractWeapon {
        return rifle
    }

    fun createGrenadeLauncher(): AbstractWeapon {
        return grenadeLauncher
    }
}
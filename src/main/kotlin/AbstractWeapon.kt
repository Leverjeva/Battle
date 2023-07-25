abstract class AbstractWeapon(
    val maxBulletInMagazine: Int,
    val FireType: Any,
    var ammoInMagazine: Stack<Ammo> = Stack(),
    private var isMagazineEmpty: Boolean = true
) {
    open fun createAmmo() = Ammo.RevolverAmmo
    open fun recharge() {
        for (i in 0..maxBulletInMagazine)
            ammoInMagazine.push(Ammo.RevolverAmmo)
    }

    open fun getAmmoForShot(): Int {
        if (isEmpty()) throw NoAmmoException()
        return ammoInMagazine.pop()?.getCurrentDamage() ?: 0
    }

    open fun isEmpty(): Boolean{
        isMagazineEmpty = ammoInMagazine.isEmpty()
        return isMagazineEmpty
    }
}
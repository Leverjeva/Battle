sealed class FireType {
    object SingleShot : FireType()
    data class BurstShooting(val BurstSize: Int) : FireType()
}
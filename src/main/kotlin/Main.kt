import kotlin.random.Random

fun main() {
    println("Введите количество участников в первой команде")
    val n = readLine()?.toIntOrNull() ?: return
    println("Введите количество участников во второй команде")
    val n2 = readLine()?.toIntOrNull() ?: return

    val battle = Battle()
    battle.team1.createTeam(n)
    battle.team2.createTeam(n2)

    while (battle.getStageOfBattle() == BattleState.Progress) battle.battle()
}

fun Int.isChance(): Boolean {

    return Random.nextInt(0, 100) in 0..this
}
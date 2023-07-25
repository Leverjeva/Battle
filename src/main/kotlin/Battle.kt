class Battle {
    val team1 = Team()
    val team2 = Team()
    private var battleIsOver: Boolean = false
        get() = team1.team.size == 0 || team2.team.size == 0

    fun getStageOfBattle(): BattleState {
        if (team1.team.size != 0 && team2.team.size != 0) {
            println("Битва продолжается")
            return BattleState.Progress
        } else if (team1.team.size == 0 && team2.team.size != 0) {
            println("Вторая команда победила")
            return BattleState.SecondTeamWin
        } else if (team2.team.size == 0 && team1.team.size != 0) {
            println("Первая команда победила")
            return BattleState.FirstTeamWin
        } else {
            println("Ничья")
            return BattleState.Draw
        }
    }

    fun battle() {
        if (!battleIsOver) {
            team1.team.forEach { it.attack(team2.team.random()) }
            team2.team.forEach { it.attack(team1.team.random()) }
            team1.team.removeAll { it.isKilled }
            team2.team.removeAll { it.isKilled }

        }
    }
}
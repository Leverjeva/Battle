sealed class BattleState {
    object Progress : BattleState()

    object FirstTeamWin : BattleState()

    object SecondTeamWin : BattleState()

    object Draw : BattleState()
}
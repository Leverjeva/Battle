class Team {

    val team = mutableListOf<AbstractWarrior>()

    fun createTeam(n: Int): MutableList<AbstractWarrior>{
        for (i in 1..n){
            if (10.isChance()) team.add(General())
            else if (20.isChance()) team.add (Captain())
            else if (30.isChance()) team.add (Sergeant())
            else team.add (Soldier())
        }
        return team

    }


}
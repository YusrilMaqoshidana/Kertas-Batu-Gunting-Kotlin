package id.usereal.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    while (true){
        println("Pilih Kertas, Batu, atau Gunting!")
        print("Masukan pilihan anda : ")
        playerChoice = readln()
        val randomNumber = (1..3).random()
        when (randomNumber) {
            1 -> {
                computerChoice = "Batu"
            }
            2 -> {
                computerChoice = "Gunting"
            }
            3 -> {
                computerChoice = "Kertas"
            }
        }
        val winner = when{
            playerChoice == computerChoice -> "Sama"
            playerChoice == "Batu" && computerChoice == "Gunting" -> "Player"
            playerChoice == "Gunting" && computerChoice == "Kertas" -> "Player"
            playerChoice == "Kertas" && computerChoice == "Batu" -> "Player"
            playerChoice == "Gunting" && computerChoice == "Batu" -> "Computer"
            playerChoice == "Kertas" && computerChoice == "Gunting" -> "Computer"
            playerChoice == "Batu" && computerChoice == "Kertas" -> "Computer"
            playerChoice == "Break" -> return
            else -> "Invalid"
        }

        if (winner == "Sama"){
            println("Hasilnya sama")
        }else if(winner == "Invalid"){
            println("Invalid choice")
        } else{
            println("$winner menang")
        }
    }
}
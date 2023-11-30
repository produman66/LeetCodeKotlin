package Arrays_and_Hashing

class Solution0036 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in 0 until board.size){
            val stroke = MutableList(10) { 0 }
            val column = MutableList(10) { 0 }
            for (j in 0 until board.size){
                if (board[i][j].isDigit()) {
                    stroke[Character.digit(board[i][j], 10)] += 1
                    if (stroke[Character.digit(board[i][j], 10)] > 1){
                        return false
                    }
                }
                if (board[j][i].isDigit()) {
                    column[Character.digit(board[j][i], 10)] += 1
                    if (column[Character.digit(board[j][i], 10)] > 1){
                        return false
                    }
                }
            }
        }
        for(i in 0 until 3){
            for (j in 0 until 3){
                // Square
                //val mp= mutableMapOf<Char, Int>()
                val mp = MutableList(10) { 0 }
                for (s1 in i*3 until i*3+3){
                    for (s2 in j*3 until j*3+3){
                        if (board[s1][s2]=='.')continue

                        val ans = Character.digit(board[s1][s2], 10)
                        mp[ans]+=1
                        if (mp[ans]>1){
                            return false
                        }
                    }
                }
            }
        }
        return true
    }
}
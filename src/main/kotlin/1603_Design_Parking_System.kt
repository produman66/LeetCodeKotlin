class ParkingSystem(big: Int, medium: Int, small: Int) {
    var map = intArrayOf(big, medium, small)
    fun addCar(carType: Int): Boolean {
        if (map[carType - 1]!! > 0){
            map[carType - 1] = map[carType - 1]!! - 1
            return true
        }
        return false
    }

}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * var obj = ParkingSystem(big, medium, small)
 * var param_1 = obj.addCar(carType)
 */
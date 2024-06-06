package Lec03_OOP

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    //권장되는 이너 클래스는 static이 붙여진 이너클래스여서 기본적으로 static이 붙여진다.
    class LivingRoom(
        private val area: Double
    )

    //기본적으로 바깥참조를 못하게 되어있고 굳이 하고 싶으면 inner를 붙여야 한다.
    inner class LivingRoomInner(
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}
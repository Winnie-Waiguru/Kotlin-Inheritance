fun main(){
    var car= Car("Audi", "A3", "Black",5)
    var bus= Bus("22Tr", "single-deck", "Yellow", 70)

    car.carry(20)
    car.identity()
    var y = car.caculateParkingFee(5)
    println(y)

    var z= bus.maxTripFare(50.00)
    println(z)

    var p= bus.caculateParkingFee(12)
    println(p)



}

open class Car(var make:String, var model:String, var color: String, var capacity:Int){

    fun carry(people:Int){

        var x= people-capacity
        if (people<=capacity){
            println("Carrying $people passangers")
        }
        else{
            println("Overcapacity by $x")
        }
    }

    fun identity() {
        println("I am a $color $make $model.")
    }

     open fun caculateParkingFee(hours:Int): Int{

        var parkingFee= hours* 20
        return parkingFee
    }

}

class Bus(make:String, model:String , color:String , capacity:Int): Car(make, model, color , capacity){

    fun maxTripFare(Fare:Double):Double {

        var maxFare= Fare *capacity
           return maxFare

    }


    override fun caculateParkingFee(hours: Int): Int {
        return hours* capacity
    }



}

fun main() {
   println(isEven(listOf("cook","eat","wash","dig")))

    println(heightAverage(listOf(1.2,1.3,1.5,1.4,1.7)))

    person()



  var cars= listOf(
      Car("KCV",200),
        Car("KCN",150)
  )
    println(cars(listOf(200,150)))
}
fun isEven(evenName:List<String>):List<String>{
    var evenWords= mutableListOf<String>()
    evenName.forEachIndexed{index,character->
        if(index%2==0){
            evenWords.add(character)
        }

    }
     return evenWords

}

//data class Measurements(var height: Double, var totalheight: Double){

fun heightAverage(height:List<Double>):Pair<Double,Double>{
    var totalheight = height.sum()
    var average = height.average()
    return  Pair(totalheight,average)

}

data class PeopleInfo(var name:String,var age:Int,var weight:Int,var height:Double)
    fun person() {
        var PeopleInfo = mutableListOf(
            PeopleInfo("Jane", 23, 56, 1.1),
            PeopleInfo("Mary", 34, 76, 1.2),
            PeopleInfo("Julius", 21, 56, 1.2),
        )

        var sortedAge = PeopleInfo.sortedByDescending { peopleInfo -> peopleInfo.age }
        println(sortedAge)

            PeopleInfo.addAll(listOf(
                    PeopleInfo("Mercy", 23, 60, 1.4),
                    PeopleInfo("James", 34, 65, 1.3)
                )
            )
        println(PeopleInfo)
    }



data class Car(var registration:String,var millage:Int)
    fun cars(millage:List<Int>):Int {
        var carInfo = millage.average().toInt()
        return carInfo

    }


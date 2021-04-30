fun main() {
    println(allEvenWords(listOf("cook","eat","sweep","dig","wash","clean","read","write","watch","code")))

    println(peopleHeigthInMetres(listOf(1.2,1.3,1.5,1.4,1.7)))

    person()

    var cars= listOf(
        Car("KCV",200),
        Car("KCN",150)
    )
    println(cars(listOf(200,150)))
}


fun allEvenWords(evenName:List<String>):List<String>{
    var evenWords= mutableListOf<String>()
    evenName.forEachIndexed{index,character->
        if(index%2==0){
            evenWords.add(character)
        }
    }
    return evenWords}


fun peopleHeigthInMetres(height:List<Double>):Pair<Double,Double>{
    var totalheight = height.sum()
    var average = height.average()
    return  Pair(totalheight,average)
    }


data class People(var name:String,var age:Int,var weight:Int,var height:Double)
fun person() {
    var People = mutableListOf(
        People("Jane", 23, 56, 1.1),
        People("Mary", 34, 76, 1.2),
        People("Julius", 21, 56, 1.2),
    )
    var sortedAge = People.sortedByDescending { people -> people.age }
    println(sortedAge)

    People.addAll(listOf(
        People("Mercy", 23, 60, 1.4),
        People("James", 34, 65, 1.3)
    )
    )
    println(People)
}


data class Car(var registration:String,var millage:Int)
fun cars(millage:List<Int>):Int {
    var carInfo = millage.average().toInt()
    return carInfo
}
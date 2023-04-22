fun main(){
    statement("loice","faith","vickie","brian")
//   println( arrayOf( statement("loice","faith","vickie","brian"))
//       .contentToString())

   println(numbers(arrayOf(12,23,4,7,8,9,10)).contentToString())
  println(  numberss())
    cities()
   println( numbersss())
    items()
// println( wordline(arrayOf("me","you","us","they")))
    numArray()


}
fun statement(name1:String, name2:String,name3:String,name4:String){
println( arrayOf(name1,name2,name3,name4).contentToString())

}
fun numbers(number:Array<Int>):Array<Int>{
     return number.sortedArrayDescending()
}
fun numberss():Int {
    var numbersss = arrayOf(1, 3, 2, 4, 5, 6)

//for (i in numbersss) {
    // println (i*i)}
    var multiply = 1
    for (item in numbersss) {
        multiply *= item
    }
    return multiply

}


fun cities(){
    var capitalizecities= arrayOf("nairobi","helsinki","tokyo","rio","entebbe")
    for(city in capitalizecities){
        println(city.capitalize())
    }
}
fun numbersss():Int{
    var num2= arrayOf(1,2,3,4,5,6)
    var addition=0
    for (items in num2){
        addition+=items

    }
    return addition
}
fun items(){
    var form = arrayOf("Victoria", "Fernando", "susan", "loice","faith","Washington")
    for (items in form) {
        if (items.length > 5) {
            println( items)
        }

    }
}
//Create one function that given the below array:

//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order
fun numArray(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum =numbers[1]+numbers[4]
    println(sum)

//ii
println(numbers.indexOf((158)))
///iii
    println(numbers.sortedArray().contentToString())

}



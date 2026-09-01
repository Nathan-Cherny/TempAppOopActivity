fun main() {
    val myFTemp: Temperature = Fahrenheit(100.0)

    myFTemp.setTemp(110.0)

    println(myFTemp.getTemp())
    println(myFTemp.getTempIn(Temperature.Unit.C))
    myFTemp.setTemp(10.0)
    println(myFTemp.getTempIn(Temperature.Unit.C))
    println(myFTemp.getTemp())



}
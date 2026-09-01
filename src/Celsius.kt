class Celsius(temp: Double = 0.0) : Temperature(Unit.C, temp) {
    override fun getTemp(): Double {
        return super.getTemp(unit)
    }

    override fun getTempIn(unit: Unit): Double {
        return super.getTemp(unit)
    }
}
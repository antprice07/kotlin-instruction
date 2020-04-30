open abstract class Animal() {

    //val properties can be overridden with a var, but not vice versa

    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    open var hunger = 10

    //since these functions are always overridden in the subclasses they can be declared abstract also
    abstract fun makeNoise()

    abstract fun eat()

    open fun roam(){
        println("The Animal is roaming")
    }

    open fun sleep(){
        println("The Animal is sleeping")
    }
}
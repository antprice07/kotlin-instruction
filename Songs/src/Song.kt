class Song(val title: String, val artist: String) {

    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

fun main() {
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song ("Make Me Smile", "Steve Harley")

    songTwo.play()
    songTwo.stop()
    songThree.play()
}


//Showing how a constructor can be used in different ways to assign values
//class Dog(val name: String, var weight: Int, breed_param: String) {
//    old declaration
class Dog (val name: String, weight_param: Int, breed_param: String) {
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    var weight = weight_param
        set(value){
            //field refers to the property's backing field (underlying value of the prop) and prevents endless loops
            if (value > 0) field = value
        }
    val weightInKgs: Double
        get() = weight/2.2

    //Properties must be initialized to run the code, but can be handled later if used with the prefix lateinit as long as it's a var

    //Example of an initializer block
    init {
        println("Dog $name has been created.")
    }
    //Can have more than one initializer block that runs in order of creation
    init {
        println("The breed is $breed")
    }
}
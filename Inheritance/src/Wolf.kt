class Wolf: Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooooowl!!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}
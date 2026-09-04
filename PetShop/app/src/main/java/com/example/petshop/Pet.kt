package com.example.petshop

abstract class Pet(val name: String, var age: Int){
    abstract fun speak(): String
}

val cat = Cat("Coco", 6)

class Cat(name: String, age: Int): Pet(name, age), Pettable{
    override fun speak(): String {
        return "Meow"
    }
    override fun pet() {
        println("The cat $name is being petted")
    }
}

class Dog(name: String, age: Int): Pet(name, age), Pettable {
    override fun speak(): String {
        return "bark"
    }
    override fun pet() {
        println("The dog $name is being petted")
    }
}

val dog = Dog("Mochi", 6)


class Scorpion(name: String, age: Int): Pet(name, age) {
    override fun speak(): String {
        return "hiss"
    }
}

val scorpion = Scorpion("Stinger", 32)

val pets = mutableListOf(cat, dog, scorpion)

interface Pettable {
    fun pet()
}

val pettablePets = mutableListOf<Pettable>(cat, dog)

abstract class Mood(val date: String) {
    abstract fun mood(): String
    open fun sentence(): String = "The mood on $date is ${mood()}"

}

class Happy(date: String): Mood(date) {
    override fun mood() = "Happy"
}

class Sad(date: String): Mood(date) {
    override fun mood() = "Sad"
}


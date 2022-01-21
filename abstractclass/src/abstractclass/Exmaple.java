package abstractclass;
abstract class Animal
{
abstract void eat();
}
class Herbivores extends Animal
{
void eat()
{
System.out.print("I am a vegetarian");
}
}
class Carnivores extends Animal {
void eat()
{
System.out.print("I am non-vegetarian");
}
public static void main(String args[])
{
Animal goat = new Animal();
} 
}



	
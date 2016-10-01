class Dog
{
	int size;
	String breed;
	String name;

	void bark()
	{
		System.out.println("Wuff! Wuff!");
	}
}

class DogTestDrive
{
	public static void main (String[] args)
	{
		Dog eddi = new Dog();
		eddi.size = 40;
		eddi.bark();
		System.out.println(eddi.size);

	}
}

class Person {
	
	String name;
	int id;

	Person(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	Person(Person obj2)
	{
		this.name = obj2.name;
		this.id = obj2.id;
	}
}
class Person1 {
	public static void main(String[] args)
	{
		System.out.println("First Object");
		Person Person1 = new Person("avinash", 68);
		System.out.println("PersonName :" + Person1.name
						+ " and PersonId :" + Person1.id);

		System.out.println();
		Person Person2 = new Person(Person1);
		System.out.println(
			"Copy Constructor used Second Object");
		System.out.println("PersonName :" + Person2.name
						+ " and PersonId :" + Person2.id);
	}
}

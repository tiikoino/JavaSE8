import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonList {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();

		personList.add(new Person("アリス", 10));
		personList.add(new Person("ボブ", 20));
		personList.add(new Person("Duke1", 10));
		personList.add(new Person("Duke2", 20));
		personList.add(new Person("Duke3", 25));
		personList.add(new Person("Duke4", 22));
		personList.add(new Person("Duke5", 30));
		personList.add(new Person("Duke6", 35));
		personList.add(new Person("Duke7", 37));
		personList.add(new Person("Duke8", 40));

		System.out.println("personList:" + personList);

		List<String> nameList = personList.stream()
				.filter(f -> f.getName().startsWith("Duke"))
				.filter(f -> f.getAge() >= 20)
				.sorted(Comparator.comparingInt(Person::getAge))
				.map(Person::getName)
				.collect(Collectors.toList());

		System.out.println("nameLiet:" + nameList);
	}
}

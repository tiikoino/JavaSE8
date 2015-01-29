interface Person {
	long getId();
	default String getName() {
		return "Person getName()";
	}
}

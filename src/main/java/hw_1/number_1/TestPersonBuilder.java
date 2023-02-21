package hw_1.number_1;


public class TestPersonBuilder {


    public static void main(String[] args) {
        Person comp = new Person.PersonBuilder(
                "Иван", "Petrov", "Borisovich", "Russia", "Moscow", "312312", 25, "male").build();
        System.out.println(comp.getFirstName());
    }

}
//Создать builder для класса Person со следующими полями:
//        String firstName, String lastName, String middleName, String country, String address, String phone, int age, String gender.

package hw_1.number_1;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.country = builder.country;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
        this.gender = builder.gender;
    }


    public static class PersonBuilder {


        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;


        public PersonBuilder(String first_name, String last_name, String middle_name, String country, String address, String phone, int age, String gender) {
            this.firstName = first_name;
            this.lastName = last_name;
            this.middleName = middle_name;
            this.country = country;
            this.address = address;
            this.phone = phone;
            this.age = age;
            this.gender = gender;
        }


        public Person build() {
            return new Person(this);
        }

    }

}
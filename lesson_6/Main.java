public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[]{new Person("Иван", "Иванов", 40, "M", "89291234567"),
                new Person("Роман", "Денисов", 32, "M", "89277776576"),
                new Person("Инна", "Зайцева", 30, "F", "89164561243"),
                new Person("Евгений", "Сидоров", 21, "M", "89162534545"),
                new Person("Анна", "Петрова", 17, "F", "89056732255"),

        };

        for (Person person : people) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }

        for (Person person : people) {
            if (person.getGender() == "M") {
                person.sayHello();
            }
        }
    }
}
package be.intecbrussel;

import com.github.javafaker.Faker;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());

        Student student = new Student("Avi");
        //student.setName("Moussa");
        System.out.println(student.getName());
    }
}

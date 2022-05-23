package Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerGenerator {
    private static Faker faker = new Faker(new Locale("en-US"));

    public static String getFirstName() { return faker.name().firstName(); }

    public static String getLastName() { return faker.name().lastName(); }

    public static String getEmailAddress() { return faker.internet().emailAddress(); }

    public static String getAddress() { return faker.address().streetAddress(); }

}

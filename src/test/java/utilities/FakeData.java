package utilities;

import com.github.javafaker.Faker;

public class FakeData {

    public static String zipCode() {
        Faker fakerPostalCode = new Faker();
        return fakerPostalCode.address().zipCode();
    }
    public static String profession() {
        Faker fP = new Faker();
        return fP.company().profession();
    }
    public static String address() {
        Faker fakerAddressOne = new Faker();
        return fakerAddressOne.address().streetAddress();
    }
    public static String fakerState() {
        Faker fs = new Faker();
        return fs.address().state();
    }

    public static String city() {
        Faker fakerCityOne = new Faker();
        return fakerCityOne.address().city();
    }

    public static String phoneNumber() {
        Faker fakerPhoneNumberOne = new Faker();
        return fakerPhoneNumberOne.phoneNumber().cellPhone();
    }

    public static CharSequence random2DigitNumber() {
        Faker fakerNumTwo = new Faker();
        return fakerNumTwo.number().digits(2);
    }
    public static CharSequence random3DigitNumber() {
        Faker fakerNumThree = new Faker();
        return fakerNumThree.number().digits(2);
    }

    public static CharSequence random9DigitAccountNumber() {
        Faker fakeNum = new Faker();
        return fakeNum.number().digits(9);
    }
    public static String fakerFullName(){
        Faker fn = new Faker();
        return fn.name().fullName();
    }
    public static String fakerFirstName(){
        Faker fn = new Faker();
        return fn.name().firstName();
    }
    public static String fakerLastName(){
        Faker ln = new Faker();
        return ln.name().lastName();
    }
    public static String fakerUserName(){
        Faker userName = new Faker();
        return userName.name().username();
    }
    public static String randomName() {
        Faker fakerName = new Faker();
        return fakerName.funnyName().name();
    }
    public static String email() {
        Faker em = new Faker();
        return em.internet().emailAddress();
    }
    public static String CompanyName() {
        Faker cn = new Faker();
        return cn.company().name();
    }
    public static String website() {
        Faker wb = new Faker();
        return wb.internet().domainName();
    }
    public static String randomText() {
        Faker rt = new Faker();
        return rt.howIMetYourMother().catchPhrase();
    }
    public static String randomNumber() {
        Faker rn = new Faker();
        return String.valueOf(rn.number().randomDigitNotZero());
    }

}

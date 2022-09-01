package utilities;

import com.github.javafaker.Faker;

public class FakeData {

    public static String zipCode() {
        Faker fakerPostalCode = new Faker();
        String fakerzipCode = fakerPostalCode.address().zipCode();
        return fakerzipCode;
    }
    public static String profession() {
        Faker fP = new Faker();
        String fakerPro = fP.company().profession();
        return fakerPro;
    }
    public static String address() {
        Faker fakerAddressOne = new Faker();
        String fakerAddress = fakerAddressOne.address().streetAddress();
        return fakerAddress;
    }
    public static String fakerState() {
        Faker fs = new Faker();
        String fakerState = fs.address().state();
        return fakerState;
    }

    public static String city() {
        Faker fakerCityOne = new Faker();
        String fakerCity = fakerCityOne.address().city();
        return fakerCity;
    }

    public static String phoneNumber() {
        Faker fakerPhoneNumberOne = new Faker();
        String fakerPhoneNumber = fakerPhoneNumberOne.phoneNumber().cellPhone();
        return fakerPhoneNumber;
    }

    public static CharSequence random2DigitNumber() {
        Faker fakerNumTwo = new Faker();
        String fakerNum = fakerNumTwo.number().digits(2);
        return fakerNum;
    }

    public static CharSequence random9DigitAccountNumber() {
        Faker fakeNum = new Faker();
        String fakerNumTwo = fakeNum.number().digits(9);
        return fakerNumTwo;
    }
    public static String fakerFullName(){
        Faker fn = new Faker();
        String fakerName = fn.name().fullName();
        return fakerName;
    }
    public static String fakerFirstName(){
        Faker fn = new Faker();
        String fakerFn = fn.name().firstName();
        return fakerFn;
    }
    public static String fakerLastName(){
        Faker ln = new Faker();
        String fakerLn = ln.name().lastName();
        return fakerLn;
    }
    public static String fakerUserName(){
        Faker userName = new Faker();
        String fakeruserName = userName.name().username();
        return fakeruserName;
    }
    public static String randomName() {
        Faker fakerName = new Faker();
        String name = fakerName.funnyName().name();
        return name;
    }
    public static String email() {
        Faker em = new Faker();
        String email = em.internet().emailAddress();
        return email;
    }
    public static String CompanyName() {
        Faker cn = new Faker();
        String companyName = cn.company().name();
        return companyName;
    }
    public static String website() {
        Faker wb = new Faker();
        String websiteName = wb.internet().domainName();
        return websiteName;
    }
    public static String randomText() {
        Faker rt = new Faker();
        String randomText = rt.howIMetYourMother().catchPhrase();
        return randomText;
    }
    public static String randomNumber() {
        Faker rn = new Faker();
        String randomNumber = String.valueOf(rn.number().randomDigitNotZero());
        return randomNumber;
    }

}

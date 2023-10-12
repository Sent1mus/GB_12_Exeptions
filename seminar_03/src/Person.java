import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private Date birthDay;
    private Integer phoneNumber;
    private String gender;

    private static DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public Person(String surname, String name, String patronymic, Date birthDay, Integer phoneNumber, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Person(String surname, String name, String patronymic, String birthDay, Integer phoneNumber, String gender) throws ParseException {
        this(surname, name, patronymic, dateFormat.parse(birthDay), phoneNumber, gender);
    }

    // Java Beans naming conventions for getters and setters
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static Person dataConsoleInput() throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter person details separated by spaces \n" +
                " (Last_name, First_name, Patronymic, Date_of_birth (dd.mm.yyyy), Phone_number (7 digits), Gender (f - female / m - male");
        String input = scan.nextLine();
        String[] data = input.split("\\s");
        if (data.length < 6) {
            throw new RuntimeException("Incomplete data entered");
        } else if (data[4].length() != 7) {
            throw new RuntimeException("The phone number must consist of 7 digits");
        } else if ((!data[5].matches("m")) && (!data[5].matches("f"))) {
            throw new RuntimeException("Gender must be indicated by letters: m - male, f - female");
        }

        return new Person(data[0], data[1], data[2], dateFormat.parse(data[3]), Integer.parseInt(data[4]), data[5]);
    }

    @Override
    public String toString() {
        return "<" + this.getSurname() + ">" +
                "<" + this.getName() + ">" +
                "<" + this.getPatronymic() + ">" +
                "<" + dateFormat.format(this.getBirthDay()) + ">" +
                "<" + this.getPhoneNumber() + ">" +
                "<" + this.getGender() + ">";
    }
}

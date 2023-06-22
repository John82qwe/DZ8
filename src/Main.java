import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Норильск", "Центр");
        Optional<Address> a1 = Optional.ofNullable(address1);
        Address address2 = new Address("Магадан", "Южный Магадан");
        Optional<Address> a2 = Optional.ofNullable(address2);
        Address address3 = new Address("Мурино", "Северное Мурино");
        Optional<Address> a3 = Optional.ofNullable(address3);


        Students s1 = new Students("Алексей", a1);
        Students s2 = new Students("Игорь", a3);
        Students s3 = new Students("Серей", a2);

        printStudentInfo(s1);
        printStudentInfo(s2);
        printStudentInfo(s3);
    }

    public static void printStudentInfo(Students students){
        students.getAddress().ifPresentOrElse(o -> System.out.println(students.getName() + " >>> " + o.getCity() +
                " >>> " + o.getRegion()), () -> System.out.println(students.getName()));
    }
}
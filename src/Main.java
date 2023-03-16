public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Baccend");
        course.setNameTeacher("Азамат Абдыкеримович");
        course.setNumber(2);
        course.setStartOfDate("06/02/2023");

        Student student = new Student();
        student.setName("Айдар");
        student.setSurname("Жапаров");
        student.setAge(18);
        student.setBirthday("14/04/2004");

        System.out.println("Name student: " + student.getName() + "\n" + "Surneme student: " + student.getSurname() + "\n" + "Age student: " + student.getAge() + "\n" + "Birthday student: " + student.getBirthday());
        System.out.println("=====================");
        System.out.println("Name curs: " + course.getName() + "\n" + "Name teacher: " + course.getNameTeacher() + "\n" + "Start of date: " + course.getStartOfDate() + "\n" + "Namer curs: " + course.getNumber());
    }
}
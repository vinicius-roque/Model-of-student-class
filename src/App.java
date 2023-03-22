public class App {
  public static void main(String[] args) throws Exception {
    Student student = new Student();
    student.setAge(22);
    student.setEmail("viniciusfr6@gmail.com");
    student.setName("Vinícius");

    Teacher teacher = new Teacher();
    teacher.setAge(student.getAge() * 2);
    teacher.setName("Frank");

    Subject subject = new Subject();
    subject.setName("Programação Orientada a Objetos");
    subject.setTeacher(teacher);

    student.setSubjects(subject);

    System.out.println(student.getSubjects().get(0).getTeacher().getAge());
  }
}

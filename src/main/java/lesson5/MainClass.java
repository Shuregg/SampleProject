package lesson5;

public class MainClass {
    public static void main(String[] args) {
        Student st = new Student("Alex", 10, 15);
        Teacher teacher = new Teacher("Tamara Petrovna", 51, "Math");
        st.sayHello();
        teacher.sayHello();
        System.out.println(teacher.getAge());
        teacher.teach(st);

        Human[] people = new Human[5];
        people[0] = new Human("Human 1", 10);
        people[1] = new Student("Student", 16, 11);
        people[2] = st;
        people [3] = teacher;
        people[4] = new Teacher("Valentina Ivanovna", 77, "Russian");

        for (int i = 0; i < people.length; i++) {
            people[i].sayHello();
        }
    }

}

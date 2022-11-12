package BlackBelt.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter {

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", 21, 6.7, 4);
        Student student2 = new Student("Ivan", "Petrov", 32, 7.7, 2);
        Student student3 = new Student("Petr", "Sidorov", 23, 5.6, 1);
        Student student4 = new Student("Sergey", "Sergeev", 24, 8.3, 5);
        Student student5 = new Student("Anna", "Khazina", 41, 9.1, 3);
        Student student6 = new Student("Olga", "Peskova", 26, 8.5, 3);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        students = students.stream().filter(e->e.getAge() > 20 && e.getAverage()<7).collect(Collectors.toList());

        System.out.println(students);
    }
    static class Student{
        private String firstName;
        private String lastName;
        private Integer age;
        private Double average;
        private Integer year;

        public Student(String firstName, String lastName, Integer age, Double average, Integer year) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.average = average;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", average=" + average +
                    ", year=" + year +
                    '}';
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Double getAverage() {
            return average;
        }

        public void setAverage(Double average) {
            this.average = average;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }
    }
}

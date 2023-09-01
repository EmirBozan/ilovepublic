public class Student {
    // Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
    Course course;
    Course note;
    Course name;
    int stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    Double average;
    Boolean isPass;

    Student(int stuNo, String classes, Course course1, Course course2, Course course3) {
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    void addBulkExamNote(Course note, int note1, int note2, int note3) {
        if (0 <= note1 && note1 <= 100) {
            this.course1.note = note1;
        }
        if (0 <= note2 && note2 <= 100) {
            this.course2.note = note2;
        }
        if (0 <= note3 && note3 <= 100) {
            this.course3.note = note3;
        }

    }

    void calcAverage(Double average) {
        this.average = (this.course1.note + this.course2.note + this.course3.note) / 3.0;
    }

    void isPass() {
        if (40 <= this.average) {
            System.out.println("Sınıfı geçtiniz. ");
        } else {
            System.out.println("Sınıfta kaldınız. ");
        }
    }

    void printNote(Course name, int note1, int note2, int note3) {
        System.out.println(this.course1.name + "dersinin notu : " + this.course1.note);
        System.out.println(this.course2.name + "dersinin notu : " + this.course2.note);
        System.out.println(this.course3.name + "dersinin notu : " + this.course3.note);
    }

}

public class Course {
    Teacher teacher;
    Teacher t;
    String name;
    String code;
    String prefix;
    String course1;
    String course2;
    String course3;
    int note;
    

    Course(String name, String prefix, String code) {
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        int note = 0;
    }

    void addTeacher (Teacher t, Teacher teacher){
        this.t=teacher;
    }
    void infoTeacher (String teacher){
        this.teacher.print();
    }


}

public class Teacher {
    Course course;
    String name;
    String nmpo;
    String branch;
    String t;

    Teacher(String name, String nmpo, String branch) {
        this.name = name;
        this.nmpo = nmpo;
        this.branch = branch;
    }

    public void print() {
        System.out.println("Adı : " + this.name);
        System.out.println("NMPO : " + this.nmpo);
        System.out.println("Branş : " + this.branch);
    }
}

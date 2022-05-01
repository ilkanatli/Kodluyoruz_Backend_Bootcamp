public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int performanceNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int performanceNote = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //teacher.print();
        } else {
            System.out.println("Ogretmen ve ders bolumleri uyusmuyor!");
        }

    }

    void printTeacherInfo() {
        this.teacher.print();
    }

}

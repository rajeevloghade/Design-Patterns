public class CollegeStudent implements Student {

    String name;
    String className;
    String grade;

    public CollegeStudent(String name, String className, String grade) {
        this.name = name;
        this.className = className;
        this.grade = grade;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public String getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

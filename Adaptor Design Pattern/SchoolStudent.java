public class SchoolStudent {
    String name;
    String className;
    String grade;

    public SchoolStudent(String name, String className, String grade) {
        this.name = name;
        this.className = className;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

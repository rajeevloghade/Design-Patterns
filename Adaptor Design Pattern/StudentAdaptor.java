public class StudentAdaptor implements Student {

    public SchoolStudent schoolStudent;

    public StudentAdaptor(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return schoolStudent.getName();
    }

    @Override
    public String getClassName() {
        return schoolStudent.getClassName();
    }

    @Override
    public String getGrade() {
        return schoolStudent.getGrade();
    }
    
    @Override
    public String toString() {
        return "StudentAdaptor{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }
}



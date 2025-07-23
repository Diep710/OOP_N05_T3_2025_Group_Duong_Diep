public class Student implements Comparable<Student> {
    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public Student() {}
    public int compareTo(Student o) {
        if (o.gpa < gpa) return 1;
        else if (o.gpa > gpa) return -1;
        else return 0;
    }
    public boolean equals(Object o) {
        if (o instanceof Student) {
            return gpa == ((Student) o).gpa;
        }
        return false;
    }
    public String getName() { return name; }
    public float getGpa() { return gpa; }
    private String name;
    private float gpa;
}
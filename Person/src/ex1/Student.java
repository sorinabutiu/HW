package ex1;

public class Student extends Person{
    boolean promoted;

    public Student(boolean promoted) {
        this.promoted = promoted;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }
}

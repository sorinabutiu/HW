package ex1;

public class Professor extends Person{
    private String name;
    private int age;
    private boolean isHealthy;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean isHealthy() {
        return isHealthy;
    }

    @Override
    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String subject;

}

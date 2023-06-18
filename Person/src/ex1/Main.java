package ex1;

public class Main {
    public static void main(String [] args){

        Janitor janitor=new Janitor();
        janitor.setSecurityGuard(SecurityGuard.TOO_THIN);
        System.out.println("Body type is "+janitor.getSecurityGuard());

        janitor.setName("Michael");
        janitor.setAge(32);
        janitor.setHealthy(true);
        janitor.setTypeOfUniform("work");
        System.out.println(janitor.getName()+" is "+ janitor.getAge()+" years old "+ "\nis healthy: "+janitor.isHealthy()+" \ntype of uniform is:" +janitor.getTypeOfUniform());
    }
}

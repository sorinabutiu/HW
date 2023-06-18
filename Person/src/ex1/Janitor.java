package ex1;

public class Janitor extends Person {

    public String typeOfUniform;
    private SecurityGuard securityGuard;
    public String getTypeOfUniform() {
        return typeOfUniform;
    }

    public void setTypeOfUniform(String typeOfUniform) {
        this.typeOfUniform = typeOfUniform;
    }

    public SecurityGuard getSecurityGuard() {
        return securityGuard;
    }

    public void setSecurityGuard(SecurityGuard securityGuard) {
        this.securityGuard = securityGuard;
    }

}

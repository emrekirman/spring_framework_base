package clrsoft.example;

import org.springframework.stereotype.Component;

@Component
public class Test {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test() {
        System.out.println("Test sınıfı merhaba");
    }

    public void hello() {
        System.out.println("Test sınıfı merhaba");
    }
}

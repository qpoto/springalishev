package stas;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void init() {
        System.out.println("INIT");
    }

    @PreDestroy
    public void destr() {
        System.out.println("DESTR");
    }

    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}

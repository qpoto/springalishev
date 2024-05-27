package stas;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component public class ClassicalMusic implements Music {

    @Override
    public List<String> getSong() {
        return Arrays.asList("C1", "C2", "C3");
    }
}

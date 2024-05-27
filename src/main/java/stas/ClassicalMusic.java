package stas;

import org.springframework.stereotype.Component;
@Component public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Play Classical Music";
    }
}

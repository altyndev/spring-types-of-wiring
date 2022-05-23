package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private final Egg6 egg6;

    public Duck5(Egg6 egg6) {
        this.egg6 = egg6;
    }

    @Override
    public String toString() {
        return ", a duck is in the hare" + egg6.toString();
    }
}

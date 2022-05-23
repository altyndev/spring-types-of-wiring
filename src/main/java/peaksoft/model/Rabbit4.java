package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    @Autowired
    private  Duck5 duck5;

    @Override
    public String toString() {
        return ", a hare is in the chest" + duck5.toString();
    }
}

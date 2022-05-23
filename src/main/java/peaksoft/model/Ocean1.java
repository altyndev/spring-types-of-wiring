package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return ", there is an island in the sea on the ocean" + island.toString();
    }
}

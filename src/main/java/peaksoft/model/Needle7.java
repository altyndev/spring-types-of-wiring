package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private Deth8 deth8;

    public Needle7(Deth8 deth8) {
        this.deth8 = deth8;
    }

    @Override
    public String toString() {
        return ", a needle is in the egg " + deth8.toString();
    }
}

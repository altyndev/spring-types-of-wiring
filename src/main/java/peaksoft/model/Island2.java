package peaksoft.model;

public class Island2 {

    private final Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", on that island there is an oak" + wood.toString();
    }
}

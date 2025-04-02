package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public int getValue() {
        return value;
    }

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addvalue){
        return new ImmutableObj((value+addvalue));
    }
}

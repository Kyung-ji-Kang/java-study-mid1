package lang.immutable.address;

public class Adderss {
    private String value;

    public Adderss(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Adderss{" +
                "value=" + value +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

package lang.immutable.address;

public class MemberV2 {

    private String name;
    private ImmutableAddress  immutableAddress;

    public MemberV2(String name, ImmutableAddress immutableAddress){
        this.name = name;
        this.immutableAddress = immutableAddress;
    }

    public ImmutableAddress getimmutableAddress(){
        return  immutableAddress;
    }

    public void setAddress(ImmutableAddress immutableAddress){
        this.immutableAddress = immutableAddress;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + immutableAddress +
                '}';
    }

    public ImmutableAddress getAddress() {
        return immutableAddress;
    }
}

package inheritance_demo;

public class NormalMember extends Member {
    public NormalMember() {
        System.out.println("Child constructor with no parameter");
    }

    public NormalMember(String name, int memberID, int memberSince) {
        super(name, memberID, memberSince);
        System.out.println("Child Constructor with 3 parameters");
    }
}

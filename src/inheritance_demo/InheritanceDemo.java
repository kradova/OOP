package inheritance_demo;

public class InheritanceDemo {
    public static void main(String[] args) {
//        NormalMember mem1 = new NormalMember("James", 1, 2010);
//        VIPMember mem2 = new VIPMember("Andy", 2, 2011);
//
//        mem2.calculateAnnualFee();
//        mem2.displayMemInfo();
//
//        mem1.setDiscount();
//        mem1.calculateAnnualFee();
//        mem1.displayMemInfo();
        Member[] clubMembers = new Member[6];
        clubMembers[0] = new NormalMember("James", 1, 2010);
        clubMembers[1] = new NormalMember("Andy", 2, 2011);
        clubMembers[2] = new NormalMember("Bill", 3, 2011);
        clubMembers[3] = new VIPMember("Carol", 4, 2012);
        clubMembers[4] = new VIPMember("Evelyn", 5, 2012);
        clubMembers[5] = new VIPMember("Yvonne", 6, 2013);

        for (Member m : clubMembers) {
            m.calculateAnnualFee();
            m.displayMemInfo();
        }
    }
}

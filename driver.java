package Lab2;

public class driver {
    public static void main(String[] args) {
        Province bc = new Province("British Columbia","Vancouver",990);
        System.out.println(bc.getDetails());
        Province gg = new Province("GG","gg",9);
        System.out.println(gg.getDetails());
        Province ns = new Province("Nova Scotia","Halifax",7);
        System.out.println(ns.getDetails());
        Country ca = new Country();
        System.out.println(ca.howManyPeople(0,20));
    }
}

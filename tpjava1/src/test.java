public class test {
    public static void main(String[] args) {
        Livre l1=new Livre(12, 6000, "ouma", "hcini");
        l1.tooString();
        l1.setId(500);
        System.out.println(l1.getId());
    }
}

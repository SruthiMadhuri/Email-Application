package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1=new Email("Sruthi","Madhuri");
//        em1.setAlternateEmail("sm@gmail.com");
//        System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
    }
}

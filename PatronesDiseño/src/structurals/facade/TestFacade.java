package structurals.facade;

public class TestFacade {
    public static void main(String[] args) {
        FacadeSmithy facade = new FacadeSmithy();
        facade.work("sword", true);
        System.out.println("-------------------");
        facade.work("shield", false);
    }
}

public class Application {
    public static void main(String[] args) {
        System.out.println("Package test");
        Application.testLibrary();
    }

    public static void testLibrary() {
        TestLibrary t = new TestLibrary(10, 20);

        System.out.println(t.getX() + " - " + t.getY());
    }
}

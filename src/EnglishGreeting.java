/**
 * Created by fenji on 8/30/2016.
 */
public class EnglishGreeting {
    String name = "world";
    public void greet() {
        greetSomeone("world");
    }
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hello " + name);
    }
}

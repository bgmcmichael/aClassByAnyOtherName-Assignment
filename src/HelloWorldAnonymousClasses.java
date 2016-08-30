public class HelloWorldAnonymousClasses {



    public void sayHello() {
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new FrenchGreeting();
        HelloWorld spanishGreeting = new SpanishGreeting();

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
                new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
public class Main {

    public static void main(String[] args){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Estudando expressão lambda");
            }
        };

        Runnable r2 = () -> System.out.println("Estudando expressão lambda 1");

        r1.run();
        r2.run();
    }

}

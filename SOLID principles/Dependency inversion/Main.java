public class Main
{
    public static void main(String[] args) {
        Computer computer =new Computer(new GamingKeyboard());
        System.out.println(computer.getKeyboard().getName());

        Computer computer2 =new Computer(new StandardKeyboard());
        System.out.println(computer2.getKeyboard().getName());

    }
}
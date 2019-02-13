package Prototype;

public class PrototypeStart {
    public static void main(String[] args) throws CloneNotSupportedException {
        String[] array = {"image","doc"};

        if (array.length > 0) {
            for (String type : array) {
                Image prototype = Factory.getPrototype(type);
                if (prototype != null) {
                    System.out.println(prototype);
                }
            }
        } else {
            System.out.println("Run again with arguments of command string ");
        }

        Factory fg = new Factory();

    }
}

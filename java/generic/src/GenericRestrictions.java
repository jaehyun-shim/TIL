/**
 * 다른 타입이 들어올 수 없는 제네릭 타입 제한
 * */
abstract class Info {
    public abstract int getInfo();
}

class SubClass extends Info {
    public int num;

    SubClass(int num) {
        this.num = num;
    }

    @Override
    public int getInfo() {
        return this.num;
    }
}

class MainClass<T extends Info> {
    public T info;

    MainClass(T info) {
        this.info = info;
    }
}

public class GenericRestrictions {
    public static void main(String[] args) {
        MainClass m1 = new MainClass(new SubClass(1));
        //MainClass<String> m2 = new MainClass<String>("Test"); // Info,SubClass 이 외 제한.
        MainClass<Info> m2 = new MainClass<Info>(new SubClass(1));
    }
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericEx {
    public static void main(String[] args) {
        // String generic
        ArrayList<String> stringList = new ArrayList<String>();
        // Integer generic
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        // classObject generic
        ArrayList<ObjectClass> classList = new ArrayList<ObjectClass>();

        stringList.add("Test");
        stringList.add("100");

        integerList.add(100);
        integerList.add(200);

        classList.add(new ObjectClass());
        classList.add(new ObjectClass("Test"));


        for (String i : stringList) {
            System.out.println(i);
        }

        for (Integer i : integerList) {
            System.out.println(i);
        }

        for (ObjectClass i : classList) {
            System.out.println(i);
        }

        // 제네릭을 사용하지 않은 경우에는 타입을 형변환하여 값을 얻을 수 있다.
        ArrayList notGenericList = new ArrayList();
        notGenericList.add(100);
        notGenericList.add("Test");
        notGenericList.add(classList);
        int getNotGenericListIntValue = (Integer) notGenericList.get(0);
        String getNotGenericListStringValue = (String) notGenericList.get(0);
        ObjectClass getNotGenericListObjectClassValue = (ObjectClass) notGenericList.get(0);


    }

}


// 다른타입이 들어올수없는
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

class DemoClass {
    public static void main(String[] args) {
        MainClass m1 = new MainClass(new SubClass(1));
        //MainClass<String> m2 = new MainClass<String>("Test");
        MainClass<Info> m2 = new MainClass<Info>(new SubClass(1));
    }
}

class ExClass {
    /*private static <T> Collection<T> add(Collection<T> list, T element) {
        list.add(element);
        return list;
    }*/

    private static <T, R extends Collection<T>> R add(R collection, T element) {
        collection.add(element);
        return collection;
    }

    List<String> list = new ArrayList<>();
    List<String> addList = add(list, "hello");
    List<String> addList2 = (List<String>)add(list, "hello");


    private static <T, R> T addAll(R r) {
        Map<Integer, String> map = newHashMap();
        map.put(1,"");
        return null;
    }

    static <K,V> HashMap<K,V> newHashMap(){
        return new HashMap<K,V>();
    }





}
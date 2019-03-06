import java.util.ArrayList;

class ObjectClass<T> {
    private T t;

    public ObjectClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class GenericClass {
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

        classList.add(new ObjectClass(100));
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

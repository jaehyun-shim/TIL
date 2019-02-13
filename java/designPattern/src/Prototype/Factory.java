package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static final Map<String, FileInfo> prototype = new HashMap<>();

    static {
        prototype.put("image", new Image() {
            @Override
            void download() {
                System.out.println("이미지 다운로드..");
            }
        });
    }

    public static Image getPrototype(String type) throws CloneNotSupportedException {
        try {
            return (Image) prototype.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println(ex);
            return null;
        }
    }
}

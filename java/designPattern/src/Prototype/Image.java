package Prototype;

public abstract class Image extends FileInfo {
    private final String NAME = "image";

    @Override
    public FileInfo clone() {
        return new Image() {
            @Override
            public void download() {
                System.out.println("다운로드..");
            }
        };
    }

    @Override
    public String toString() {
        return "Image{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}

package Factory;

public class Document implements FileInfo{
    @Override
    public void download() {
        System.out.println("Inside Document::download() method.");
    }

    @Override
    public void upload() {
        System.out.println("Inside Document::upload() method.");
    }
}

package Factory;

public class Image implements FileInfo{
    @Override
    public void download() {
        System.out.println("Inside Image::download() method.");
    }

    @Override
    public void upload() {
        System.out.println("Inside Image::download() method.");
    }
}

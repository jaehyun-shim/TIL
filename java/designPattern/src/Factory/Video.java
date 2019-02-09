package Factory;

public class Video implements FileInfo{

    @Override
    public void download() {
        System.out.println("Inside Video::download() method.");
    }

    @Override
    public void upload() {
        System.out.println("Inside Video::download() method.");
    }
}

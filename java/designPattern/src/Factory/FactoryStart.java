package Factory;

public class FactoryStart {
    public static void main(String[] args) {
        FileInfoFactory fileInfoFactory = new FileInfoFactory();

        FileInfo fileInfo1 = fileInfoFactory.getFileInfo("image");
        fileInfo1.download();
        fileInfo1.upload();

        FileInfo fileInfo2 = fileInfoFactory.getFileInfo("document");
        fileInfo2.download();
        fileInfo2.upload();

        FileInfo fileInfo3 = fileInfoFactory.getFileInfo("video");
        fileInfo3.download();
        fileInfo3.upload();
    }
}

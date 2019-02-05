package Adapter;

public class LibAdaptor implements FileEngine{
    ImageLib imageLib;

    public LibAdaptor(ImageLib imageLib) {
        this.imageLib = imageLib;
    }

    @Override
    public void fileDownload() {
        imageLib.fileDownload();
    }

    @Override
    public void fileUpload() {
        imageLib.fileUpload();
    }

    @Override
    public void fileViewer() {
        imageLib.fileViewer();
    }

    @Override
    public void fileDelete() {
        imageLib.fileDelete();
    }

    @Override
    public void fileList(String[] list) {
        for (String str : list ) {
            System.out.println(str + " 파일보기");
        }
    }

}

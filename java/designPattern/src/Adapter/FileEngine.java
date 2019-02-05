package Adapter;

public interface FileEngine{
    public void fileDownload();
    public void fileUpload();
    public void fileViewer();
    public void fileDelete();
    public void fileList(String[] list);
}

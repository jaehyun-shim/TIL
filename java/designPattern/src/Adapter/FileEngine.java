package Adapter;

public interface FileEngine {
    public void fileDownload(String fileName);
    public void fileUpload(String fileName);
    public void fileViewer(String fileName);
    public void fileList(String listName);
    public void fileDelete(String fileName);
}

package Builder;

public class FileInfo {
    private String fileName;
    private String path;
    private int size;
    private String extension;
    private String regDate;

    FileInfo() {
    }

    /*public FileInfo(String fileNmae, String path, int size, String extension, String regDate) {
        this.fileNmae = fileNmae;
        this.path = path;
        this.size = size;
        this.extension = extension;
        this.regDate = regDate;
    }*/

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "FileInfo [ fileName=" + fileName +
                ", extension=" + extension +
                ", path=" + path +
                ", size=" + size +
                ", regDate=" + regDate + " ]";
    }
}

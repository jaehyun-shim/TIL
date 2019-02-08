package Builder;

public class FileBuilderImpl implements FileBuilder {
    private FileInfo fileInfoTmp;

    public FileBuilderImpl(){
        fileInfoTmp = new FileInfo();
    }

    @Override
    public FileInfo build() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFileName(fileInfoTmp.getFileName());
        fileInfo.setPath(fileInfoTmp.getPath());
        fileInfo.setExtension(fileInfoTmp.getExtension());
        fileInfo.setSize(fileInfoTmp.getSize());
        fileInfo.setRegDate(fileInfoTmp.getRegDate());
        return fileInfo;
    }

    @Override
    public FileBuilder setFileName(String fileName) {
        fileInfoTmp.setFileName(fileName);
        return this;
    }

    @Override
    public FileBuilder setPath(String path) {
        fileInfoTmp.setPath(path);
        return this;
    }

    @Override
    public FileBuilder setExtension(String extension) {
        fileInfoTmp.setExtension(extension);
        return this;
    }

    @Override
    public FileBuilder setSize(int size) {
        fileInfoTmp.setSize(size);
        return this;
    }

    @Override
    public FileBuilder setRegDate(String regDate) {
        fileInfoTmp.setRegDate(regDate);
        return this;
    }
}

package Factory;

public class FileInfoFactory {
    public FileInfo getFileInfo(String fileType){
        if(fileType == null){
            return null;
        }

        if(fileType.equalsIgnoreCase("image")){
            return new Image();
        }

        if(fileType.equalsIgnoreCase("document")){
            return new Document();
        }

        if(fileType.equalsIgnoreCase("video")){
            return new Video();
        }
        return null;
    }
}

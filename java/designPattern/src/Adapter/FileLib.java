package Adapter;

public class FileLib {
    public void fileDownload(String fileName){
        System.out.println("파일다운로드");
    }

    public void fileUpload(String fileName){
        System.out.println("파일업로드");
    }

    public void fileViewer(String fileName){
        System.out.println("파일보기");
    }

    public void fileList(String listName){
        System.out.println("파일목록");
    }

    public void fileDelete(String fileName){
        System.out.println("파일삭제");
    }
}
package Adapter;

public class ImageLib {

    private String fileName;

    public ImageLib(String fileName) {
        this.fileName = fileName;
    }

    public void fileDownload(){
        System.out.println(fileName + " 파일다운로드");
    }

    public void fileUpload(){
        System.out.println(fileName + " 파일업로드");
    }

    public void fileViewer(){
        System.out.println(fileName + " 파일보기");
    }

    public void fileDelete(){
        System.out.println(fileName + " 파일삭제");
    }
}

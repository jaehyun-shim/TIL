package Adapter;

public class LibStart {
    public static void main(String[] args){

        ImageLib imgLib = new ImageLib("기본파일");
        /*imgLib.fileViewer();
        imgLib.fileUpload();
        imgLib.fileDownload();
        imgLib.fileDelete();*/

        String[] fileList = {"리스트파일1", "리스트파일2", "리스트파일3"};
        FileEngine fen = new LibAdaptor(imgLib);
        fen.fileList(fileList);
        fen.fileViewer();
        fen.fileUpload();
        fen.fileDownload();
        fen.fileDelete();

    }
}

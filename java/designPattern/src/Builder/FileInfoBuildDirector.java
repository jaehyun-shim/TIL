package Builder;

public class FileInfoBuildDirector {
    private FileBuilder builder;

    public FileInfoBuildDirector (final FileBuilder fileBuilder){
        this.builder = fileBuilder;
    }

    public FileInfo construct(){
        return builder.setFileName("happy")
                .setPath("C://picture/")
                .setExtension("JPG")
                .setSize(100)
                .setRegDate("20190101")
                .build();
    }

    public static void main(final String[] arguments) {
        final FileBuilder builder = new FileBuilderImpl();

        final FileInfoBuildDirector fileInfoBuildDirector = new FileInfoBuildDirector(builder);

        System.out.println(fileInfoBuildDirector.construct());
    }

}

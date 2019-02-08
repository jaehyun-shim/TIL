package Builder;

public interface FileBuilder {
    FileInfo build();

    FileBuilder setFileName(final String fileName);

    FileBuilder setPath(final String path);

    FileBuilder setExtension(final String extension);

    FileBuilder setSize(final int size);

    FileBuilder setRegDate(final String regDate);
}

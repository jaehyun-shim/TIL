package Prototype;

import Factory.FileInfo;

public abstract class Image implements FileInfo {
    private final String NAME = "image";

    @Override
    public FileInfo clone() {
        return new Image() {
            @Override
            public void download() {

            }

            @Override
            public void upload() {

            }
        };
    }

    @Override
    public String toString() {
        return "Image{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}

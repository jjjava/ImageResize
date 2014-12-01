package br.com.schumaker.sandbox.ex4;

/**
 *
 * @author Hudson Schumaker
 */
public class FileImage {

    private static final FileImage INSTANCE = new FileImage();
    private String path;

    private FileImage() {
    }

    public static FileImage getInstance() {
        return INSTANCE;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

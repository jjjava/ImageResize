package br.com.schumaker.io;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author Hudson Schumaker
 */
public class HsFileFilter implements FileFilter {

    public boolean accept(File file) {
        return file.getName().endsWith(".TXT") || file.getName().endsWith(".txt");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.sandbox.ex4;

/**
 *
 * @author hudson.sales
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

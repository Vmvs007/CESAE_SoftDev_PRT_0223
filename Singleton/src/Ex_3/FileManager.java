package Ex_3;

import java.io.File;

public class FileManager {
    private static FileManager instance;

    private String path;

    private FileManager(String path) {
        this.path = path;
    }

    public static synchronized FileManager getInstance(String path){
        if(instance==null){
            return instance= new FileManager(path);
        }
        return instance;
    }

    public void setRootDirectory(String path) {
        this.path = path;
    }

    public void createFile(String nome){
        new File(nome);
    }

    public void deleteFile(String nome){
        File file = new File(nome);
        file.delete();
    }
}

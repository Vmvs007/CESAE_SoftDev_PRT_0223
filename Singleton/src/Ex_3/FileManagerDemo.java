package Ex_3;

public class FileManagerDemo {
    public static void main(String[] args) {

        FileManager fileManager = FileManager.getInstance("C:\\Users\\vmvs0\\Documents\\CESAE_SoftDev\\Singleton\\File Manager");

       //Criar ficheiros
        fileManager.createFile("file.txt");
        fileManager.createFile("fileToDelete.txt");

        // Apagar ficheiros
        fileManager.deleteFile("fileToDelete.txt");

        fileManager.setRootDirectory("");
        fileManager.createFile("newFile.txt");
    }
}

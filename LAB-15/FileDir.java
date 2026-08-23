import java.io.File;

public class FileDir {

    public static void main(String[] args) {

        String path = args[0];

        File f = new File(path);

        if (!f.exists()) {
            System.out.println("The given file does not exist");
        } 
        else if (f.isFile()) {
            System.out.println("File size: " + f.length() + " bytes");
        } 
        else if (f.isDirectory()) {
            String[] fileLists = f.list();

            for (String file : fileLists) {
                System.out.println(file);
            }
        }
    }
}

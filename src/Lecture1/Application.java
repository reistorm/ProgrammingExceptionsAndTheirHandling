import java.io.File;

public class Application {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("123")));
    }
    public static long getFileSize(File file){
        if (!file.exists()){
            return -1L;
        }
        return file.length();
    }
}
import java.io.File;

/**
 * Created by Dell on 14.11.2015 ã..
 */
    public class TraverseFilesRecursive {
    public static void main(String[] args) {
        String path = "D:\\SOFTUNI";
        traverse(path);
    }

    private static void traverse(String path) {
        File dir= new File(path);
        File[] files = dir.listFiles();
        System.out.println("Directory:" + dir.getName());
        for (File file : files) {
            System.out.println("FILE:"+file.getName());
            if (file.isDirectory()) {
                traverse(file.getPath());
            }
        }

    }
}

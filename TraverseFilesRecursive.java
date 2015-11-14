import java.io.File;
import java.util.HashSet;

public class TraverseFilesRecursive {
    public static void main(String[] args) {
        String path = "D:\\SOFTUNI";
        traverse(path);
    }

    private static void traverse(String path) {
        File dir= new File(path);
        File[] files = dir.listFiles();
        HashSet<File> visitedFiles= new HashSet<>();

        System.out.println("Directory:" + dir.getName());

        for (File file : files) {
            if (visitedFiles.contains(file)){
                return;
            }
            visitedFiles.add(file);

            if (file.isDirectory()) {
                traverse(file.getPath());
            }
            else {
                System.out.println("--"+file.getName());
            }
        }

    }
}

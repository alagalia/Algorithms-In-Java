import java.io.File;
import java.util.HashSet;

public class TraverseFilesRecursive {
    public static void main(String[] args) {
        String path = "D:\\SOFTUNI\\Agorithms\\out";
        traverse(path, 0);
    }

    private static void traverse(String path, int indent) {
        File dir= new File(path);
        File[] files = dir.listFiles();
        HashSet<File> visitedFiles= new HashSet<>();
        System.out.print(new String(new char[indent]).replace("\0", "--"));
        System.out.println("Directory:" + dir.getName());

        for (File file : files) {
            if (visitedFiles.contains(file)){
                return;
            }
            visitedFiles.add(file);

            if (file.isDirectory()) {
                traverse(file.getPath(), indent+1);
            }
            else {
                System.out.print(new String(new char[indent]).replace("\0","--"));
                System.out.println("--"+file.getName());
            }
        }

    }
}

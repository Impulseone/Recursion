import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static List<File> findAll(File file){
        return find(file, new ArrayList<>());
    }

    private static List<File> find(File file, List<File> allFiles) {
        File[] currentCatalogFiles = file.listFiles();
        for (File currentCatalogFile : currentCatalogFiles) {
            if (currentCatalogFile.isDirectory()) {
                allFiles.addAll(find(currentCatalogFile, new ArrayList<>()));
            } else allFiles.add(currentCatalogFile);
        }
        return allFiles;
    }
}

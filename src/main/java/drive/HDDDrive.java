package drive;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDDrive implements Drive {
    List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {

        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        Optional<File> first = files.stream().filter(file1 -> file1.getName().equals(name)).findFirst();

        return first.orElseThrow();
    }
}

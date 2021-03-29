package drive;

import java.io.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String file);


}

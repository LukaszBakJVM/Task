import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.lukasz.Folder;
import org.lukasz.FolderCabinet;

import java.util.List;
import java.util.Optional;

public class FolderCabinetTest {

    @Test
    public void testFolders() {
        FolderCabinet folderCabinet = new FolderCabinet();
        Folder folder = new FolderCabinet("one", "SMALL");
        Folder folder1 = new FolderCabinet("two", "SMALL");
        Folder folder2 = new FolderCabinet("three", "MEDIUM");
        Folder folder3 = new FolderCabinet("three", "LARGE");

        folderCabinet.addNewFolder(folder);
        folderCabinet.addNewFolder(folder1);
        folderCabinet.addNewFolder(folder2);
        folderCabinet.addNewFolder(folder3);




        Assertions.assertEquals(Optional.of(folder2), folderCabinet.findFolderByName("three"));
        Assertions.assertEquals(List.of(folder, folder1), folderCabinet.findFoldersBySize("SMALL"));
        Assertions.assertEquals(4, folderCabinet.count());


    }

}

package org.lukasz;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        FolderCabinet folderCabinet = new FolderCabinet();
        Folder folder = new FolderCabinet("aaa","bbb");
        folderCabinet.folderArrayList.add(folder);

        System.out.println(folderCabinet.count());

        Optional<Folder> aaa = folderCabinet.findFolderByName("aaa");
        System.out.println(aaa);



        MultiFolder multiFolder = new FolderCabinet();
        multiFolder.getFolders().add(folder);








        System.out.println(multiFolder.getFolders().size());



    }
}
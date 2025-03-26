package org.lukasz;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        FolderCabinet folderCabinet = new FolderCabinet();
        Folder folder = new FolderCabinet("aaa","bbb");
        folderCabinet.folderArrayList.add(folder);



        Optional<Folder> aaa = folderCabinet.findFolderByName("aaa");




        MultiFolder multiFolder = new FolderCabinet();
        List<Folder> folders = multiFolder.getFolders();
       folders.add(folder);
       FolderCabinet folderCabinet1 = new FolderCabinet(folders);

        Optional<Folder> aaa1 = folderCabinet1.findFolderByName("aaa");









       // System.out.println(multiFolder.getFolders().size());



    }
}
package org.lukasz;

public class Main {
    public static void main(String[] args) {
        FolderCabinet folderCabinet = new FolderCabinet();
        Folder folder = new FolderCabinet("one", "SMALL");
        Folder folder1 = new FolderCabinet("two", "SMALL");
        Folder folder2 = new FolderCabinet("three", "MEDIUM");
        Folder folder3 = new FolderCabinet("three", "LARGE");

        folderCabinet.folderArrayList.add(folder);
        folderCabinet.folderArrayList.add(folder1);
        folderCabinet.folderArrayList.add(folder2);
        folderCabinet.folderArrayList.add(folder3);






    }
}
package org.lukasz;

import java.util.List;
import java.util.Optional;

public class FolderCabinet extends FileCabinet implements MultiFolder {

    private List<Folder> folders;
    private String name;
    private String size;

    public FolderCabinet() {
    }

    public FolderCabinet(String name, String size) {
        super();
        this.name = name;
        this.size = size;
    }


    public void addFolder(Folder folder) {
        folders.add(folder);
    }


    @Override
    public Optional<Folder> findFolderByName(String name) {
        return folders.stream().filter(folder -> folder.getName().equals(getName())).findFirst();
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        return super.findFoldersBySize(getSize()).stream().filter(folder -> folder.getSize().equals(size)).toList();
    }

    @Override
    public int count() {
        return folders.size();
    }

    @Override
    public List<Folder> getFolders() {
        return folders;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }
}

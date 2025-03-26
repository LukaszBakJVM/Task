package org.lukasz;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FolderCabinet extends FileCabinet implements MultiFolder {


     List<Folder>folderArrayList = new ArrayList<>();
    private String name;
    private String size;

    public FolderCabinet() {
    }


    public FolderCabinet(String name, String size) {
        this.name = name;
        this.size = size;
    }





    @Override
    public Optional<Folder> findFolderByName(String name) {
        return getFolders().stream().filter(folder -> folder.getName().equals(getName())).findFirst();
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        return super.findFoldersBySize(getSize()).stream().filter(folder -> folder.getSize().equals(size)).toList();
    }

    @Override
    public int count() {
        return folderArrayList.size();
    }

    @Override
    public List<Folder> getFolders() {
        return folderArrayList;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FolderCabinet that = (FolderCabinet) o;
        return Objects.equals(name, that.name) && Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "FolderCabinet{" +
               "name='" + name + '\'' +
               ", size='" + size + '\'' +
               '}';
    }
}

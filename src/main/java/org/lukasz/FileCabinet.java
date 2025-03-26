package org.lukasz;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FileCabinet implements Cabinet {
    private List<Folder> folders;


    @Override
    public Optional<Folder> findFolderByName(String name) {
        return Optional.of(getFoldersList().getFirst());
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        return getFoldersList();
    }

    @Override
    public int count() {
        return getFoldersList().size();
    }

    public List<Folder> getFoldersList() {
        return folders;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileCabinet that = (FileCabinet) o;
        return Objects.equals(folders, that.folders);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(folders);
    }


}



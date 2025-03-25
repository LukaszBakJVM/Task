package org.lukasz;

import java.util.List;
import java.util.Optional;

public class FileCabinet implements Cabinet {
    private List<Folder> folders;


    @Override
    public Optional<Folder> findFolderByName(String name) {
        return Optional.of(folders.getFirst());
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        return folders;
    }

    @Override
    public int count() {
        return folders.size();
    }

}



package org.lukasz;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileCabinet implements Cabinet {
    private List<Folder> folders = new ArrayList<>();

    @Override
    public Optional<Folder> findFolderByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        return List.of();
    }

    @Override
    public int count() {
        return 0;
    }

    public List<Folder> getFolders() {
        return folders;
    }

}



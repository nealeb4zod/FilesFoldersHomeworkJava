package com.example.FilesFoldersHomeWorkJava.repositories;

import com.example.FilesFoldersHomeWorkJava.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

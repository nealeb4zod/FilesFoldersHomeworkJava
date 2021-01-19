package com.example.FilesFoldersHomeWorkJava.components;

import com.example.FilesFoldersHomeWorkJava.models.File;
import com.example.FilesFoldersHomeWorkJava.models.Folder;
import com.example.FilesFoldersHomeWorkJava.models.User;
import com.example.FilesFoldersHomeWorkJava.repositories.FileRepository;
import com.example.FilesFoldersHomeWorkJava.repositories.FolderRepository;
import com.example.FilesFoldersHomeWorkJava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User user1 = new User("User 1");
        User user2= new User("User 2");
        User user3 = new User("User 3");
        Folder folder1 = new Folder("Folder 1", user1);
        Folder folder2 = new Folder("Folder 2", user1);
        Folder folder3 = new Folder("Folder 3", user2);
        Folder folder4 = new Folder("Folder 4", user2);
        Folder folder5 = new Folder("Folder 5", user3);
        Folder folder6 = new Folder("Folder 6", user3);
        File file1 = new File ("Name", ".exe",120, folder1);
        File file2 = new File ("Name", ".exe",120, folder1);
        File file3 = new File ("Name", ".exe",120, folder2);
        File file4 = new File ("Name", ".exe",120, folder2);
        File file5 = new File ("Name", ".exe",120, folder3);
        File file6 = new File ("Name", ".exe",120, folder3);
        File file7 = new File ("Name", ".exe",120, folder4);
        File file8 = new File ("Name", ".exe",120, folder4);
        File file9 = new File ("Name", ".exe",120, folder5);
        File file10 = new File ("Name", ".exe",120, folder5);
        File file11 = new File ("Name", ".exe",120, folder6);
        File file12 = new File ("Name", ".exe",120, folder6);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);
        folderRepository.save(folder4);
        folderRepository.save(folder5);
        folderRepository.save(folder6);

        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);
        fileRepository.save(file4);
        fileRepository.save(file5);
        fileRepository.save(file6);
        fileRepository.save(file7);
        fileRepository.save(file8);
        fileRepository.save(file9);
        fileRepository.save(file10);
        fileRepository.save(file11);
        fileRepository.save(file12);

        user1.addFolder(folder1);
        user1.addFolder(folder2);
        user2.addFolder(folder3);
        user2.addFolder(folder4);
        user3.addFolder(folder5);
        user3.addFolder(folder6);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        folder1.addFile(file1);
        folder1.addFile(file2);
        folder2.addFile(file3);
        folder2.addFile(file4);
        folder3.addFile(file5);
        folder3.addFile(file6);
        folder4.addFile(file7);
        folder4.addFile(file8);
        folder5.addFile(file9);
        folder5.addFile(file10);
        folder6.addFile(file11);
        folder6.addFile(file12);


    }
}

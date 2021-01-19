package com.example.FilesFoldersHomeWorkJava.controllers;

import com.example.FilesFoldersHomeWorkJava.models.File;
import com.example.FilesFoldersHomeWorkJava.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles() {
        return new ResponseEntity<List<File>>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFile(@PathVariable Long id) {
        return new ResponseEntity(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/files")
    public ResponseEntity<File> postFile(@RequestBody File file) {
        fileRepository.save(file);
        return new ResponseEntity<File>(file, HttpStatus.CREATED);
    }
}

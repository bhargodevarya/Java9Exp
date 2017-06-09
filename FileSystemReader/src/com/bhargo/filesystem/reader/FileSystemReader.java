package com.bhargo.filesystem.reader;

import com.bhargo.reader.IReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileSystemReader implements IReader {
    @Override
    public List<String> read(String fileLocation, Class clazz) throws IOException {
        Files.lines(Paths.get(getFile(fileLocation, clazz).getAbsolutePath()));
        return Files.readAllLines(Paths.get(getFile(fileLocation, clazz).getAbsolutePath()));
    }
}

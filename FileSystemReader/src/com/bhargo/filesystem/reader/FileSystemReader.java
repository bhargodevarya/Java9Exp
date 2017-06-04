package com.bhargo.filesystem.reader;

import com.bhargo.reader.IReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileSystemReader implements IReader{
    @Override
    public List<String> read(String fileLocation, Class clazz) throws IOException {
        return Files.readAllLines(Paths.get(getFile(fileLocation, clazz).getAbsolutePath()));
    }
}

package com.bhargo.reader;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public interface IReader {
    List<String> read(String fileLocation, Class clazz) throws IOException;

    default File getFile(String fileLocation, Class clazz) {
        return new File(clazz.getClassLoader().getResource(fileLocation).getFile());
    }
}

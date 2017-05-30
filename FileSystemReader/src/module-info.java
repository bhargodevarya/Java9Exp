module com.bhargo.filesystem.reader {
    requires com.bhargo.reader;

    provides com.bhargo.reader.IReader
            with com.bhargo.filesystem.reader.FileSystemReader;

    opens com.bhargo.filesystem.reader;
}
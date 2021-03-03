package model;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Model implements IModel {
    @Override
    public String getMessage() throws IOException {
        return Files.readString(Path.of(Model.class.getResource("message.txt").getFile()), StandardCharsets.US_ASCII);
    }
}

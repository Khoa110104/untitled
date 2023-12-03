package oop.lab.lab10.decoratorpattern.pseudocode;

import java.io.*;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        File file = new File(filename);
        try (OutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buff = null;
        File file = new File(filename);
        try (FileReader reader = new FileReader(file)) {
            buff = new char[(int) file.length()];
            reader.read(buff);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new String(buff);
    }
}

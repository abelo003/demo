package com.example.demo.excersises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileToByteArray {

    public static void main(String[] args) throws IOException {
        File file = Paths.get("/Users/vn565xc/Documents/kubernetes/mongo-service.yaml").toFile();
        byte[] first = firstApproach(file);
        byte[] second = secondApproach(file);
        System.out.println(first.length);
        System.out.println(second.length);
        readingContent(file);
    }

    /**
     * Using Java 7 NIO library to read
     * @param file file name
     * @return byte array
     * @throws IOException
     */
    private static byte[] firstApproach(File file) throws IOException {
        return Files.readAllBytes(file.toPath());
    }

    /**
     * Using before java 7
     * @param file file name
     * @return byte array
     * @throws FileNotFoundException
     */
    private static byte[] secondApproach(File file) throws FileNotFoundException {
        byte[] array = new byte[(int)file.length()];
        try(FileInputStream fis = new FileInputStream(file)) {
            fis.read(array);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return array;
    }

    private static void readingContent(File file) throws IOException {
        System.out.println("\n****************** Reading file content ******************\n");
        Files.readAllLines(file.toPath()).stream()
                .forEach(System.out::println);
    }

}

package Lesson11.biginterfaceexample;

import Lesson11.biginterfaceexample.File;
import Lesson11.biginterfaceexample.FileReader;
import Lesson11.biginterfaceexample.Readable;
import Lesson11.biginterfaceexample.SimpleReader;
import Lesson11.biginterfaceexample.Storage;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File("test", "C:/user/home", "txt", 11);
        File file2 = new File("test", "C:/user/home", "txt", 11);
        File file3 = new File("video", "C:/user/home", "txt", 11);
        //File file4 = new File("test", "C:/user/home", "txt", 11);
        File file5 = new File("myhome", "C:/user/home", "gpg", 120);

        File[] files = new File[]{file1, file2, file3, file5};
        Storage storage = new Storage(files);

        FileReader fileReader = new FileReader();
        SimpleReader simpleReader = new SimpleReader();

        read(storage, fileReader);
        read(storage, simpleReader);


    }

    private static void read(Storage storage, Readable readable) {
        readable.readFilesFromStorage(storage);
    }
}

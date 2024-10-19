//This isn't part of the Android app, it's meant to be compiled on a computer with the regular java command to illustrate that this is a bug with Android and not with Java in general

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;




class Test{
    public static void main(String[] args){
        ZipFile zipFile = null;
        File file = new File("C:\\Users\\glind\\AppData\\Local\\Temp\\zip-bugreport\\kopia.zip");
        try {
            zipFile = new ZipFile(file);
        } catch (IOException e) {
            System.out.println("Could not open");
            return;
        }
        for(ZipEntry entry: Collections.list(zipFile.entries())){
            System.out.println(entry.getName());
        }
    }
}
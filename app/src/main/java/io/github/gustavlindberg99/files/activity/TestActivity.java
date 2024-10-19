package io.github.gustavlindberg99.files.activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ZipFile zipFile = null;
        File file = new File("/storage/emulated/0/Download/kopia.zip");
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
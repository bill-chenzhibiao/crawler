package store.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import store.Storable;

/**
 * @Author bill
 * @Date created in 2020/6/29
 **/
public class FileStore implements Storable {
  private InputStream inputStream;

  public FileStore(InputStream inputStream) {
    this.inputStream = inputStream;
  }

  @Override
  public void save(String savePath, String filename) {
    byte[] bytes = new byte[1024];
    int len;
    File file = new File(savePath);
    if (!file.exists()) {
      file.mkdirs();
    }
    FileOutputStream fileOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream(file.getPath() + "\\" + filename);
      while ((len = inputStream.read(bytes)) != -1) {
        fileOutputStream.write(bytes, 0, len);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        inputStream.close();
        fileOutputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

import java.io.InputStream;

import download.impl.ImageDownload;
import store.impl.FileStore;

/**
 * @Author bill
 * @Date created in 2020/6/29
 **/
public class Main {
  public static void main(String[] args) {
    ImageDownload imageDownload = new ImageDownload(
      "https://static.veer.com/veer/static/resources/keyword/2020-02-19/533ed30de651499da1c463bca44b6d60.jpg");
    InputStream downloadInputStream = imageDownload.download();
    FileStore fileStore = new FileStore(downloadInputStream);
    fileStore.save("C:\\Users\\asus\\Desktop", "testImage.jpg");
  }
}

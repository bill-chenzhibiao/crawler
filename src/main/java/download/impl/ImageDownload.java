package download.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import download.Downloadable;

/**
 * @Author bill
 * @Date created in 2020/6/29
 **/
public class ImageDownload implements Downloadable {
  private String imageUrl;

  public ImageDownload(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override
  public InputStream download() {
    try {
      URL url = new URL(imageUrl);
      URLConnection urlConnection = url.openConnection();
      urlConnection.setConnectTimeout(5 * 1000);
      InputStream inputStream = urlConnection.getInputStream();
      return inputStream;
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}

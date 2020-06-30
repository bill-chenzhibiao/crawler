import java.io.InputStream;

import download.impl.ImageDownload;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import store.impl.FileStore;
import util.HttpClientUtil;

/**
 * @Author bill
 * @Date created in 2020/6/29
 **/
public class Main {
  public static void main(String[] args) {
    HttpClient httpClient = HttpClients.createDefault();
    String html = HttpClientUtil.getHtml(httpClient, "", "http://news.baidu.com/");
    System.out.println(html);
  }
}

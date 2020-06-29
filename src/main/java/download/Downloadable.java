package download;

import java.io.InputStream;

/**
 * @Author bill
 * @Date created in 2020/6/29
 **/
public interface Downloadable {
  InputStream download();
}

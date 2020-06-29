package store;

/**
 * @Author bill
 * @Date created in 2020/6/29
 **/
public interface Storable {
  public void save(String savePath, String filename);
}

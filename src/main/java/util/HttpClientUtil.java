package util;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClientUtil {
    public static String getHtml(HttpClient httpClient, String method, String url){
        HttpGet httpGet = new HttpGet(url);
        try {
            HttpResponse response = httpClient.execute(httpGet);
            int returnCode = response.getStatusLine().getStatusCode();
            if (returnCode == 200) {
                String html = EntityUtils.toString(response.getEntity(), "utf8");
                return html;
            } else {
                System.out.println("error code: " + returnCode);
                return "";
            }

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

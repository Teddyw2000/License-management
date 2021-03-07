package de.teddy.response;

import de.teddy.status.Status;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Response {

    private String response;

    public Response(HttpClient httpClient, String url)
    {
        HttpGet request = null;

        try {
            request = new HttpGet(url);

            HttpResponse response = httpClient.execute(request);

            HttpEntity entity = response.getEntity();
            String content = EntityUtils.toString(entity);

            this.response = content;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (request != null) {
                request.releaseConnection();
            }
        }
    }

    public String getResponse() {
        return response;
    }
}

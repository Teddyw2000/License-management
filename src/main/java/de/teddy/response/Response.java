package de.teddy.response;

import com.google.gson.JsonParser;
import de.teddy.status.Status;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Response {

    private String response;
    private Status status;

    public Response(HttpClient httpClient, String url)
    {
        HttpGet request = null;

        try {
            request = new HttpGet(url);

            HttpResponse response = httpClient.execute(request);

            HttpEntity entity = response.getEntity();
            String content = EntityUtils.toString(entity);

            this.response = content;
            this.status = Status.valueOf(new JsonParser().parse(content).getAsJsonObject().get("status").getAsString());
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

    public Status getStatus() {
        return status;
    }
}

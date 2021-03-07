package de.teddy.request;

import de.teddy.response.Response;
import org.apache.http.client.HttpClient;

public abstract class Request {

    private final String url;
    private String key;

    public Request(String url)
    {
        this.url = url;
    }

    protected void setKey(String key)
    {
        this.key = key;
    }

    public abstract Response execute(HttpClient httpClient);

    public String getKey() {
        return key;
    }

    public String getUrl() {
        return url;
    }
}

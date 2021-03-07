package de.teddy.request.impl;

import de.teddy.request.Request;
import de.teddy.request.RequestURL;
import de.teddy.response.Response;
import org.apache.http.client.HttpClient;

public class StatusRequest extends Request {

    public StatusRequest(String key) {
        super(RequestURL.status);
        setKey(key);
    }

    public Response execute(HttpClient httpClient) {
//        System.out.println("..." + this.getUrl() + this.getKey());
        return new Response(httpClient, this.getUrl() + this.getKey());
    }
}

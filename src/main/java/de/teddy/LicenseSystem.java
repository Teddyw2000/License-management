package de.teddy;

import de.teddy.request.Request;
import de.teddy.request.impl.StatusRequest;
import de.teddy.response.Response;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class LicenseSystem {

    private static LicenseSystem instance = new LicenseSystem();

    public Response executeRequest(Request request)
    {
        HttpClient httpClient = HttpClientBuilder.create().build();
        return request.execute(httpClient);
    }

    public static LicenseSystem getInstance() {
        return instance;
    }
}

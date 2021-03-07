import de.teddy.LicenseSystem;
import de.teddy.request.impl.StatusRequest;
import de.teddy.response.Response;

public class Main {

    public static void main(String[] args) {
        Response response = LicenseSystem.getInstance().executeRequest(new StatusRequest("authkek"));
        System.out.println(response.getResponse());
    }

}

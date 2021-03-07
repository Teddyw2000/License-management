import de.teddy.LicenseSystem;
import de.teddy.request.impl.StatusRequest;
import de.teddy.response.Response;
import de.teddy.status.Status;

public class Main {

    public static void main(String[] args) {
        Response response = LicenseSystem.getInstance().executeRequest(new StatusRequest("authkek"));
        if(response.getStatus() == Status.VALID) {
            System.out.println("passed");
        } else {
            System.out.println("not passed");
        }
    }

}

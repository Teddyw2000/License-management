# LicenseSystem
Simple License System

# How to use
```java

public class Main
{
    private final LicenseSystem licenseSystem;

    public static void main(String[] args)
    {
        LicenseSystem licenseSystem = LicenseSystem.getInstance();
        Response response = licenseSystem.executeRequest(new StatusRequest("licenseKey"));
        System.out.println(response.getResponse());
    }
}

```

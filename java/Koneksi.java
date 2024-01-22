import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.net.URI;



public class Koneksi {
    public Koneksi(String ip){
       HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ip))
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Request sent to: " + ip);
            System.out.println("Response Code: " + response.statusCode());
            System.out.println(response.body());
            
            
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}

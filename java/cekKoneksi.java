
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tengku
 */
public class cekKoneksi {
    int led1Status;

    public int isLed1Status() {
        return led1Status;
    }
    public cekKoneksi(String ip){
       HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ip))
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            
            JSONObject json = new JSONObject(response.body());
            led1Status = json.getInt("LED1");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

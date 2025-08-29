package Task1;

import java.io.*;
import java.net.*;

public class NotThisOneAverageTemperatureCalculator {
    public static void main(String[] args) {
        URL temperatureUrl;
        try {
            temperatureUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream stream = temperatureUrl.openStream();

            InputStreamReader streamReader = new InputStreamReader(stream);

            BufferedReader bufferedReader = new BufferedReader(streamReader);

            String nextLine;
            StringBuilder response = new StringBuilder();
            while ((nextLine = bufferedReader.readLine()) != null) {
                response.append(nextLine);
            }

            bufferedReader.close();
            System.out.println(response.toString());

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

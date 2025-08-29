package Task1;

import java.io.*;
import java.net.MalformedURLException;
import java.net.*;

public class AverageTempCalculator {

    public static void main(String[] args) {
        URL temperatureUrl;
        try {
            temperatureUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (
                MalformedURLException e) {
            System.err.println(e);
            return;
        }
        FileReader reader;
        BufferedReader bufferedReader = null;
        String nextLine;
        String[] columnNames = new String[0];
        String ulkoTalo = "UlkoTalo";
        double temperatureSum = 0;
        int temperatureCounter = 0;
        boolean header = true;
        int ulkoTaloIndex = -1;  //epärealistinen indexi ettei tulosta mitä sattuu

        try {
            InputStream stream = temperatureUrl.openStream();

            InputStreamReader streamReader = new InputStreamReader(stream);


            bufferedReader = new BufferedReader(streamReader);

            do {
                nextLine = bufferedReader.readLine();
                if (nextLine != null) {
                    if (header) {
                        columnNames = nextLine.split(";");
                        for (int i = 0; i < columnNames.length; i++) {
                            if (columnNames[i].trim().equalsIgnoreCase(ulkoTalo)) {
                                ulkoTaloIndex = i;
                                header = false;
                                break;
                            }
                        }
                    }
                    System.out.println("löydös: " + columnNames[ulkoTaloIndex]);
                    try {
                        temperatureSum += Double.parseDouble(columnNames[ulkoTaloIndex].trim().replace(',', '.'));
                        temperatureCounter++;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    header = true;
                }

            } while (nextLine != null);

            if (temperatureCounter>0) {
                double averageTemp = temperatureSum / (double) temperatureCounter;
                System.out.println("Temperature average is: " + averageTemp + " with "
                        + temperatureCounter + " temperatures");
            } else {
                System.out.println("not working as intended");
            }



        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

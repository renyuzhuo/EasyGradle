package cn.renyuzhuo.easygradle.updater;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

public class Abc {

    public static void main(String[] args) {
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL("https://services.gradle.org/versions/all").openConnection();
            httpsURLConnection.setConnectTimeout(10000);
            int code = httpsURLConnection.getResponseCode();
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println(code);
            if (code == 200) {
                BufferedReader read = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                String tempString;
                while ((tempString = read.readLine()) != null) {
                    stringBuilder.append(tempString);
                }
                System.out.println(stringBuilder.toString());
            }

            List<GradleItem> gradleItemList = new Gson().fromJson(stringBuilder.toString(), new TypeToken<List<GradleItem>>() {
            }.getType());
            System.out.println(gradleItemList);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

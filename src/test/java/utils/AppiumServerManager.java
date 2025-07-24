package utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;

public class AppiumServerManager {

    private static AppiumDriverLocalService service;

    public static void start() {
        if (service == null || !service.isRunning()) {
            service = new AppiumServiceBuilder()
                    .withAppiumJS(new File("C:/Users/yusuf/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
                    .withIPAddress("127.0.0.1")
                    .usingPort(4725)
                    .withLogFile(new File("logs/appium.log"))
                    .build();
            service.start();
            System.out.println("Appium server started.");
        }
    }

    public static void stop() {
        if (service != null && service.isRunning()) {
            service.stop();
            System.out.println("Appium server stopped.");
        }
    }
}

package tests;

import io.appium.java_client.android.AndroidDriver;

public class ThreadLocalDriver {

    private static ThreadLocal<AndroidDriver> threadLocalDriver = new ThreadLocal<>();

    public synchronized static void setDriver(AndroidDriver driver) {
        threadLocalDriver.set(driver);
    }

    public synchronized static AndroidDriver getDriver() {
        return threadLocalDriver.get();
    }
}

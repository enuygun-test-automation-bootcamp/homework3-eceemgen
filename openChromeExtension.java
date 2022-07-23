public static void openChromeExtension() {
    ChromeOptions options = new ChromeOptions();

// Adding WebDriver proxy capability

    Proxy proxy = new Proxy();

proxy.setHttpProxy("myhttpproxy:3337");

options.setCapability("proxy", proxy);


// Adding ChromeDriver specific capability.

options.addExtensions(new File("/path/to/extension.crx"));

    ChromeDriver driver = new ChromeDriver(options);
}

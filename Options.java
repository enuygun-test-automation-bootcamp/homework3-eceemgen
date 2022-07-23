public static void openChromeExtension() {
chrome_options = Options()
        ChromeOptions options = new ChromeOptions();

        options.addArguments("user-data-dir=/AppData/Local/Google/Chrome/User Data/Profile 1");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        ChromeOptions options = new ChromeOptions();

        options.setBinary("/path/to/other/chrome/binary");
        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("excludeSwitches",

        Arrays.asList("disable-popup-blocking"));

        chrome_options.add_argument("user-data-dir=selenium")
        driver = webdriver.Chrome(chrome_options=chrome_options)
        driver.get("//accounts.google.com//") {
    ChromeOptions options = new ChromeOptions();

options.addExtensions(new File("/path/to/extension.crx"));

    ChromeDriver driver = new ChromeDriver(options);
}

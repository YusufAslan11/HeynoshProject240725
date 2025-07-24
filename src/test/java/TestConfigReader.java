public class TestConfigReader {
    public static void main(String[] args) {
        System.out.println("Platform name: " + utils.ConfigReader.get("platformName"));
        System.out.println("App package: " + utils.ConfigReader.get("appPackage"));
    }
}

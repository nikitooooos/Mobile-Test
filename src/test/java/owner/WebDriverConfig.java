package owner;


import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {
    @Key("browserstack.userName")
    String getUserName();

    @Key("browserstack.accessKey")
    String getAccessKey();


    @Key("browserstack.url")
    String getUrl();

    @Key("browserstack.device")
    String getDevice();

    @Key("browserstack.os")
    String getOS();

    @Key("browserstack.app")
    String getApp();
}
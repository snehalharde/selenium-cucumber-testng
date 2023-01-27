package config;

import org.aeonbits.owner.ConfigFactory;

public final class ConfigReader {

    private ConfigReader() {
    }

    public static globalConfiguration getConfig(){
        return ConfigFactory.create(globalConfiguration.class);
    }
}

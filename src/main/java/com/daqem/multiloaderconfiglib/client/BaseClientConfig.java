package com.daqem.multiloaderconfiglib.client;

import com.daqem.multiloaderconfiglib.BaseConfig;
import com.daqem.multiloaderconfiglib.ConfigType;

import java.nio.file.Path;

public abstract class BaseClientConfig extends BaseConfig {

    public BaseClientConfig(Path configPath, String modId, String fileName) {
        super(configPath, modId, fileName, ConfigType.CLIENT);
    }
}

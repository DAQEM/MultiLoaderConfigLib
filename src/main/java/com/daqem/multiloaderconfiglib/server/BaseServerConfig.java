package com.daqem.multiloaderconfiglib.server;

import com.daqem.multiloaderconfiglib.BaseConfig;
import com.daqem.multiloaderconfiglib.ConfigType;

import java.nio.file.Path;

public abstract class BaseServerConfig extends BaseConfig {

    public BaseServerConfig(Path configPath, String modId, String fileName) {
        super(configPath, modId, fileName, ConfigType.SERVER);
    }
}

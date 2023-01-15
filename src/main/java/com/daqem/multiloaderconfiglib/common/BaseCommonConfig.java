package com.daqem.multiloaderconfiglib.common;

import com.daqem.multiloaderconfiglib.BaseConfig;
import com.daqem.multiloaderconfiglib.ConfigType;

import java.nio.file.Path;

public abstract class BaseCommonConfig extends BaseConfig {

    public BaseCommonConfig(Path configPath, String modId, String fileName) {
        super(configPath, modId, fileName, ConfigType.COMMON);
    }
}

package com.daqem.multiloaderconfiglib;

import com.daqem.multiloaderconfiglib.client.BaseClientConfig;
import com.daqem.multiloaderconfiglib.common.BaseCommonConfig;
import com.daqem.multiloaderconfiglib.server.BaseServerConfig;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class MultiLoaderConfig {

    public static final Logger LOGGER = LogUtils.getLogger();

    public static final List<BaseClientConfig> CLIENT_CONFIGS = new ArrayList<>();
    public static final List<BaseCommonConfig> COMMON_CONFIGS = new ArrayList<>();
    public static final List<BaseServerConfig> SERVER_CONFIGS = new ArrayList<>();

    public static void addClientConfigs(BaseClientConfig... config) {
        CLIENT_CONFIGS.addAll(List.of(config));
    }

    public static void addCommonConfigs(BaseCommonConfig... config) {
        COMMON_CONFIGS.addAll(List.of(config));
    }

    public static void addServerConfigs(BaseServerConfig... config) {
        SERVER_CONFIGS.addAll(List.of(config));
    }
}

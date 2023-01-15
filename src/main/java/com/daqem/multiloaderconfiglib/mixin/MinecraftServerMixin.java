package com.daqem.multiloaderconfiglib.mixin;

import com.daqem.multiloaderconfiglib.MultiLoaderConfigLib;
import com.daqem.multiloaderconfiglib.common.BaseCommonConfig;
import com.daqem.multiloaderconfiglib.server.BaseServerConfig;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {

    @Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/server/MinecraftServer;initServer()Z"), method = "runServer")
    private void beforeServerStart(CallbackInfo info) {
        for (BaseServerConfig serverConfig : MultiLoaderConfigLib.SERVER_CONFIGS) {
            serverConfig.init();
        }
        for (BaseCommonConfig commonConfig : MultiLoaderConfigLib.COMMON_CONFIGS) {
            commonConfig.init();
        }
    }
}

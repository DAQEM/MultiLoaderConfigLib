package com.daqem.multiloaderconfiglib.mixin;

import com.daqem.multiloaderconfiglib.MultiLoaderConfigLib;
import com.daqem.multiloaderconfiglib.client.BaseClientConfig;
import com.daqem.multiloaderconfiglib.common.BaseCommonConfig;
import net.minecraft.client.main.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Main.class)
public class MainMixin {

    @Inject(at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;beginInitialization()V"), method = "run")
    private static void onClientStart(String[] args, boolean bool, CallbackInfo info) {
        for (BaseClientConfig clientConfig : MultiLoaderConfigLib.CLIENT_CONFIGS) {
            clientConfig.init();
        }
        for (BaseCommonConfig commonConfig : MultiLoaderConfigLib.COMMON_CONFIGS) {
            commonConfig.init();
        }
    }
}

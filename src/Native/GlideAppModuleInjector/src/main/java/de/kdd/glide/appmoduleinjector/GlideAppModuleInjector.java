package de.kdd.glide.appmoduleinjector;

import com.bumptech.glide.module.AppGlideModule;

public final class GlideAppModuleInjector {
    private static boolean _isModuleInjected = false;

    private GlideAppModuleInjector() {
    }

    public static boolean Inject(AppGlideModule module) {
        if (_isModuleInjected) {
            return false;
        }

        InetrnalGlideAppModule.Initialize(module);

        _isModuleInjected = true;
        return true;
    }
}
package de.kdd.glide.appmoduleinjector;

import android.content.Context;
import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

@GlideModule
public class InetrnalGlideAppModule extends AppGlideModule {
    private static AppGlideModule _injectedModule;

    public static void Initialize(AppGlideModule injectedModule) {
        _injectedModule = injectedModule;
    }

    @Override
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        if (_injectedModule != null) {
            _injectedModule.registerComponents(context, glide, registry);
        }
    }
}
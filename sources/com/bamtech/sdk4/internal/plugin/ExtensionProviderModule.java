package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.plugin.DefaultExtensionInstanceProvider;
import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/plugin/ExtensionProviderModule;", "", "()V", "instanceProvider", "Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;", "registry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PluginRegistryModule.kt */
public final class ExtensionProviderModule {
    public final ExtensionInstanceProvider instanceProvider(PluginRegistry pluginRegistry) {
        return new DefaultExtensionInstanceProvider(pluginRegistry);
    }
}

package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ@\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u00122\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0014H\u0016J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00072\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0014H\u0002J;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\r\u001a\u00020\u000e2\u001e\u0010\u001a\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u001b\"\b\u0012\u0004\u0012\u00020\f0\u0016H\u0002¢\u0006\u0002\u0010\u001cJ;\u0010\u001d\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u00122\u0006\u0010 \u001a\u0002H\u001fH\u0016¢\u0006\u0002\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/DefaultBaseIdentityClient;", "Lcom/bamtech/sdk4/internal/identity/bam/BaseIdentityClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "customConverter", "Lcom/bamtech/core/networking/converters/Converter;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Lcom/bamtech/core/networking/converters/Converter;)V", "converter", "getIdentity", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/identity/bam/Identity;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "identityType", "Ljava/lang/Class;", "identityResponseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "type", "identityResponseTransformer", "Lcom/bamtech/core/networking/handlers/DefaultResponseTransformer;", "responseHandlers", "", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;[Lcom/bamtech/core/networking/handlers/ResponseHandler;)Lcom/bamtech/core/networking/handlers/DefaultResponseTransformer;", "updateAttributes", "Lio/reactivex/Completable;", "T", "attributes", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/util/Map;Ljava/lang/Object;)Lio/reactivex/Completable;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BaseIdentityClient.kt */
public final class DefaultBaseIdentityClient implements BaseIdentityClient {
    public DefaultBaseIdentityClient(ConfigurationProvider configurationProvider, ConverterProvider converterProvider, Converter converter) {
        if (converter == null) {
            converterProvider.getIdentity();
        }
    }
}
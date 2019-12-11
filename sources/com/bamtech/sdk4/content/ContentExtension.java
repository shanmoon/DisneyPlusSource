package com.bamtech.sdk4.content;

import com.bamtech.sdk4.content.custom.GraphQlRequest;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.lang.reflect.Type;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&JN\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u0003\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&JD\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u0003\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&Ja\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u0003\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012\"\u00020\u00102\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0002\u0010\u0013JH\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u0003\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&JW\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u0003\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0012\"\u00020\u00102\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0002\u0010\u0014J>\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u0003\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/ContentExtension;", "", "query", "Lio/reactivex/Single;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "overrides", "Lcom/bamtech/sdk4/content/SearchOverrides;", "contentTransactionId", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/Class;", "Ljava/lang/reflect/Type;", "parameters", "", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/reflect/Type;Lcom/bamtech/sdk4/content/custom/GraphQlRequest;Lcom/bamtech/sdk4/content/SearchOverrides;[Ljava/lang/reflect/Type;Ljava/lang/String;)Lio/reactivex/Single;", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/reflect/Type;Lcom/bamtech/sdk4/content/custom/GraphQlRequest;[Ljava/lang/reflect/Type;Ljava/lang/String;)Lio/reactivex/Single;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentExtension.kt */
public interface ContentExtension {
    Single<String> query(ServiceTransaction serviceTransaction, GraphQlRequest graphQlRequest, SearchOverrides searchOverrides, String str);

    <T> Single<GraphQlResponse<T>> query(ServiceTransaction serviceTransaction, Class<T> cls, GraphQlRequest graphQlRequest, String str);

    <T> Single<GraphQlResponse<T>> query(ServiceTransaction serviceTransaction, Type type, GraphQlRequest graphQlRequest, SearchOverrides searchOverrides, String str);
}

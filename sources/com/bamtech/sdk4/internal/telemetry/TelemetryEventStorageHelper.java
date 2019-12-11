package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\bH&J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\"\u0010\b\u0000\u0010\u0010*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u0002H\u0010H&¢\u0006\u0002\u0010\u0013J9\u0010\u0014\u001a\u0004\u0018\u00010\b\"\u0010\b\u0000\u0010\u0010*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\u0017\u001a\u00020\u0018H&¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/TelemetryEventStorageHelper;", "", "createDustFile", "Lcom/bamtech/sdk4/internal/telemetry/TaskResponse;", "", "file", "Ljava/io/File;", "generateFilename", "", "getDustFile", "folder", "fileName", "persistToFile", "contents", "removeEmptyFile", "serialize", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "event", "(Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;)Lcom/bamtech/sdk4/internal/telemetry/TaskResponse;", "storeEvent", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "callback", "Lcom/bamtech/sdk4/internal/telemetry/ErrorHandler;", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;Lcom/bamtech/sdk4/internal/telemetry/ErrorHandler;)Ljava/lang/String;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryStoreEventHelper.kt */
public interface TelemetryEventStorageHelper {
    TaskResponse<Boolean> removeEmptyFile(String str);

    <T extends TelemetryEvent<?, ?>> String storeEvent(ServiceTransaction serviceTransaction, T t, ErrorHandler errorHandler);
}

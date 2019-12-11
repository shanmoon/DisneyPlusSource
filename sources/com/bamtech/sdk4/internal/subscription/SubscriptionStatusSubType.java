package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/SubscriptionStatusSubType;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "PENDING_VOLUNTARY_CANCEL", "PENDING_INVOLUNTARY_CANCEL", "VOLUNTARY_CANCEL", "INVOLUNTARY_CANCEL", "LAPSED", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public enum SubscriptionStatusSubType {
    UNKNOWN,
    PENDING_VOLUNTARY_CANCEL,
    PENDING_INVOLUNTARY_CANCEL,
    VOLUNTARY_CANCEL,
    INVOLUNTARY_CANCEL,
    LAPSED
}

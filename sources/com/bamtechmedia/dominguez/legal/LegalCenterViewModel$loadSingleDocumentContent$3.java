package com.bamtechmedia.dominguez.legal;

import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$loadSingleDocumentContent$3<T> implements Consumer<Throwable> {
    public static final LegalCenterViewModel$loadSingleDocumentContent$3 INSTANCE = new LegalCenterViewModel$loadSingleDocumentContent$3();

    LegalCenterViewModel$loadSingleDocumentContent$3() {
    }

    public final void accept(Throwable th) {
        C14100a.m44528b(th, "Error loading legal doc content!", new Object[0]);
    }
}

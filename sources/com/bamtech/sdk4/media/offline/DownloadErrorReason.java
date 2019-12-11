package com.bamtech.sdk4.media.offline;

import com.bamtech.sdk4.service.ErrorReason;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadErrorReason;", "Lcom/bamtech/sdk4/service/ErrorReason;", "code", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadError.kt */
public final class DownloadErrorReason implements ErrorReason {
    private final String code;
    private final String description;

    public DownloadErrorReason(String str, String str2) {
        this.code = str;
        this.description = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getDescription(), (java.lang.Object) r3.getDescription()) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0027
            boolean r0 = r3 instanceof com.bamtech.sdk4.media.offline.DownloadErrorReason
            if (r0 == 0) goto L_0x0025
            com.bamtech.sdk4.media.offline.DownloadErrorReason r3 = (com.bamtech.sdk4.media.offline.DownloadErrorReason) r3
            java.lang.String r0 = r2.getCode()
            java.lang.String r1 = r3.getCode()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r2.getDescription()
            java.lang.String r3 = r3.getDescription()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = 0
            return r3
        L_0x0027:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.offline.DownloadErrorReason.equals(java.lang.Object):boolean");
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public int hashCode() {
        String code2 = getCode();
        int i = 0;
        int hashCode = (code2 != null ? code2.hashCode() : 0) * 31;
        String description2 = getDescription();
        if (description2 != null) {
            i = description2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadErrorReason(code=");
        sb.append(getCode());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(")");
        return sb.toString();
    }
}

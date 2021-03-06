package com.bamtech.sdk4.internal.media.offline.p047db;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H'¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/OldMediaLicenseDao;", "", "deleteLicenses", "", "licenses", "", "Lcom/bamtech/sdk4/internal/media/offline/db/OldMediaLicenseEntry;", "([Lcom/bamtech/sdk4/internal/media/offline/db/OldMediaLicenseEntry;)V", "getAll", "", "store", "license", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseDao */
/* compiled from: OldMediaLicenseEntry.kt */
public interface OldMediaLicenseDao {
    void deleteLicenses(OldMediaLicenseEntry... oldMediaLicenseEntryArr);

    List<OldMediaLicenseEntry> getAll();

    void store(OldMediaLicenseEntry oldMediaLicenseEntry);
}

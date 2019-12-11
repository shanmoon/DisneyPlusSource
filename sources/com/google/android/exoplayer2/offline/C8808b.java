package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.C8807a;
import com.google.android.exoplayer2.upstream.C9455c0.C9456a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.offline.b */
/* compiled from: FilteringManifestParser */
public final class C8808b<T extends C8807a<T>> implements C9456a<T> {

    /* renamed from: a */
    private final C9456a<? extends T> f18725a;

    /* renamed from: b */
    private final List<StreamKey> f18726b;

    public C8808b(C9456a<? extends T> aVar, List<StreamKey> list) {
        this.f18725a = aVar;
        this.f18726b = list;
    }

    /* renamed from: a */
    public T m25534a(Uri uri, InputStream inputStream) throws IOException {
        T t = (C8807a) this.f18725a.mo23036a(uri, inputStream);
        List<StreamKey> list = this.f18726b;
        return (list == null || list.isEmpty()) ? t : (C8807a) t.mo23035a(this.f18726b);
    }
}

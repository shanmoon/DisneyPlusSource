package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C9963a;
import com.google.android.gms.dynamite.DynamiteModule.C9964b;
import com.google.android.gms.dynamite.DynamiteModule.C9964b.C9965a;
import com.google.android.gms.dynamite.DynamiteModule.C9964b.C9966b;

/* renamed from: com.google.android.gms.dynamite.f */
final class C9974f implements C9964b {
    C9974f() {
    }

    /* renamed from: a */
    public final C9966b mo25483a(Context context, String str, C9965a aVar) throws C9963a {
        C9966b bVar = new C9966b();
        bVar.f23247a = aVar.mo25484a(context, str);
        bVar.f23248b = aVar.mo25485a(context, str, true);
        if (bVar.f23247a == 0 && bVar.f23248b == 0) {
            bVar.f23249c = 0;
        } else if (bVar.f23248b >= bVar.f23247a) {
            bVar.f23249c = 1;
        } else {
            bVar.f23249c = -1;
        }
        return bVar;
    }
}

package p163g.p449j.p450a.p451a.p465e.p466b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p397z.C9919b;

/* renamed from: g.j.a.a.e.b.c */
public final class C11410c implements Creator<C11409b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C9919b.m30894b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C9919b.m30889a(parcel);
            int a2 = C9919b.m30888a(a);
            if (a2 == 1) {
                i = C9919b.m30906k(parcel, a);
            } else if (a2 == 2) {
                i2 = C9919b.m30906k(parcel, a);
            } else if (a2 != 3) {
                C9919b.m30910o(parcel, a);
            } else {
                intent = (Intent) C9919b.m30891a(parcel, a, Intent.CREATOR);
            }
        }
        C9919b.m30900e(parcel, b);
        return new C11409b(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C11409b[i];
    }
}

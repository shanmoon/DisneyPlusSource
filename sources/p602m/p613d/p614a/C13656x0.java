package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.a.x0 */
/* compiled from: DERGraphicString */
public class C13656x0 extends C13643t implements C13661z {

    /* renamed from: c */
    private final byte[] f30369c;

    public C13656x0(byte[] bArr) {
        this.f30369c = C14079a.m44450a(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34862a(25, this.f30369c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        return C13485b2.m41537a(this.f30369c.length) + 1 + this.f30369c.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return C14079a.m44457b(this.f30369c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13656x0)) {
            return false;
        }
        return C14079a.m44446a(this.f30369c, ((C13656x0) tVar).f30369c);
    }
}
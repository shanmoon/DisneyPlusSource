package p602m.p603a.p604a.p605a;

/* renamed from: m.a.a.a.a */
/* compiled from: AlreadySelectedException */
public class C13431a extends C13444l {
    public C13431a(String str) {
        super(str);
    }

    public C13431a(C13441i iVar, C13440h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("The option '");
        stringBuffer.append(hVar.mo34666d());
        stringBuffer.append("' was specified but an option from this group ");
        stringBuffer.append("has already been selected: '");
        stringBuffer.append(iVar.mo34683b());
        stringBuffer.append("'");
        this(stringBuffer.toString());
    }
}
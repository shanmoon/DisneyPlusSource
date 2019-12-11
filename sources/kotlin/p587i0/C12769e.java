package kotlin.p587i0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.i0.e */
/* compiled from: Sequences.kt */
public final class C12769e<T> implements C12775h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12775h<T> f29432a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f29433b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function1<T, Boolean> f29434c;

    /* renamed from: kotlin.i0.e$a */
    /* compiled from: Sequences.kt */
    public static final class C12770a implements Iterator<T>, C12872a {

        /* renamed from: U */
        private int f29435U = -1;

        /* renamed from: V */
        private T f29436V;

        /* renamed from: W */
        final /* synthetic */ C12769e f29437W;

        /* renamed from: c */
        private final Iterator<T> f29438c;

        C12770a(C12769e eVar) {
            this.f29437W = eVar;
            this.f29438c = eVar.f29432a.iterator();
        }

        /* renamed from: b */
        private final void m39933b() {
            while (this.f29438c.hasNext()) {
                T next = this.f29438c.next();
                if (((Boolean) this.f29437W.f29434c.invoke(next)).booleanValue() == this.f29437W.f29433b) {
                    this.f29436V = next;
                    this.f29435U = 1;
                    return;
                }
            }
            this.f29435U = 0;
        }

        public boolean hasNext() {
            if (this.f29435U == -1) {
                m39933b();
            }
            return this.f29435U == 1;
        }

        public T next() {
            if (this.f29435U == -1) {
                m39933b();
            }
            if (this.f29435U != 0) {
                T t = this.f29436V;
                this.f29436V = null;
                this.f29435U = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12769e(C12775h<? extends T> hVar, boolean z, Function1<? super T, Boolean> function1) {
        this.f29432a = hVar;
        this.f29433b = z;
        this.f29434c = function1;
    }

    public Iterator<T> iterator() {
        return new C12770a(this);
    }
}

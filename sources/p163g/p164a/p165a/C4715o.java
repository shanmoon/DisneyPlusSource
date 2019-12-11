package p163g.p164a.p165a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;

/* renamed from: g.a.a.o */
/* compiled from: FloatingButton */
public class C4715o extends Button implements OnTouchListener {
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public static final String f11721d0 = C4715o.class.getSimpleName();

    /* renamed from: U */
    private float f11722U;

    /* renamed from: V */
    private float f11723V;

    /* renamed from: W */
    private C4719c f11724W;

    /* renamed from: a0 */
    private C4720d f11725a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public float f11726b0;

    /* renamed from: c */
    private float f11727c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public float f11728c0;

    /* renamed from: g.a.a.o$a */
    /* compiled from: FloatingButton */
    class C4716a implements Runnable {

        /* renamed from: U */
        final /* synthetic */ int f11729U;

        /* renamed from: V */
        final /* synthetic */ int f11730V;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f11732c;

        /* renamed from: g.a.a.o$a$a */
        /* compiled from: FloatingButton */
        class C4717a implements OnGlobalLayoutListener {

            /* renamed from: U */
            final /* synthetic */ int f11733U;

            /* renamed from: c */
            final /* synthetic */ int f11735c;

            C4717a(int i, int i2) {
                this.f11735c = i;
                this.f11733U = i2;
            }

            public void onGlobalLayout() {
                C4715o.this.mo16057a((OnGlobalLayoutListener) this);
                if (C4715o.this.f11726b0 < 0.0f || C4715o.this.f11728c0 < 0.0f) {
                    C4715o oVar = C4715o.this;
                    oVar.mo16055a((float) ((this.f11735c / 2) - (oVar.getWidth() / 2)), (float) ((this.f11733U / 2) - (C4715o.this.getHeight() / 2)));
                    return;
                }
                C4715o oVar2 = C4715o.this;
                oVar2.f11726b0 = oVar2.m16395b((float) this.f11735c, oVar2.f11726b0);
                C4715o oVar3 = C4715o.this;
                oVar3.f11728c0 = oVar3.m16400c((float) this.f11733U, oVar3.f11728c0);
                C4715o oVar4 = C4715o.this;
                oVar4.mo16055a(oVar4.f11726b0, C4715o.this.f11728c0);
            }
        }

        C4716a(ViewGroup viewGroup, int i, int i2) {
            this.f11732c = viewGroup;
            this.f11729U = i;
            this.f11730V = i2;
        }

        public void run() {
            int measuredWidth = this.f11732c.getMeasuredWidth() == 0 ? this.f11729U : this.f11732c.getMeasuredWidth();
            int measuredHeight = this.f11732c.getMeasuredHeight() == 0 ? this.f11730V : this.f11732c.getMeasuredHeight();
            C4715o oVar = (C4715o) this.f11732c.findViewWithTag("ADBFloatingButtonTag");
            if (oVar != null) {
                oVar.mo16055a(oVar.m16395b((float) measuredWidth, C4648a1.m16198k().mo15972d()), oVar.m16400c((float) measuredHeight, C4648a1.m16198k().mo15974e()));
                return;
            }
            C4715o.this.getViewTreeObserver().addOnGlobalLayoutListener(new C4717a(measuredWidth, measuredHeight));
            this.f11732c.addView(C4715o.this);
            LayoutParams layoutParams = C4715o.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C4715o.this.m16392a(80);
                layoutParams.height = C4715o.this.m16392a(80);
                C4715o.this.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: g.a.a.o$b */
    /* compiled from: FloatingButton */
    static class C4718b implements Runnable {
        C4718b() {
        }

        public void run() {
            try {
                C4715o oVar = (C4715o) ((ViewGroup) C4783y0.m16653m().getWindow().getDecorView().getRootView()).findViewWithTag("ADBFloatingButtonTag");
                if (oVar != null) {
                    oVar.setVisibility(8);
                }
            } catch (Exception e) {
                C4783y0.m16630a("%s - error hiding the Target Preview button (%s)", C4715o.f11721d0, e);
            }
        }
    }

    /* renamed from: g.a.a.o$c */
    /* compiled from: FloatingButton */
    interface C4719c {
        /* renamed from: a */
        void mo15966a(C4715o oVar);
    }

    /* renamed from: g.a.a.o$d */
    /* compiled from: FloatingButton */
    interface C4720d {
        /* renamed from: a */
        void mo15965a(float f, float f2);
    }

    public C4715o(Context context, float f, float f2) {
        super(context);
        this.f11726b0 = f;
        this.f11728c0 = f2;
        m16401c();
        setOnTouchListener(this);
    }

    /* renamed from: c */
    private void m16401c() {
        Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(Base64.decode("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", 0)));
        if (VERSION.SDK_INT >= 16) {
            try {
                getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredMethod("setBackground", new Class[]{Drawable.class}).invoke(this, new Object[]{new BitmapDrawable(getResources(), decodeStream)});
            } catch (Exception e) {
                C4783y0.m16630a("%s - Error while setting background image! (%s)", f11721d0, e);
                setText("Preview");
            }
        } else {
            setBackgroundDrawable(new BitmapDrawable(getResources(), decodeStream));
        }
    }

    /* access modifiers changed from: 0000 */
    public float getXCompat() {
        try {
            return ((Float) getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredMethod("getX", new Class[0]).invoke(this, new Object[0])).floatValue();
        } catch (Exception e) {
            C4783y0.m16630a("%s - Could not get x co-ordinate for FloatingButton (%s)", f11721d0, e);
            return -1.0f;
        }
    }

    /* access modifiers changed from: 0000 */
    public float getYCompat() {
        try {
            return ((Float) getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredMethod("getY", new Class[0]).invoke(this, new Object[0])).floatValue();
        } catch (Exception e) {
            C4783y0.m16630a("%s - Could not get y co-ordinate for FloatingButton (%s)", f11721d0, e);
            return -1.0f;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4719c cVar = this.f11724W;
        if (cVar != null) {
            cVar.mo15966a(this);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f11723V < 20.0f) {
                performClick();
            }
        } else if (motionEvent.getAction() == 0) {
            this.f11723V = 0.0f;
            this.f11727c = motionEvent.getRawX();
            this.f11722U = motionEvent.getRawY();
        } else if (motionEvent.getAction() == 2) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            mo16055a(rawX - ((float) (getWidth() / 2)), rawY - ((float) (getHeight() / 2)));
            float abs = Math.abs(rawX - this.f11727c) + Math.abs(rawY - this.f11722U);
            if (abs > this.f11723V) {
                this.f11723V = abs;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m16399b() {
        try {
            C4783y0.m16653m().runOnUiThread(new C4718b());
        } catch (Exception e) {
            C4783y0.m16640c("%s - error hiding the Target Preview button (%s)", f11721d0, e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16056a(Activity activity, C4719c cVar, C4720d dVar) {
        if (activity == null) {
            C4783y0.m16636b("Could not show the Target Preview button - no activity set!", new Object[0]);
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        this.f11724W = cVar;
        this.f11725a0 = dVar;
        try {
            activity.runOnUiThread(new C4716a((ViewGroup) activity.getWindow().getDecorView().getRootView(), i2, i));
        } catch (Exception e) {
            C4783y0.m16640c("%s - could not show Target Preview button (%s)", f11721d0, e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public float m16395b(float f, float f2) {
        return f2 > f - ((float) getWidth()) ? f - ((float) getWidth()) : f2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public float m16400c(float f, float f2) {
        return f2 > f - ((float) getHeight()) ? f - ((float) getHeight()) : f2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m16392a(int i) {
        try {
            return Math.round(((float) i) * getResources().getDisplayMetrics().density);
        } catch (Exception unused) {
            return 210;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16057a(OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (VERSION.SDK_INT >= 16) {
            try {
                viewTreeObserver.getClass().getDeclaredMethod("removeOnGlobalLayoutListener", new Class[]{OnGlobalLayoutListener.class}).invoke(viewTreeObserver, new Object[]{onGlobalLayoutListener});
            } catch (Exception e) {
                C4783y0.m16630a("%s - Error while removing onGlobalLayoutListener (%s)", f11721d0, e);
            }
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16055a(float f, float f2) {
        try {
            Class superclass = getClass().getSuperclass().getSuperclass().getSuperclass();
            Method declaredMethod = superclass.getDeclaredMethod("setX", new Class[]{Float.TYPE});
            Method declaredMethod2 = superclass.getDeclaredMethod("setY", new Class[]{Float.TYPE});
            declaredMethod.invoke(this, new Object[]{Float.valueOf(f)});
            declaredMethod2.invoke(this, new Object[]{Float.valueOf(f2)});
            if (this.f11725a0 != null) {
                this.f11725a0.mo15965a(f, f2);
            }
        } catch (Exception e) {
            C4783y0.m16630a("%s - Could not set display co-ordinates for FloatingButton (%s)", f11721d0, e);
        }
    }
}

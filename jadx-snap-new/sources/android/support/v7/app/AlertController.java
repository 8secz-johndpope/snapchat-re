package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.ls;
import java.lang.ref.WeakReference;

public final class AlertController {
    public ListAdapter A;
    public int B = -1;
    public int C;
    public int D;
    public int E;
    public boolean F;
    Handler G;
    public final OnClickListener H = new OnClickListener() {
        /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
        public final void onClick(android.view.View r3) {
            /*
            r2 = this;
            r0 = android.support.v7.app.AlertController.this;
            r0 = r0.h;
            if (r3 != r0) goto L_0x0015;
        L_0x0006:
            r0 = android.support.v7.app.AlertController.this;
            r0 = r0.j;
            if (r0 == 0) goto L_0x0015;
        L_0x000c:
            r3 = android.support.v7.app.AlertController.this;
            r3 = r3.j;
        L_0x0010:
            r3 = android.os.Message.obtain(r3);
            goto L_0x0038;
        L_0x0015:
            r0 = android.support.v7.app.AlertController.this;
            r0 = r0.l;
            if (r3 != r0) goto L_0x0026;
        L_0x001b:
            r0 = android.support.v7.app.AlertController.this;
            r0 = r0.n;
            if (r0 == 0) goto L_0x0026;
        L_0x0021:
            r3 = android.support.v7.app.AlertController.this;
            r3 = r3.n;
            goto L_0x0010;
        L_0x0026:
            r0 = android.support.v7.app.AlertController.this;
            r0 = r0.p;
            if (r3 != r0) goto L_0x0037;
        L_0x002c:
            r3 = android.support.v7.app.AlertController.this;
            r3 = r3.r;
            if (r3 == 0) goto L_0x0037;
        L_0x0032:
            r3 = android.support.v7.app.AlertController.this;
            r3 = r3.r;
            goto L_0x0010;
        L_0x0037:
            r3 = 0;
        L_0x0038:
            if (r3 == 0) goto L_0x003d;
        L_0x003a:
            r3.sendToTarget();
        L_0x003d:
            r3 = android.support.v7.app.AlertController.this;
            r3 = r3.G;
            r0 = 1;
            r1 = android.support.v7.app.AlertController.this;
            r1 = r1.b;
            r3 = r3.obtainMessage(r0, r1);
            r3.sendToTarget();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AlertController$AnonymousClass1.onClick(android.view.View):void");
        }
    };
    private boolean I = false;
    private int J;
    private int K;
    private int L;
    private int M = 0;
    public final Context a;
    public final ls b;
    public final Window c;
    final int d;
    public CharSequence e;
    public CharSequence f;
    public ListView g;
    public Button h;
    public CharSequence i;
    Message j;
    Drawable k;
    public Button l;
    public CharSequence m;
    Message n;
    Drawable o;
    public Button p;
    public CharSequence q;
    Message r;
    Drawable s;
    public NestedScrollView t;
    public int u = 0;
    public Drawable v;
    public ImageView w;
    public TextView x;
    public TextView y;
    public View z;

    /* renamed from: android.support.v7.app.AlertController$3 */
    public class AnonymousClass3 implements Runnable {
        private /* synthetic */ View a;
        private /* synthetic */ View b;

        public AnonymousClass3(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public final void run() {
            AlertController.a(AlertController.this.t, this.a, this.b);
        }
    }

    /* renamed from: android.support.v7.app.AlertController$4 */
    public class AnonymousClass4 implements OnScrollListener {
        private /* synthetic */ View a;
        private /* synthetic */ View b;

        public AnonymousClass4(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.a(absListView, this.a, this.b);
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: android.support.v7.app.AlertController$5 */
    public class AnonymousClass5 implements Runnable {
        private /* synthetic */ View a;
        private /* synthetic */ View b;

        public AnonymousClass5(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public final void run() {
            AlertController.a(AlertController.this.g, this.a, this.b);
        }
    }

    public static class RecycleListView extends ListView {
        public final int a;
        public final int b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.lx.a.v);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public static class a {
        public final Context a;
        public final LayoutInflater b;
        public Drawable c;
        public CharSequence d;
        public View e;
        public CharSequence f;
        public CharSequence g;
        public DialogInterface.OnClickListener h;
        public CharSequence i;
        public DialogInterface.OnClickListener j;
        public CharSequence k;
        public DialogInterface.OnClickListener l;
        public boolean m;
        public OnKeyListener n;
        public ListAdapter o;
        public DialogInterface.OnClickListener p;
        public int q = -1;
        private int r = 0;
        private int s = 0;
        private boolean t = false;
        private boolean u = true;

        /* renamed from: android.support.v7.app.AlertController$a$1 */
        public class AnonymousClass1 implements OnItemClickListener {
            private /* synthetic */ AlertController a;

            public AnonymousClass1(AlertController alertController) {
                this.a = alertController;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                a.this.p.onClick(this.a.b, i);
                this.a.b.dismiss();
            }
        }

        public a(Context context) {
            this.a = context;
            this.m = true;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    static final class b extends Handler {
        private WeakReference<DialogInterface> a;

        public b(DialogInterface dialogInterface) {
            this.a = new WeakReference(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
                return;
            }
            if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class c extends ArrayAdapter<CharSequence> {
        public c(Context context, int i) {
            super(context, i, 16908308, null);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    /* renamed from: android.support.v7.app.AlertController$2 */
    public class AnonymousClass2 implements android.support.v4.widget.NestedScrollView.b {
        private /* synthetic */ View a;
        private /* synthetic */ View b;

        public AnonymousClass2(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public final void a(NestedScrollView nestedScrollView) {
            AlertController.a(nestedScrollView, this.a, this.b);
        }
    }

    public AlertController(Context context, ls lsVar, Window window) {
        this.a = context;
        this.b = lsVar;
        this.c = window;
        this.G = new b(lsVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, defpackage.lx.a.f, R.attr.alertDialogStyle, 0);
        this.C = obtainStyledAttributes.getResourceId(0, 0);
        this.J = obtainStyledAttributes.getResourceId(2, 0);
        this.D = obtainStyledAttributes.getResourceId(4, 0);
        this.K = obtainStyledAttributes.getResourceId(5, 0);
        this.L = obtainStyledAttributes.getResourceId(7, 0);
        this.E = obtainStyledAttributes.getResourceId(3, 0);
        this.F = obtainStyledAttributes.getBoolean(6, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        lsVar.a().c(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    static void a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    public static void a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final void a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.G.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.q = charSequence;
            this.r = message;
            this.s = null;
        } else if (i == -2) {
            this.m = charSequence;
            this.n = message;
            this.o = null;
        } else if (i == -1) {
            this.i = charSequence;
            this.j = message;
            this.k = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public final void a(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

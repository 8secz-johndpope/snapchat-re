package com.snap.lenses.camera.debug;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.abpg;
import defpackage.absj;
import defpackage.ajdp;
import defpackage.ajfc;
import defpackage.ajfu;
import defpackage.ajpy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.cfl;
import defpackage.lxs;
import defpackage.lxs.b;
import defpackage.lxs.b.c;
import defpackage.lxs.b.d;
import defpackage.lxy;

public final class DefaultStudioLensDebugView extends FrameLayout implements lxs {
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private ImageButton f;
    private RelativeLayout g;
    private RelativeLayout h;
    private final ajxe i;

    static final class a extends akcs implements akbk<ajdp<defpackage.lxs.a>> {
        final /* synthetic */ DefaultStudioLensDebugView a;

        /* renamed from: com.snap.lenses.camera.debug.DefaultStudioLensDebugView$a$1 */
        static final class AnonymousClass1<T, R> implements ajfc<T, R> {
            private /* synthetic */ a a;

            AnonymousClass1(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b(obj, "it");
                return Boolean.valueOf(DefaultStudioLensDebugView.a(this.a.a).isSelected());
            }
        }

        a(DefaultStudioLensDebugView defaultStudioLensDebugView) {
            this.a = defaultStudioLensDebugView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object j = cfl.c(DefaultStudioLensDebugView.a(this.a)).p(new AnonymousClass1(this)).p(AnonymousClass2.a).j(ajfu.a);
            akcr.a(j, "clicks(debugInfoButton)\n…  .distinctUntilChanged()");
            j = j.a(defpackage.lxs.a.class);
            akcr.a(j, "cast(R::class.java)");
            return ajpy.k(j.h(defpackage.lxs.a.a.a.a)).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultStudioLensDebugView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultStudioLensDebugView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultStudioLensDebugView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.i = ajxh.a(new a(this));
    }

    public static final /* synthetic */ ImageButton a(DefaultStudioLensDebugView defaultStudioLensDebugView) {
        ImageButton imageButton = defaultStudioLensDebugView.f;
        if (imageButton == null) {
            akcr.a("debugInfoButton");
        }
        return imageButton;
    }

    public final ajdp<defpackage.lxs.a> a() {
        return (ajdp) this.i.b();
    }

    public final /* synthetic */ void accept(Object obj) {
        b bVar = (b) obj;
        akcr.b(bVar, "viewModel");
        String str = "lensLastUpdatedDate";
        String str2 = "lensLastUpdatedTime";
        String str3 = "lensSize";
        String str4 = "lensMemory";
        String str5 = "cameraAverageFps";
        String str6 = "debugInfoButton";
        String str7 = "root";
        RelativeLayout relativeLayout;
        ImageButton imageButton;
        if (bVar instanceof defpackage.lxs.b.a) {
            setVisibility(8);
            relativeLayout = this.g;
            if (relativeLayout == null) {
                akcr.a(str7);
            }
            relativeLayout.setBackground(null);
            imageButton = this.f;
            if (imageButton == null) {
                akcr.a(str6);
            }
            imageButton.setSelected(false);
            TextView textView = this.a;
            if (textView == null) {
                akcr.a(str5);
            }
            textView.setText(null);
            textView = this.b;
            if (textView == null) {
                akcr.a(str4);
            }
            textView.setText(null);
            textView = this.c;
            if (textView == null) {
                akcr.a(str3);
            }
            textView.setText(null);
            textView = this.d;
            if (textView == null) {
                akcr.a(str2);
            }
            textView.setText(null);
            textView = this.e;
            if (textView == null) {
                akcr.a(str);
            }
            textView.setText(null);
            return;
        }
        String str8 = "debugInfoContainer";
        TextView textView2;
        if (bVar instanceof c) {
            setVisibility(0);
            relativeLayout = this.g;
            if (relativeLayout == null) {
                akcr.a(str7);
            }
            relativeLayout.setBackground(null);
            imageButton = this.f;
            if (imageButton == null) {
                akcr.a(str6);
            }
            imageButton.setSelected(false);
            relativeLayout = this.h;
            if (relativeLayout == null) {
                akcr.a(str8);
            }
            relativeLayout.setVisibility(8);
        } else if (bVar instanceof d) {
            setVisibility(0);
            RelativeLayout relativeLayout2 = this.g;
            if (relativeLayout2 == null) {
                akcr.a(str7);
            }
            relativeLayout2.setBackgroundResource(R.drawable.lenses_studio_debug_view_background);
            ImageButton imageButton2 = this.f;
            if (imageButton2 == null) {
                akcr.a(str6);
            }
            imageButton2.setSelected(true);
            relativeLayout2 = this.h;
            if (relativeLayout2 == null) {
                akcr.a(str8);
            }
            relativeLayout2.setVisibility(0);
            textView2 = this.b;
            if (textView2 == null) {
                akcr.a(str4);
            }
            d dVar = (d) bVar;
            textView2.setText(abpg.a((double) dVar.a));
            textView2 = this.c;
            if (textView2 == null) {
                akcr.a(str3);
            }
            textView2.setText(abpg.a((double) dVar.b));
            textView2 = this.d;
            if (textView2 == null) {
                akcr.a(str2);
            }
            str4 = "";
            textView2.setText(dVar.c > 0 ? lxy.a.a(dVar.c) : str4);
            textView2 = this.e;
            if (textView2 == null) {
                akcr.a(str);
            }
            textView2.setText(dVar.c > 0 ? lxy.b.a(dVar.c) : str4);
        } else {
            if (bVar instanceof b.b) {
                textView2 = this.a;
                if (textView2 == null) {
                    akcr.a(str5);
                }
                textView2.setText(String.valueOf(Math.round(((b.b) bVar).e)));
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int paddingLeft = getPaddingLeft();
        Object a = absj.a();
        akcr.a(a, "StatusBarUtils.getInstance()");
        setPadding(paddingLeft, a.c(), getPaddingRight(), getPaddingBottom());
        Object findViewById = findViewById(R.id.camera_average_fps_value);
        akcr.a(findViewById, "findViewById(R.id.camera_average_fps_value)");
        this.a = (TextView) findViewById;
        findViewById = findViewById(R.id.studio_lens_memory_value);
        akcr.a(findViewById, "findViewById(R.id.studio_lens_memory_value)");
        this.b = (TextView) findViewById;
        findViewById = findViewById(R.id.studio_lens_size_value);
        akcr.a(findViewById, "findViewById(R.id.studio_lens_size_value)");
        this.c = (TextView) findViewById;
        findViewById = findViewById(R.id.studio_lens_last_updated_time);
        akcr.a(findViewById, "findViewById(R.id.studio_lens_last_updated_time)");
        this.d = (TextView) findViewById;
        findViewById = findViewById(R.id.studio_lens_last_updated_date);
        akcr.a(findViewById, "findViewById(R.id.studio_lens_last_updated_date)");
        this.e = (TextView) findViewById;
        findViewById = findViewById(R.id.studio_lens_debug_info_button);
        akcr.a(findViewById, "findViewById(R.id.studio_lens_debug_info_button)");
        this.f = (ImageButton) findViewById;
        findViewById = findViewById(R.id.studio_lens_debug_root);
        akcr.a(findViewById, "findViewById(R.id.studio_lens_debug_root)");
        this.g = (RelativeLayout) findViewById;
        findViewById = findViewById(R.id.studio_lens_debug_info_container);
        akcr.a(findViewById, "findViewById(R.id.studio…ens_debug_info_container)");
        this.h = (RelativeLayout) findViewById;
        setVisibility(8);
    }
}

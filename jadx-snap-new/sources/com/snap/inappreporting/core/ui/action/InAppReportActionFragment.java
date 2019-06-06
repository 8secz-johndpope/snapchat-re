package com.snap.inappreporting.core.ui.action;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.TextView;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.SnapLinkTextViewUtils;
import com.snapchat.android.R;
import defpackage.aipn;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajwy;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.fww;
import defpackage.fwy;
import defpackage.kke;
import defpackage.kkj;
import defpackage.kob;
import defpackage.zgb;
import defpackage.zjq;
import defpackage.zkq;

public final class InAppReportActionFragment extends MainPageFragment implements zjq {
    public aipn<zkq> a;
    public zgb b;
    public aipn<kob> c;
    public ajwy<fwy> d;
    public aipn<kkj> e;
    private TextView f;
    private TextView g;
    private final CountDownTimer h = new d(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ InAppReportActionFragment a;

        c(InAppReportActionFragment inAppReportActionFragment) {
            this.a = inAppReportActionFragment;
        }

        public final void onClick(View view) {
            aipn aipn = this.a.e;
            if (aipn == null) {
                akcr.a("inAppReportingStore");
            }
            ((kkj) aipn.get()).a();
            aipn = this.a.c;
            if (aipn == null) {
                akcr.a("inAppReportUiNavigator");
            }
            ((kob) aipn.get()).d();
        }
    }

    public static final class d extends CountDownTimer {
        private /* synthetic */ InAppReportActionFragment a;

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 5, insn: 0x0000: IPUT  (r5 com.snap.inappreporting.core.ui.action.InAppReportActionFragment), (r4 com.snap.inappreporting.core.ui.action.InAppReportActionFragment$d) com.snap.inappreporting.core.ui.action.InAppReportActionFragment.d.a com.snap.inappreporting.core.ui.action.InAppReportActionFragment, block:B:0:0x0000, method: com.snap.inappreporting.core.ui.action.InAppReportActionFragment.d.<init>(com.snap.inappreporting.core.ui.action.InAppReportActionFragment):void
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:162)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:133)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        d(long r4) {
            /*
            r3 = this;
            r4.a = r5;
            r0 = 11000; // 0x2af8 float:1.5414E-41 double:5.4347E-320;
            r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r4.<init>(r0, r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.inappreporting.core.ui.action.InAppReportActionFragment$d.<init>(com.snap.inappreporting.core.ui.action.InAppReportActionFragment):void");
        }

        public final void onFinish() {
            this.a.a().setEnabled(true);
            this.a.a().setText(R.string.in_app_report_understand_clickable);
            this.a.a().setBackgroundColor(Color.parseColor("#9043BE"));
        }

        public final void onTick(long j) {
            this.a.a().setText(String.valueOf(j / 1000));
        }
    }

    static final class b<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a;
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, rect.top, marginLayoutParams.rightMargin, rect.bottom);
                view.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    static {
        a aVar = new a();
    }

    public final long S_() {
        return -1;
    }

    public final TextView a() {
        TextView textView = this.g;
        if (textView == null) {
            akcr.a("understandButton");
        }
        return textView;
    }

    public final boolean o_() {
        ajwy ajwy = this.d;
        if (ajwy == null) {
            akcr.a("logoutHelper");
        }
        ((fwy) ajwy.get()).a(fww.IN_APP_REPORT_ENFORCEMENT, true);
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_in_app_report_action, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        this.h.cancel();
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(3);
            }
        }
        this.h.start();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        aipn aipn = this.a;
        if (aipn == null) {
            akcr.a("insetsDetector");
        }
        Object obj = aipn.get();
        akcr.a(obj, "insetsDetector.get()");
        ajdp a = ((zkq) obj).a();
        if (this.b == null) {
            akcr.a("schedulersProvider");
        }
        ScopedFragment.a((ScopedFragment) this, a.b((ajdw) zgb.a(kke.h, "InAppReportActionFragment").l()).f((ajfb) new b(view)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        View findViewById = view.findViewById(R.id.report_message_text);
        String str = "null cannot be cast to non-null type android.widget.TextView";
        if (findViewById != null) {
            this.f = (TextView) findViewById;
            findViewById = view.findViewById(R.id.report_understand_button);
            if (findViewById != null) {
                this.g = (TextView) findViewById;
                TextView textView = this.f;
                str = "reportTextView";
                if (textView == null) {
                    akcr.a(str);
                }
                SnapLinkTextViewUtils.setCustomLinkTextView(textView, ContextCompat.getColor(view.getContext(), R.color.dark_blue), null);
                Bundle arguments = getArguments();
                if (arguments != null) {
                    String string = arguments.getString("report_message", "");
                    textView = this.f;
                    if (textView == null) {
                        akcr.a(str);
                    }
                    textView.setText(Html.fromHtml(string));
                }
                TextView textView2 = this.g;
                String str2 = "understandButton";
                if (textView2 == null) {
                    akcr.a(str2);
                }
                textView2.setEnabled(false);
                textView2 = this.g;
                if (textView2 == null) {
                    akcr.a(str2);
                }
                textView2.setOnClickListener(new c(this));
                return;
            }
            throw new ajxt(str);
        }
        throw new ajxt(str);
    }
}

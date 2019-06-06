package com.snap.inappreporting.core.ui.webview;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.ScHeaderView;
import com.snapchat.android.R;
import defpackage.aipn;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.kke;
import defpackage.kmy;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zhh;
import defpackage.zjq;
import defpackage.zkq;

public final class InAppReportWebViewFragment extends MainPageFragment implements zjq {
    public aipn<zkq> a;
    public aipn<zhh> b;
    public aipn<zgb> c;
    public aipn<kmy> d;
    public View e;
    private zfw f;
    private WebView g;
    private ScHeaderView h;
    private View i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ InAppReportWebViewFragment a;

        b(InAppReportWebViewFragment inAppReportWebViewFragment) {
            this.a = inAppReportWebViewFragment;
        }

        public final void onClick(View view) {
            akcr.b(view, "<anonymous parameter 0>");
            aipn aipn = this.a.d;
            if (aipn == null) {
                akcr.a("inAppReportUiController");
            }
            ((kmy) aipn.get()).d();
        }
    }

    public static final class c extends WebChromeClient {
        private /* synthetic */ InAppReportWebViewFragment a;

        c(InAppReportWebViewFragment inAppReportWebViewFragment) {
            this.a = inAppReportWebViewFragment;
        }

        public final void onProgressChanged(WebView webView, int i) {
            View view = this.a.e;
            if (view == null) {
                akcr.a("progressBar");
            }
            view.setVisibility(i < 100 ? 0 : 4);
        }
    }

    static final class d<T> implements ajfb<Integer> {
        private /* synthetic */ View a;

        d(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            View view = this.a;
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = this.a.getPaddingTop();
            int paddingRight = this.a.getPaddingRight();
            akcr.a(obj, "height");
            view.setPadding(paddingLeft, paddingTop, paddingRight, obj.intValue());
        }
    }

    static final class e<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        e(View view) {
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

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_in_app_report_web_view, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        View view = this.i;
        if (view == null) {
            akcr.a("dismissButton");
        }
        view.setOnClickListener(null);
    }

    public final void onResume() {
        super.onResume();
        View view = this.i;
        if (view == null) {
            akcr.a("dismissButton");
        }
        view.setOnClickListener(new b(this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.in_app_report_webview_header);
        akcr.a(findViewById, "view.findViewById(R.id.i…pp_report_webview_header)");
        this.h = (ScHeaderView) findViewById;
        findViewById = view.findViewById(R.id.in_app_report_webview_progress_bar);
        akcr.a(findViewById, "view.findViewById(R.id.i…ort_webview_progress_bar)");
        this.e = findViewById;
        findViewById = view.findViewById(R.id.in_app_report_webview_x_button);
        akcr.a(findViewById, "view.findViewById(R.id.i…_report_webview_x_button)");
        this.i = findViewById;
        findViewById = view.findViewById(R.id.in_app_report_webview_webview);
        akcr.a(findViewById, "view.findViewById(R.id.i…p_report_webview_webview)");
        this.g = (WebView) findViewById;
        aipn aipn = this.c;
        if (aipn == null) {
            akcr.a("schedulersProvider");
        }
        aipn.get();
        this.f = zgb.a(kke.h, "InAppReportWebViewFragment");
        aipn = this.b;
        if (aipn == null) {
            akcr.a("softKeyboardDetector");
        }
        findViewById = aipn.get();
        akcr.a(findViewById, "softKeyboardDetector.get()");
        ajdp a = ((zhh) findViewById).a();
        zfw zfw = this.f;
        String str = "schedulers";
        if (zfw == null) {
            akcr.a(str);
        }
        ajej f = a.b((ajdw) zfw.l()).f((ajfb) new d(view));
        ScopedFragment scopedFragment = this;
        ScopedFragment.a((ScopedFragment) this, f, scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        aipn = this.a;
        if (aipn == null) {
            akcr.a("insetsDetector");
        }
        findViewById = aipn.get();
        akcr.a(findViewById, "insetsDetector.get()");
        a = ((zkq) findViewById).a();
        zfw zfw2 = this.f;
        if (zfw2 == null) {
            akcr.a(str);
        }
        ScopedFragment.a((ScopedFragment) this, a.b((ajdw) zfw2.l()).f((ajfb) new e(view)), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("headerTitleResId", R.string.fragment_title_in_app_report);
            ScHeaderView scHeaderView = this.h;
            if (scHeaderView == null) {
                akcr.a("headerView");
            }
            scHeaderView.setTitleText(i);
        }
        WebView webView = this.g;
        String str2 = "webView";
        if (webView == null) {
            akcr.a(str2);
        }
        Object settings = webView.getSettings();
        akcr.a(settings, "webSettings");
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setPluginState(PluginState.OFF);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        webView = this.g;
        if (webView == null) {
            akcr.a(str2);
        }
        webView.setWebViewClient(new WebViewClient());
        webView = this.g;
        if (webView == null) {
            akcr.a(str2);
        }
        webView.setWebChromeClient(new c(this));
        arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("webViewUri", "");
            WebView webView2 = this.g;
            if (webView2 == null) {
                akcr.a(str2);
            }
            webView2.loadUrl(string);
        }
    }
}

package com.snap.shake2report.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.snap.ui.view.ScHeaderView;
import com.snapchat.android.R;
import defpackage.aipp;
import defpackage.aipq;
import defpackage.aipr;
import defpackage.aipy;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajev;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akfh;
import defpackage.akgc;
import defpackage.fv;
import defpackage.gvr;
import defpackage.iig;
import defpackage.wqv;
import defpackage.wtq;
import defpackage.wvg;
import defpackage.zgb;
import net.sqlcipher.database.SQLiteDatabase;

public final class CrashViewerActivity extends FragmentActivity implements aipy {
    public aipr<fv> i;
    public wtq j;
    public zgb k;
    public String l;
    String m;
    private TextView n;

    static final class e implements OnLongClickListener {
        private /* synthetic */ CrashViewerActivity a;

        e(CrashViewerActivity crashViewerActivity) {
            this.a = crashViewerActivity;
        }

        public final boolean onLongClick(View view) {
            CrashViewerActivity crashViewerActivity = this.a;
            Object systemService = crashViewerActivity.getSystemService("clipboard");
            if (systemService != null) {
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                CharSequence charSequence = "stacktrace";
                String str = crashViewerActivity.l;
                if (str == null) {
                    akcr.a("crashTrace");
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence, str));
                Toast.makeText(crashViewerActivity.getApplicationContext(), "Copied to clipboard.", 0).show();
                return true;
            }
            throw new ajxt("null cannot be cast to non-null type android.content.ClipboardManager");
        }
    }

    static final class b implements ajev {
        private /* synthetic */ CrashViewerActivity a;
        private /* synthetic */ defpackage.akdd.e b;

        b(CrashViewerActivity crashViewerActivity, defpackage.akdd.e eVar) {
            this.a = crashViewerActivity;
            this.b = eVar;
        }

        public final void run() {
            wtq wtq = this.a.j;
            if (wtq == null) {
                akcr.a("shake2ReportFileManager");
            }
            wtq.a((String) this.b.a, true, this.a);
        }
    }

    static final class a extends akcs implements akbl<String, String> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            StringBuilder stringBuilder;
            String str = (String) obj;
            akcr.b(str, "it");
            if (akgc.a((CharSequence) str, (CharSequence) "Caused by", true)) {
                stringBuilder = new StringBuilder("<b>");
                stringBuilder.append(str);
                stringBuilder.append("</b>");
                str = stringBuilder.toString();
            }
            String str2 = "</font>";
            if (akgc.a((CharSequence) str, (CharSequence) "com.snap", true)) {
                stringBuilder = new StringBuilder("<font color='black'>");
                stringBuilder.append(str);
                stringBuilder.append(str2);
                str = stringBuilder.toString();
            }
            if (!akgc.a((CharSequence) str, (CharSequence) "StrictMode", false)) {
                return str;
            }
            stringBuilder = new StringBuilder("<font color='red'>");
            stringBuilder.append(str);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        }
    }

    static final class c extends akcq implements akbl<View, ajxw> {
        c(CrashViewerActivity crashViewerActivity) {
            super(1, crashViewerActivity);
        }

        public final String getName() {
            return "onClickSendEmail";
        }

        public final akej getOwner() {
            return akde.a(CrashViewerActivity.class);
        }

        public final String getSignature() {
            return "onClickSendEmail(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "p1");
            CrashViewerActivity crashViewerActivity = (CrashViewerActivity) this.receiver;
            Intent intent = new Intent(crashViewerActivity.getIntent());
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.setComponent(null);
            intent.setPackage(null);
            crashViewerActivity.startActivity(intent);
            return ajxw.a;
        }
    }

    static final class d extends akcq implements akbl<View, ajxw> {
        d(CrashViewerActivity crashViewerActivity) {
            super(1, crashViewerActivity);
        }

        public final String getName() {
            return "onClickS2R";
        }

        public final akej getOwner() {
            return akde.a(CrashViewerActivity.class);
        }

        public final String getSignature() {
            return "onClickS2R(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "p1");
            CrashViewerActivity crashViewerActivity = (CrashViewerActivity) this.receiver;
            defpackage.akdd.e eVar = new defpackage.akdd.e();
            Object uuid = iig.a().toString();
            akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
            eVar.a = uuid;
            if (crashViewerActivity.k == null) {
                akcr.a("schedulersProvider");
            }
            ajcx.a((ajev) new b(crashViewerActivity, eVar)).b((ajdw) zgb.a(wqv.g, "CrashViewerActivity").f()).e();
            Intent intent = new Intent();
            intent.setClass(crashViewerActivity, Shake2ReportActivity.class);
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            String str = crashViewerActivity.l;
            if (str == null) {
                akcr.a("crashTrace");
            }
            intent.putExtra("stacktrace", str);
            intent.putExtra("shakeId", (String) eVar.a);
            CharSequence charSequence = crashViewerActivity.m;
            Object obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            if (obj2 == null) {
                intent.putExtra("crashLabel", crashViewerActivity.m);
            }
            crashViewerActivity.startActivity(intent);
            return ajxw.a;
        }
    }

    public final aipq<fv> c() {
        aipr aipr = this.i;
        if (aipr == null) {
            akcr.a("fragmentDispatchingInjector");
        }
        return aipr;
    }

    public final void onCreate(Bundle bundle) {
        gvr.a.incrementAndGet();
        super.onCreate(bundle);
        aipp.a((Activity) this);
        setContentView(R.layout.s2r_crash_viewer);
        Object stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
        akcr.a(stringExtra, "intent.getStringExtra(Intent.EXTRA_TEXT)");
        this.l = stringExtra;
        this.m = getIntent().getStringExtra("crashLabel");
        stringExtra = findViewById(R.id.crash_text);
        akcr.a(stringExtra, "findViewById(R.id.crash_text)");
        this.n = (TextView) stringExtra;
        ((ScHeaderView) findViewById(R.id.crash_header)).setTitleText("⛈ Crash Report");
        CrashViewerActivity crashViewerActivity = this;
        findViewById(R.id.send).setOnClickListener(new wvg(new c(crashViewerActivity)));
        findViewById(R.id.s2r).setOnClickListener(new wvg(new d(crashViewerActivity)));
        TextView textView = this.n;
        String str = "crashTextView";
        if (textView == null) {
            akcr.a(str);
        }
        textView.setOnLongClickListener(new e(this));
        textView = this.n;
        if (textView == null) {
            akcr.a(str);
        }
        str = this.l;
        if (str == null) {
            akcr.a("crashTrace");
        }
        Object fromHtml = Html.fromHtml(akfh.a(akfh.c(akgc.f(str), a.a), (CharSequence) "<br/>", null, null, 0, null, null, 62));
        akcr.a(fromHtml, "Html.fromHtml(\n         …String(\"<br/>\")\n        )");
        textView.setText((CharSequence) fromHtml);
    }

    public final void onDestroy() {
        super.onDestroy();
        gvr.a.decrementAndGet();
    }
}

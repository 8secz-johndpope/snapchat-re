package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* renamed from: fy */
public abstract class fy<E> extends fw {
    final Activity a;
    public final Context b;
    final Handler c;
    public final ga d;
    private int e;

    private fy(Activity activity, Context context, Handler handler) {
        this.d = new ga();
        this.a = activity;
        this.b = context;
        this.c = handler;
        this.e = 0;
    }

    protected fy(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.c);
    }

    public View a(int i) {
        return null;
    }

    public void a(fv fvVar, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.b.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void a(fv fvVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            fq.a(this.a, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    public void a(fv fvVar, String[] strArr, int i) {
    }

    public void a(String str, PrintWriter printWriter, String[] strArr) {
    }

    public boolean a() {
        return true;
    }

    public boolean a(String str) {
        return false;
    }

    public boolean b() {
        return true;
    }

    public LayoutInflater c() {
        return LayoutInflater.from(this.b);
    }

    public void d() {
    }

    public boolean e() {
        return true;
    }

    public int f() {
        return 0;
    }

    public abstract E g();
}

package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import defpackage.afd;
import defpackage.afo;
import defpackage.afp;
import defpackage.fv;
import defpackage.yh;
import defpackage.yn;
import java.util.HashSet;
import java.util.Set;

public class SupportRequestManagerFragment extends fv {
    public final afd a;
    public final afp b;
    public yn c;
    public fv d;
    private final Set<SupportRequestManagerFragment> e;
    private SupportRequestManagerFragment f;

    class a implements afp {
        a() {
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("{fragment=");
            stringBuilder.append(SupportRequestManagerFragment.this);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public SupportRequestManagerFragment() {
        this(new afd());
    }

    @SuppressLint({"ValidFragment"})
    private SupportRequestManagerFragment(afd afd) {
        this.b = new a();
        this.e = new HashSet();
        this.a = afd;
    }

    private void a() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.a(this);
            this.f = null;
        }
    }

    private void a(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.e.remove(supportRequestManagerFragment);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            Activity activity = getActivity();
            a();
            this.f = yh.a((Context) activity).e.a(activity.b(), afo.a(activity));
            if (!equals(this.f)) {
                this.f.e.add(this);
            }
        } catch (IllegalStateException e) {
            String str = "SupportRMFragment";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        a();
    }

    public void onDetach() {
        super.onDetach();
        this.d = null;
        a();
    }

    public void onStart() {
        super.onStart();
        this.a.a();
    }

    public void onStop() {
        super.onStop();
        this.a.b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{parent=");
        Object parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.d;
        }
        stringBuilder.append(parentFragment);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

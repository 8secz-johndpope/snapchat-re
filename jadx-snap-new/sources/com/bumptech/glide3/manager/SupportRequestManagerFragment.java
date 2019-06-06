package com.bumptech.glide3.manager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import defpackage.aib;
import defpackage.anp;
import defpackage.anz;
import defpackage.aoa;
import defpackage.fv;
import java.util.HashSet;

public class SupportRequestManagerFragment extends fv {
    public aib a;
    public final anp b;
    public final aoa c;
    private final HashSet<SupportRequestManagerFragment> d;
    private SupportRequestManagerFragment e;

    class a implements aoa {
        private a() {
        }

        /* synthetic */ a(SupportRequestManagerFragment supportRequestManagerFragment, byte b) {
            this();
        }
    }

    public SupportRequestManagerFragment() {
        this(new anp());
    }

    @SuppressLint({"ValidFragment"})
    private SupportRequestManagerFragment(anp anp) {
        this.c = new a(this, (byte) 0);
        this.d = new HashSet();
        this.b = anp;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.e = anz.a.a(getActivity().b());
            if (this.e != this) {
                this.e.d.add(this);
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
        this.b.c();
    }

    public void onDetach() {
        super.onDetach();
        SupportRequestManagerFragment supportRequestManagerFragment = this.e;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.d.remove(this);
            this.e = null;
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        aib aib = this.a;
        if (aib != null) {
            aib.d.a();
        }
    }

    public void onStart() {
        super.onStart();
        this.b.a();
    }

    public void onStop() {
        super.onStop();
        this.b.b();
    }
}

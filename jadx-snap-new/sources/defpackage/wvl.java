package defpackage;

import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wvl */
public final class wvl {
    public String a;
    public ailz b = ailz.PROBLEM;
    public aily c;
    public int d = R.string.s2r_report_problem_title;
    public boolean e;
    public boolean f;
    public Integer g;
    public List<String> h;
    public List<wvm> i = new ArrayList();
    public String j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public String o;
    public wqr p;
    private String q;

    public final void a(String str, ailz ailz, aily aily, boolean z) {
        akcr.b(str, "reportId");
        akcr.b(ailz, "reportType");
        akcr.b(aily, "reportSource");
        this.a = str;
        this.b = ailz;
        this.c = aily;
        this.e = z;
        this.g = null;
        this.h = null;
        this.i = new ArrayList();
        this.j = null;
        this.q = null;
        this.k = null;
        this.l = null;
        this.n = false;
        this.o = null;
    }

    public final void a(List<wvm> list) {
        akcr.b(list, "<set-?>");
        this.i = list;
    }
}

package defpackage;

import com.snap.framework.developer.BuildConfigInfo;
import defpackage.mix.a;

/* renamed from: miu */
public final class miu {
    private final b a;
    private BuildConfigInfo b;
    private miw c;

    /* renamed from: miu$b */
    public interface b {
    }

    /* renamed from: miu$a */
    public static abstract class a {

        /* renamed from: miu$a$a */
        interface a {
            a a(BuildConfigInfo buildConfigInfo);

            a a(b bVar);

            a a(miw miw);

            a a();
        }

        public abstract hww a();

        public abstract wnh b();

        public abstract hxn c();

        public abstract miw d();
    }

    public miu(b bVar) {
        this.a = bVar;
    }

    public final a a() {
        a a = new a().a(this.a);
        BuildConfigInfo buildConfigInfo = this.b;
        if (buildConfigInfo == null) {
            buildConfigInfo = new BuildConfigInfo();
        }
        return a.a(buildConfigInfo).a(this.c).a();
    }

    public final miu a(BuildConfigInfo buildConfigInfo) {
        this.b = buildConfigInfo;
        return this;
    }

    public final miu a(miw miw) {
        this.c = miw;
        return this;
    }
}

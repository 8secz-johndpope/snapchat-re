package defpackage;

import java.util.List;

/* renamed from: wkm */
public interface wkm {

    /* renamed from: wkm$a */
    public interface a {
        a a();

        a a(ajdx<List<abyi>> ajdx);

        a a(dnq dnq);

        a a(dpv dpv);

        a a(ebp ebp);

        a a(gtt gtt);

        a a(String str);

        a a(rgq rgq);

        a a(rhl rhl);

        a a(tob tob);

        a a(tod tod);

        a a(wjx wjx);

        a a(b bVar);

        a b(ajdx<List<abyi>> ajdx);

        wkm b();
    }

    /* renamed from: wkm$b */
    public enum b {
        STACKED_CAMERA_AND_EDIT_AND_SEND_TO(ajym.b((Object[]) new zjm[]{dnh.c, toc.a, rgr.b})),
        EDIT_AND_SEND_TO(ajym.b((Object[]) new zjm[]{toc.a, rgr.b})),
        SEND_TO(ajyl.a(rgr.b)),
        DIRECT_SEND(ajyw.a);
        
        final List<zjm> steps;

        private b(List<zjm> list) {
            akcr.b(list, "steps");
            this.steps = list;
        }
    }
}

package defpackage;

import android.content.Context;
import com.snap.messaging.api.reply.InputBarControllerFragment;

/* renamed from: pqn */
public interface pqn {

    /* renamed from: pqn$a */
    public static final class a {
        public static /* synthetic */ acig a(pqn pqn, pqh pqh, pqf pqf, abbd abbd, int i) {
            if ((i & 2) != 0) {
                pqf = null;
            }
            if ((i & 4) != 0) {
                abbd = null;
            }
            return pqn.a(pqh, pqf, abbd);
        }
    }

    acig<zjm, zjk> a(pqh pqh, pqf pqf, abbd abbd);

    ajcx a(String str, zfw zfw, abbd abbd);

    InputBarControllerFragment a(long j, String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, zjm zjm, pva pva);

    psi a(Context context, puz puz);

    void a(long j, abbd abbd);

    ajcx b(long j, abbd abbd);

    ajcx b(String str, zfw zfw, abbd abbd);

    ajdx<pqh> c(long j, abbd abbd);
}

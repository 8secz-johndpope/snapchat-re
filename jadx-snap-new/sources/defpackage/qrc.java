package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.snap.messaging.createchat.dagger.CreateChatFragment;
import com.snapchat.android.R;

/* renamed from: qrc */
public final class qrc implements qxk {
    final achb<zjm, zjk> a;
    private final ipt b;

    /* renamed from: qrc$a */
    static final class a implements OnClickListener {
        private /* synthetic */ qrc a;

        a(qrc qrc) {
            this.a = qrc;
        }

        public final void onClick(View view) {
            achb achb = this.a.a;
            achd zjf = new zjf(pql.g, new CreateChatFragment());
            acgu acgu = pql.h;
            akcr.a((Object) acgu, "ChatFeature.CREATE_CHAT_PRESENT_DEFAULT");
            achb.a(zjf, acgu, null);
        }
    }

    public qrc(achb<zjm, zjk> achb, ipt ipt) {
        akcr.b(achb, "navigationHost");
        akcr.b(ipt, "hovaController");
        this.a = achb;
        this.b = ipt;
    }

    public final void a() {
        View a = this.b.a(R.id.feed_new_chat, qxo.a);
        if (a != null) {
            a.setOnClickListener(new a(this));
        }
    }
}

package defpackage;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import defpackage.yif.a;
import java.util.Collection;
import java.util.List;

/* renamed from: yid */
public interface yid {

    /* renamed from: yid$a */
    public static final class a {
    }

    ajcx a();

    ajcx a(ylg ylg);

    ajdx<Long> a(afbi afbi, MessageClientStatus messageClientStatus);

    ajdx<List<ymn>> a(List<String> list);

    Long a(DbTransaction dbTransaction, aenb aenb, String str, StoryKind storyKind, String str2, MessageClientStatus messageClientStatus);

    Collection<String> a(StoryKind storyKind);

    void a(aecy aecy, DbTransaction dbTransaction);

    void a(afeq afeq, DbTransaction dbTransaction);

    void a(DbTransaction dbTransaction, StoryKind storyKind, String str);

    void a(DbTransaction dbTransaction, StoryKind storyKind, String str, String str2, String str3, String str4);

    void a(DbTransaction dbTransaction, String str, StoryKind storyKind, String str2, List<? extends aeug> list, boolean z, Long l);

    ajej b();

    ajdx<a> c();

    ajdp<Boolean> d();
}

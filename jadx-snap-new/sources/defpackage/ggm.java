package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.rzg.a;
import java.util.Collections;
import java.util.Set;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: ggm */
public abstract class ggm implements fts {

    /* renamed from: ggm$b */
    public static final class b extends ParcelFileDescriptor {
        private /* synthetic */ gej a;
        private /* synthetic */ ParcelFileDescriptor b;

        b(gej gej, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
            this.a = gej;
            this.b = parcelFileDescriptor;
            super(parcelFileDescriptor2);
        }

        public final void close() {
            try {
                super.close();
            } finally {
                this.a.close();
            }
        }
    }

    /* renamed from: ggm$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ ggm a;

        a(ggm ggm) {
            this.a = ggm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "contentResult");
            return new AssetFileDescriptor(ggm.a(gej), 0, -1);
        }
    }

    static ParcelFileDescriptor a(gej gej) {
        try {
            Object obj = gej.c().get(0);
            akcr.a(obj, "contentResult.assets[0]");
            obj = ((gdt) obj).c();
            akcr.a(obj, "contentResult.assets[0].file");
            obj = ParcelFileDescriptor.open(obj, SQLiteDatabase.CREATE_IF_NECESSARY);
            akcr.a(obj, "descriptor");
            return new b(gej, obj, obj);
        } catch (RuntimeException e) {
            gej.close();
            throw e;
        }
    }

    public final ajdx<AssetFileDescriptor> a(Uri uri, CancellationSignal cancellationSignal, rzg rzg) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(cancellationSignal, "cancellationSignal");
        akcr.b(rzg, "uiPage");
        Set a = a.a(rzg);
        Object emptySet = Collections.emptySet();
        akcr.a(emptySet, "emptySet()");
        Object f = a(uri, a, false, emptySet).a(3).f(new a(this));
        akcr.a(f, "resolve(uri, SchedulingC…LENGTH)\n                }");
        return f;
    }

    public ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2, ajdx<gej> ajdx) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        akcr.b(ajdx, "contentResultFrom");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" doesn't support importContent yet");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public Set<gdy> b(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return ajyy.a;
    }
}

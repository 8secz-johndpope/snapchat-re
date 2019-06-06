package defpackage;

import android.net.Uri;
import com.brightcove.player.event.EventType;

/* renamed from: uen */
public final class uen implements oep {
    private final ajdx<iha> a;

    /* renamed from: uen$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ abzg a;

        a(abzg abzg) {
            this.a = abzg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            iha iha = (iha) obj;
            akcr.b(iha, "it");
            obj = iha.b(this.a);
            akcr.a(obj, "it.toJsonString(caption)");
            akcr.b(obj, "captionJson");
            return defpackage.gfr.a.b().buildUpon().appendPath("caption_view_bitmap").appendQueryParameter("caption_metadata_json", obj).build();
        }
    }

    public uen(ajdx<iha> ajdx) {
        akcr.b(ajdx, "serializationHelper");
        this.a = ajdx;
    }

    public final ajdx<Uri> a(abzg abzg) {
        akcr.b(abzg, EventType.CAPTION);
        Object f = this.a.f(new a(abzg));
        akcr.a(f, "serializationHelper.map …g(caption))\n            }");
        return f;
    }
}

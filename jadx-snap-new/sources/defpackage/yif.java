package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.StorySyncStateModel.UpdateValue;
import com.snap.core.db.record.StorySyncStateRecord;

/* renamed from: yif */
public final class yif {
    public final DbClient a;
    public final ainx b;
    public final ajxe c = ajxh.a(new c(this));

    /* renamed from: yif$b */
    public static final class b extends akcs implements akbl<Cursor, a> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            obj = StorySyncStateRecord.GET_VALUE_MAPPER.map(cursor);
            akcr.a(obj, "StorySyncStateRecord.GET_VALUE_MAPPER.map(cursor)");
            StorySyncStateRecord storySyncStateRecord = (StorySyncStateRecord) obj;
            String checksum = storySyncStateRecord.checksum();
            String str = "";
            if (checksum == null) {
                checksum = str;
            }
            String metadata = storySyncStateRecord.metadata();
            if (metadata == null) {
                metadata = str;
            }
            return new a(checksum, metadata);
        }
    }

    /* renamed from: yif$c */
    static final class c extends akcs implements akbk<UpdateValue> {
        private /* synthetic */ yif a;

        c(yif yif) {
            this.a = yif;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateValue(this.a.a.getWritableDatabase());
        }
    }

    /* renamed from: yif$a */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            akcr.b(str, "checksum");
            akcr.b(str2, "syncMetadata");
            this.a = str;
            this.b = str2;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(yif.class), "updateStorySyncState", "getUpdateStorySyncState()Lcom/snap/core/db/record/StorySyncStateModel$UpdateValue;");
    }

    public yif(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.a = snapDb.getDbClient((ide) yhy.j);
        Object obj = StorySyncStateRecord.FACTORY;
        akcr.a(obj, "StorySyncStateRecord.FACTORY");
        obj = obj.getRecord();
        akcr.a(obj, "StorySyncStateRecord.FACTORY.record");
        this.b = obj;
    }
}

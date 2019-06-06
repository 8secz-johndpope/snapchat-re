package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.MediaStore.Images.Media;
import defpackage.epy.a;

/* renamed from: eqk */
public final class eqk extends epy<eps> {
    public eqk(ContentResolver contentResolver, ifs ifs) {
        akcr.b(contentResolver, "resolver");
        akcr.b(ifs, "permissionHelper");
        eqv equ = new equ();
        a aVar = a.IMAGE;
        Object obj = Media.EXTERNAL_CONTENT_URI;
        akcr.a(obj, "MediaStore.Images.Media.EXTERNAL_CONTENT_URI");
        super(contentResolver, ifs, equ, aVar, obj, eql.a, "\n    CASE WHEN datetaken  == 0\n    THEN date_added\n    ELSE datetaken END DESC\n    ");
    }

    public final /* synthetic */ eqf a(Cursor cursor) {
        akcr.b(cursor, "cursor");
        return new eqh(cursor);
    }
}

package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Thumbnails;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

@ftr(a = "camera_roll_thumb")
/* renamed from: fuf */
public final class fuf extends ggm {
    private final String[] a = new String[]{ohk.d};
    private final ContentResolver b;
    private final fug c;
    private final gel d;

    public fuf(ContentResolver contentResolver, fug fug, gel gel) {
        akcr.b(contentResolver, "contentResolver");
        akcr.b(fug, "cameraRollUriHandler");
        akcr.b(gel, "contentResultFactory");
        this.b = contentResolver;
        this.c = fug;
        this.d = gel;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x005c in {4, 7, 9, 15, 17} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final defpackage.ajdx<defpackage.gej> a(android.database.Cursor r5, android.net.Uri r6) {
        /*
        r4 = this;
        r0 = r5;
        r0 = (java.io.Closeable) r0;
        r1 = 0;
        r2 = r0;	 Catch:{ Throwable -> 0x0055 }
        r2 = (android.database.Cursor) r2;	 Catch:{ Throwable -> 0x0055 }
        r5 = r5.getCount();	 Catch:{ Throwable -> 0x0055 }
        if (r5 <= 0) goto L_0x002c;	 Catch:{ Throwable -> 0x0055 }
        r5 = 0;	 Catch:{ Throwable -> 0x0055 }
        r2.moveToPosition(r5);	 Catch:{ Throwable -> 0x0055 }
        r6 = r4.d;	 Catch:{ Throwable -> 0x0055 }
        r3 = new java.io.File;	 Catch:{ Throwable -> 0x0055 }
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x0055 }
        r3.<init>(r5);	 Catch:{ Throwable -> 0x0055 }
        r5 = "camera_roll_thumb";	 Catch:{ Throwable -> 0x0055 }
        r5 = r6.a(r3, r5);	 Catch:{ Throwable -> 0x0055 }
        r5 = defpackage.ajdx.b(r5);	 Catch:{ Throwable -> 0x0055 }
        r6 = "Single.just(contentResul…ERA_ROLL_THUMBNAIL_PATH))";	 Catch:{ Throwable -> 0x0055 }
        defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x0055 }
        goto L_0x004f;	 Catch:{ Throwable -> 0x0055 }
        r5 = new java.io.FileNotFoundException;	 Catch:{ Throwable -> 0x0055 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0055 }
        r2.<init>();	 Catch:{ Throwable -> 0x0055 }
        r2.append(r6);	 Catch:{ Throwable -> 0x0055 }
        r6 = " not found";	 Catch:{ Throwable -> 0x0055 }
        r2.append(r6);	 Catch:{ Throwable -> 0x0055 }
        r6 = r2.toString();	 Catch:{ Throwable -> 0x0055 }
        r5.<init>(r6);	 Catch:{ Throwable -> 0x0055 }
        r5 = (java.lang.Throwable) r5;	 Catch:{ Throwable -> 0x0055 }
        r5 = defpackage.ghx.a.a(r5, r1);	 Catch:{ Throwable -> 0x0055 }
        r5 = defpackage.ajdx.b(r5);	 Catch:{ Throwable -> 0x0055 }
        r6 = "Single.just(FailedConten…ption(\"$uri not found\")))";	 Catch:{ Throwable -> 0x0055 }
        goto L_0x0028;
        defpackage.akax.a(r0, r1);
        return r5;
        r5 = move-exception;
        goto L_0x0058;
        r5 = move-exception;
        r1 = r5;
        throw r1;	 Catch:{ all -> 0x0053 }
        defpackage.akax.a(r0, r1);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuf.a(android.database.Cursor, android.net.Uri):ajdx");
    }

    private final Cursor a(long j) {
        Object query = this.b.query(Thumbnails.EXTERNAL_CONTENT_URI, this.a, "video_id=?", new String[]{String.valueOf(j)}, null);
        akcr.a(query, "contentResolver.query(Me…)),\n                null)");
        return query;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object parse = Uri.parse(uri.getQueryParameter(str));
        akcr.a(parse, "cameraRollUri");
        Object path = parse.getPath();
        akcr.a(path, "cameraRollUri.path");
        CharSequence charSequence = (CharSequence) path;
        Object obj = Media.EXTERNAL_CONTENT_URI;
        akcr.a(obj, "MediaStore.Images.Media.EXTERNAL_CONTENT_URI");
        obj = obj.getPath();
        akcr.a(obj, "MediaStore.Images.Media.EXTERNAL_CONTENT_URI.path");
        if (akgc.a(charSequence, (CharSequence) obj, false)) {
            return this.c.a(ftt.b(parse), set, z, set2);
        }
        Object lastPathSegment = parse.getLastPathSegment();
        akcr.a(lastPathSegment, "cameraRollUri.lastPathSegment");
        long parseLong = Long.parseLong(lastPathSegment);
        Cursor a = a(parseLong);
        if (a.getCount() != 0) {
            return a(a, uri);
        }
        Thumbnails.getThumbnail(this.b, parseLong, 1, null);
        return a(a(parseLong), uri);
    }
}

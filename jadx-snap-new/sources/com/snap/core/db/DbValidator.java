package com.snap.core.db;

import android.database.MatrixCursor;
import android.database.SQLException;
import com.brightcove.player.media.MediaService;
import com.snap.core.db.api.SqlDelightDbManager;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxj;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.ide;
import defpackage.igb;
import defpackage.zfd;

public final class DbValidator {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(DbValidator.class), "tagQuery", "getTagQuery()Ljava/lang/String;"), new akdc(akde.a(DbValidator.class), "tagQueryFirst", "getTagQueryFirst()Ljava/lang/String;"), new akdc(akde.a(DbValidator.class), "tagQueryAsList", "getTagQueryAsList()Ljava/lang/String;")};
    private final ide attributedFeature;
    private final SqlDelightDbManager dbManager;
    private final AndroidCursor emptyCursor = new AndroidCursor(new MatrixCursor(new String[0]));
    private final MatrixCursor emptySqliteCursor = new MatrixCursor(new String[0]);
    private final String name = this.attributedFeature.getName();
    private final igb noDiskExceptionDetector;
    private final int sessionId;
    private final ajxe tagQuery$delegate = ajxh.a(ajxj.PUBLICATION, new DbValidator$tagQuery$2(this));
    private final ajxe tagQueryAsList$delegate = ajxh.a(ajxj.PUBLICATION, new DbValidator$tagQueryAsList$2(this));
    private final ajxe tagQueryFirst$delegate = ajxh.a(ajxj.PUBLICATION, new DbValidator$tagQueryFirst$2(this));

    public DbValidator(int i, SqlDelightDbManager sqlDelightDbManager, igb igb, ide ide) {
        akcr.b(sqlDelightDbManager, "dbManager");
        akcr.b(igb, "noDiskExceptionDetector");
        akcr.b(ide, "attributedFeature");
        this.sessionId = i;
        this.dbManager = sqlDelightDbManager;
        this.noDiskExceptionDetector = igb;
        this.attributedFeature = ide;
    }

    public final <T> T attempt(String str, akbk<? extends T> akbk, T t) {
        akcr.b(str, "tag");
        akcr.b(akbk, MediaService.COMMAND);
        try {
            if (isValid()) {
                return akbk.invoke();
            }
        } catch (SQLException e) {
            if (isValid()) {
                Throwable th = e;
                if (this.noDiskExceptionDetector.b(th)) {
                    this.noDiskExceptionDetector.a(th);
                    return t;
                }
                throw new zfd(this.attributedFeature.callsite(str), th, null, 12);
            }
        } catch (IllegalStateException e2) {
            if (isValid()) {
                throw new zfd(this.attributedFeature.callsite(str), (Throwable) e2, null, 12);
            }
        }
        return t;
    }

    public final AndroidCursor getEmptyCursor() {
        return this.emptyCursor;
    }

    public final MatrixCursor getEmptySqliteCursor() {
        return this.emptySqliteCursor;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTagQuery() {
        return (String) this.tagQuery$delegate.b();
    }

    public final String getTagQueryAsList() {
        return (String) this.tagQueryAsList$delegate.b();
    }

    public final String getTagQueryFirst() {
        return (String) this.tagQueryFirst$delegate.b();
    }

    public final boolean isValid() {
        return this.sessionId == this.dbManager.getSessionId();
    }

    public final void throwIfNotDbScheduler() {
        this.dbManager.throwIfNotDbScheduler();
    }
}

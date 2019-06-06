package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.GeofilterType;
import defpackage.ahyg.a;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface GeofilterModel {
    @Deprecated
    public static final String AUTOSTACKTYPE = "autoStackType";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Geofilter (\n    filterId INTEGER NOT NULL PRIMARY KEY,\n    filterType INTEGER NOT NULL,\n\n    filterImageUrl TEXT NOT NULL,\n    scaleSetting INTEGER NOT NULL,\n    gravitySetting INTEGER NOT NULL,\n\n    isAnimated INTEGER NOT NULL,\n    isBelowDrawingLayer INTEGER NOT NULL DEFAULT 0,\n\n    autoStackType INTEGER\n)";
    @Deprecated
    public static final String FILTERID = "filterId";
    @Deprecated
    public static final String FILTERIMAGEURL = "filterImageUrl";
    @Deprecated
    public static final String FILTERTYPE = "filterType";
    @Deprecated
    public static final String GRAVITYSETTING = "gravitySetting";
    @Deprecated
    public static final String ISANIMATED = "isAnimated";
    @Deprecated
    public static final String ISBELOWDRAWINGLAYER = "isBelowDrawingLayer";
    @Deprecated
    public static final String SCALESETTING = "scaleSetting";
    @Deprecated
    public static final String TABLE_NAME = "Geofilter";

    public interface Creator<T extends GeofilterModel> {
        T create(long j, GeofilterType geofilterType, String str, long j2, long j3, boolean z, boolean z2, a aVar);
    }

    public static final class Factory<T extends GeofilterModel> {
        public final ainu<a, Long> autoStackTypeAdapter;
        public final Creator<T> creator;
        public final ainu<GeofilterType, Long> filterTypeAdapter;

        public Factory(Creator<T> creator, ainu<GeofilterType, Long> ainu, ainu<a, Long> ainu2) {
            this.creator = creator;
            this.filterTypeAdapter = ainu;
            this.autoStackTypeAdapter = ainu2;
        }

        public final ainx staticGeofilters() {
            return new ainx("SELECT\n  Geofilter.filterId,\n  Geofilter.filterType,\n  Geofilter.filterImageUrl,\n  Geofilter.scaleSetting,\n  Geofilter.gravitySetting,\n  Geofilter.isAnimated,\n  Geofilter.autoStackType,\n  Geofilter.isBelowDrawingLayer\nFROM Geofilter\nWHERE Geofilter.filterType = 0", new aioa(GeofilterModel.TABLE_NAME));
        }

        public final <R extends StaticGeofiltersModel> StaticGeofiltersMapper<R, T> staticGeofiltersMapper(StaticGeofiltersCreator<R> staticGeofiltersCreator) {
            return new StaticGeofiltersMapper(staticGeofiltersCreator, this);
        }
    }

    public interface StaticGeofiltersCreator<T extends StaticGeofiltersModel> {
        T create(long j, GeofilterType geofilterType, String str, long j2, long j3, boolean z, a aVar, boolean z2);
    }

    public interface StaticGeofiltersModel {
        a autoStackType();

        long filterId();

        String filterImageUrl();

        GeofilterType filterType();

        long gravitySetting();

        boolean isAnimated();

        boolean isBelowDrawingLayer();

        long scaleSetting();
    }

    public static final class Mapper<T extends GeofilterModel> implements ainw<T> {
        private final Factory<T> geofilterModelFactory;

        public Mapper(Factory<T> factory) {
            this.geofilterModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            Creator creator = this.geofilterModelFactory.creator;
            boolean z = false;
            long j = cursor2.getLong(0);
            GeofilterType geofilterType = (GeofilterType) this.geofilterModelFactory.filterTypeAdapter.decode(Long.valueOf(cursor2.getLong(1)));
            String string = cursor2.getString(2);
            long j2 = cursor2.getLong(3);
            long j3 = cursor2.getLong(4);
            boolean z2 = cursor2.getInt(5) == 1;
            if (cursor2.getInt(6) == 1) {
                z = true;
            }
            return creator.create(j, geofilterType, string, j2, j3, z2, z, cursor2.isNull(7) ? null : (a) this.geofilterModelFactory.autoStackTypeAdapter.decode(Long.valueOf(cursor2.getLong(7))));
        }
    }

    public static final class StaticGeofiltersMapper<T extends StaticGeofiltersModel, T1 extends GeofilterModel> implements ainw<T> {
        private final StaticGeofiltersCreator<T> creator;
        private final Factory<T1> geofilterModelFactory;

        public StaticGeofiltersMapper(StaticGeofiltersCreator<T> staticGeofiltersCreator, Factory<T1> factory) {
            this.creator = staticGeofiltersCreator;
            this.geofilterModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), (GeofilterType) this.geofilterModelFactory.filterTypeAdapter.decode(Long.valueOf(cursor2.getLong(1))), cursor2.getString(2), cursor2.getLong(3), cursor2.getLong(4), cursor2.getInt(5) == 1, cursor2.isNull(6) ? null : (a) this.geofilterModelFactory.autoStackTypeAdapter.decode(Long.valueOf(cursor2.getLong(6))), cursor2.getInt(7) == 1);
        }
    }

    public static final class UpsertGeofilter extends ainy {
        private final Factory<? extends GeofilterModel> geofilterModelFactory;

        public UpsertGeofilter(pa paVar, Factory<? extends GeofilterModel> factory) {
            super(GeofilterModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Geofilter (\n    filterId,\n    filterType,\n    filterImageUrl,\n    scaleSetting,\n    gravitySetting,\n    isAnimated,\n    autoStackType)\nVALUES (?, ?, ?, ?, ?, ?, ?)"));
            this.geofilterModelFactory = factory;
        }

        public final void bind(long j, GeofilterType geofilterType, String str, long j2, long j3, boolean z, a aVar) {
            bindLong(1, j);
            bindLong(2, ((Long) this.geofilterModelFactory.filterTypeAdapter.encode(geofilterType)).longValue());
            bindString(3, str);
            bindLong(4, j2);
            bindLong(5, j3);
            bindLong(6, z ? 1 : 0);
            if (aVar == null) {
                bindNull(7);
            } else {
                bindLong(7, ((Long) this.geofilterModelFactory.autoStackTypeAdapter.encode(aVar)).longValue());
            }
        }
    }

    a autoStackType();

    long filterId();

    String filterImageUrl();

    GeofilterType filterType();

    long gravitySetting();

    boolean isAnimated();

    boolean isBelowDrawingLayer();

    long scaleSetting();
}

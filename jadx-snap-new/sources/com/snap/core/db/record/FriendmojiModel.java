package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FriendmojiType;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface FriendmojiModel {
    public static final String ADDPICKERDESCRIPTION = "ALTER TABLE Friendmoji\nADD pickerDescription TEXT";
    @Deprecated
    public static final String CATEGORY = "category";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Friendmoji (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    category TEXT NOT NULL UNIQUE, -- Friendmoji category, e.g \"snap_streak\" or \"number_one_bf\"\n    emoji TEXT, -- Emoji used for this friendmoji category.\n    rank INTEGER, -- Priority of friendmoji for ordering. Lower number is higher priority.\n    title TEXT, -- Title for displaying what this friendmoji is.\n    description TEXT, -- Description of what this friendmoji means.\n    pickerDescription TEXT, -- Description to show at emoji picker screen\n    friendmojiType INTEGER\n)";
    @Deprecated
    public static final String DESCRIPTION = "description";
    @Deprecated
    public static final String EMOJI = "emoji";
    @Deprecated
    public static final String FRIENDMOJITYPE = "friendmojiType";
    @Deprecated
    public static final String PICKERDESCRIPTION = "pickerDescription";
    @Deprecated
    public static final String RANK = "rank";
    @Deprecated
    public static final String TABLE_NAME = "Friendmoji";
    @Deprecated
    public static final String TITLE = "title";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends FriendmojiModel> {
        T create(long j, String str, String str2, Long l, String str3, String str4, String str5, FriendmojiType friendmojiType);
    }

    public interface GetFriendmojiForCategoryCreator<T extends GetFriendmojiForCategoryModel> {
        T create(String str, Long l, FriendmojiType friendmojiType, String str2, String str3);
    }

    public interface GetFriendmojiForTypeCreator<T extends GetFriendmojiForTypeModel> {
        T create(String str, String str2, Long l, String str3, String str4, String str5);
    }

    public interface GetFriendmojiDictCreator<T extends GetFriendmojiDictModel> {
        T create(String str, String str2, String str3);
    }

    public static final class Factory<T extends FriendmojiModel> {
        public final Creator<T> creator;
        public final ainu<FriendmojiType, Long> friendmojiTypeAdapter;

        final class GetFriendmojiForCategoryQuery extends ainx {
            private final String category;

            GetFriendmojiForCategoryQuery(String str) {
                super("SELECT\n    Friendmoji.emoji,\n    Friendmoji.rank,\n    Friendmoji.friendmojiType,\n    Friendmoji.title,\n    Friendmoji.description\nFROM Friendmoji\nWHERE Friendmoji.category=?1", new aioa(FriendmojiModel.TABLE_NAME));
                this.category = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.category);
            }
        }

        final class GetFriendmojiForTypeQuery extends ainx {
            private final FriendmojiType friendmojiType;

            GetFriendmojiForTypeQuery(FriendmojiType friendmojiType) {
                super("SELECT\n    Friendmoji.category,\n    Friendmoji.emoji,\n    Friendmoji.rank,\n    Friendmoji.title,\n    Friendmoji.description,\n    Friendmoji.pickerDescription\nFROM Friendmoji\nWHERE Friendmoji.friendmojiType=?1", new aioa(FriendmojiModel.TABLE_NAME));
                this.friendmojiType = friendmojiType;
            }

            public final void bindTo(pc pcVar) {
                FriendmojiType friendmojiType = this.friendmojiType;
                if (friendmojiType != null) {
                    pcVar.bindLong(1, ((Long) Factory.this.friendmojiTypeAdapter.encode(friendmojiType)).longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        public Factory(Creator<T> creator, ainu<FriendmojiType, Long> ainu) {
            this.creator = creator;
            this.friendmojiTypeAdapter = ainu;
        }

        public final ainx getFriendmojiDict() {
            return new ainx("SELECT\n    Friendmoji.emoji,\n    Friendmoji.category,\n    Friendmoji.title\nFROM Friendmoji", new aioa(FriendmojiModel.TABLE_NAME));
        }

        public final <R extends GetFriendmojiDictModel> GetFriendmojiDictMapper<R> getFriendmojiDictMapper(GetFriendmojiDictCreator<R> getFriendmojiDictCreator) {
            return new GetFriendmojiDictMapper(getFriendmojiDictCreator);
        }

        public final ainx getFriendmojiForCategory(String str) {
            return new GetFriendmojiForCategoryQuery(str);
        }

        public final <R extends GetFriendmojiForCategoryModel> GetFriendmojiForCategoryMapper<R, T> getFriendmojiForCategoryMapper(GetFriendmojiForCategoryCreator<R> getFriendmojiForCategoryCreator) {
            return new GetFriendmojiForCategoryMapper(getFriendmojiForCategoryCreator, this);
        }

        public final ainx getFriendmojiForCategoryWithoutOfficialStories() {
            return new ainx("SELECT\n    Friendmoji.emoji,\n    Friendmoji.category,\n    Friendmoji.title\nFROM Friendmoji\nWHERE Friendmoji.category NOT LIKE 'official_story%'", new aioa(FriendmojiModel.TABLE_NAME));
        }

        public final <R extends GetFriendmojiForCategoryWithoutOfficialStoriesModel> GetFriendmojiForCategoryWithoutOfficialStoriesMapper<R> getFriendmojiForCategoryWithoutOfficialStoriesMapper(GetFriendmojiForCategoryWithoutOfficialStoriesCreator<R> getFriendmojiForCategoryWithoutOfficialStoriesCreator) {
            return new GetFriendmojiForCategoryWithoutOfficialStoriesMapper(getFriendmojiForCategoryWithoutOfficialStoriesCreator);
        }

        public final ainx getFriendmojiForType(FriendmojiType friendmojiType) {
            return new GetFriendmojiForTypeQuery(friendmojiType);
        }

        public final <R extends GetFriendmojiForTypeModel> GetFriendmojiForTypeMapper<R> getFriendmojiForTypeMapper(GetFriendmojiForTypeCreator<R> getFriendmojiForTypeCreator) {
            return new GetFriendmojiForTypeMapper(getFriendmojiForTypeCreator);
        }
    }

    public static final class GetFriendmojiForCategoryMapper<T extends GetFriendmojiForCategoryModel, T1 extends FriendmojiModel> implements ainw<T> {
        private final GetFriendmojiForCategoryCreator<T> creator;
        private final Factory<T1> friendmojiModelFactory;

        public GetFriendmojiForCategoryMapper(GetFriendmojiForCategoryCreator<T> getFriendmojiForCategoryCreator, Factory<T1> factory) {
            this.creator = getFriendmojiForCategoryCreator;
            this.friendmojiModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : cursor.getString(0), cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1)), cursor.isNull(2) ? null : (FriendmojiType) this.friendmojiModelFactory.friendmojiTypeAdapter.decode(Long.valueOf(cursor.getLong(2))), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4));
        }
    }

    public static final class GetFriendmojiForTypeMapper<T extends GetFriendmojiForTypeModel> implements ainw<T> {
        private final GetFriendmojiForTypeCreator<T> creator;

        public GetFriendmojiForTypeMapper(GetFriendmojiForTypeCreator<T> getFriendmojiForTypeCreator) {
            this.creator = getFriendmojiForTypeCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5));
        }
    }

    public static final class GetFriendmojiDictMapper<T extends GetFriendmojiDictModel> implements ainw<T> {
        private final GetFriendmojiDictCreator<T> creator;

        public GetFriendmojiDictMapper(GetFriendmojiDictCreator<T> getFriendmojiDictCreator) {
            this.creator = getFriendmojiDictCreator;
        }

        public final T map(Cursor cursor) {
            GetFriendmojiDictCreator getFriendmojiDictCreator = this.creator;
            String str = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            String string2 = cursor.getString(1);
            if (!cursor.isNull(2)) {
                str = cursor.getString(2);
            }
            return getFriendmojiDictCreator.create(string, string2, str);
        }
    }

    public static final class InsertFriendmoji extends ainy {
        private final Factory<? extends FriendmojiModel> friendmojiModelFactory;

        public InsertFriendmoji(pa paVar, Factory<? extends FriendmojiModel> factory) {
            super(FriendmojiModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Friendmoji(\n    category,\n    emoji,\n    rank,\n    title,\n    description,\n    pickerDescription,\n    friendmojiType)\nVALUES(?, ?, ?, ?, ?, ?, ?)"));
            this.friendmojiModelFactory = factory;
        }

        public final void bind(String str, String str2, Long l, String str3, String str4, String str5, FriendmojiType friendmojiType) {
            bindString(1, str);
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            if (str3 == null) {
                bindNull(4);
            } else {
                bindString(4, str3);
            }
            if (str4 == null) {
                bindNull(5);
            } else {
                bindString(5, str4);
            }
            if (str5 == null) {
                bindNull(6);
            } else {
                bindString(6, str5);
            }
            if (friendmojiType == null) {
                bindNull(7);
            } else {
                bindLong(7, ((Long) this.friendmojiModelFactory.friendmojiTypeAdapter.encode(friendmojiType)).longValue());
            }
        }
    }

    public interface GetFriendmojiDictModel {
        String category();

        String emoji();

        String title();
    }

    public interface GetFriendmojiForCategoryModel {
        String description();

        String emoji();

        FriendmojiType friendmojiType();

        Long rank();

        String title();
    }

    public interface GetFriendmojiForCategoryWithoutOfficialStoriesCreator<T extends GetFriendmojiForCategoryWithoutOfficialStoriesModel> {
        T create(String str, String str2, String str3);
    }

    public interface GetFriendmojiForCategoryWithoutOfficialStoriesModel {
        String category();

        String emoji();

        String title();
    }

    public interface GetFriendmojiForTypeModel {
        String category();

        String description();

        String emoji();

        String pickerDescription();

        Long rank();

        String title();
    }

    public static final class GetFriendmojiForCategoryWithoutOfficialStoriesMapper<T extends GetFriendmojiForCategoryWithoutOfficialStoriesModel> implements ainw<T> {
        private final GetFriendmojiForCategoryWithoutOfficialStoriesCreator<T> creator;

        public GetFriendmojiForCategoryWithoutOfficialStoriesMapper(GetFriendmojiForCategoryWithoutOfficialStoriesCreator<T> getFriendmojiForCategoryWithoutOfficialStoriesCreator) {
            this.creator = getFriendmojiForCategoryWithoutOfficialStoriesCreator;
        }

        public final T map(Cursor cursor) {
            GetFriendmojiForCategoryWithoutOfficialStoriesCreator getFriendmojiForCategoryWithoutOfficialStoriesCreator = this.creator;
            String str = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            String string2 = cursor.getString(1);
            if (!cursor.isNull(2)) {
                str = cursor.getString(2);
            }
            return getFriendmojiForCategoryWithoutOfficialStoriesCreator.create(string, string2, str);
        }
    }

    public static final class Mapper<T extends FriendmojiModel> implements ainw<T> {
        private final Factory<T> friendmojiModelFactory;

        public Mapper(Factory<T> factory) {
            this.friendmojiModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.friendmojiModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5), cursor.isNull(6) ? null : cursor.getString(6), cursor.isNull(7) ? null : (FriendmojiType) this.friendmojiModelFactory.friendmojiTypeAdapter.decode(Long.valueOf(cursor.getLong(7))));
        }
    }

    long _id();

    String category();

    String description();

    String emoji();

    FriendmojiType friendmojiType();

    String pickerDescription();

    Long rank();

    String title();
}

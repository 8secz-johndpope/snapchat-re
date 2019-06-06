package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.FriendmojiType;
import com.snap.core.db.record.FriendmojiModel.Factory;
import com.snap.core.db.record.FriendmojiModel.GetFriendmojiDictModel;
import com.snap.core.db.record.FriendmojiModel.GetFriendmojiForCategoryModel;
import com.snap.core.db.record.FriendmojiModel.GetFriendmojiForTypeModel;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class FriendmojiRecord implements FriendmojiModel {
    public static final Factory<FriendmojiRecord> FACTORY;
    public static final ainw<FriendmojiDict> FRIENDMOJI_CATEGORIES_DICT_ROW_MAPPER = FACTORY.getFriendmojiDictMapper(-$$Lambda$xkt3vI2XnIxmsavpw-3lI5bpUtw.INSTANCE);
    public static final ainw<FriendmojiForCategory> FRIENDMOJI_FOR_CATEGORY_ROW_MAPPER;
    public static final ainw<FriendmojiForType> FRIENDMOJI_FOR_TYPE_ROW_MAPPER = FACTORY.getFriendmojiForTypeMapper(-$$Lambda$LaSlLMx7VEgblM8bYqzlLcwa4Zk.INSTANCE);
    private static final ainu<FriendmojiType, Long> FRIENDMOJI_TYPE_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(FriendmojiType.class);

    @AutoValue
    public static abstract class FriendmojiDict implements GetFriendmojiDictModel {
    }

    @AutoValue
    public static abstract class FriendmojiForCategory implements GetFriendmojiForCategoryModel {
    }

    @AutoValue
    public static abstract class FriendmojiForType implements GetFriendmojiForTypeModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$34YtlyhBKU5YHECV5NQ1-cCycZc.INSTANCE, FRIENDMOJI_TYPE_COLUMN_ADAPTER);
        FACTORY = factory;
        FRIENDMOJI_FOR_CATEGORY_ROW_MAPPER = factory.getFriendmojiForCategoryMapper(-$$Lambda$3QjFP0Dlpl9Wa2vaVUf2AtQq6UQ.INSTANCE);
    }
}

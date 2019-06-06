package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.record.ContactModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;

public interface ContactsNotOnSnapchatModel {

    public static final class Factory {
        public final ainx selectContactsNotOnSnapchat() {
            return new ainx("SELECT\n    _id,\n    displayName,\n    phone\nFROM Contact\nWHERE isSnapchatter = 0\nORDER BY Contact.displayName COLLATE NOCASE", new aioa(ContactModel.TABLE_NAME));
        }

        public final <R extends SelectContactsNotOnSnapchatModel> SelectContactsNotOnSnapchatMapper<R> selectContactsNotOnSnapchatMapper(SelectContactsNotOnSnapchatCreator<R> selectContactsNotOnSnapchatCreator) {
            return new SelectContactsNotOnSnapchatMapper(selectContactsNotOnSnapchatCreator);
        }
    }

    public interface SelectContactsNotOnSnapchatCreator<T extends SelectContactsNotOnSnapchatModel> {
        T create(long j, String str, String str2);
    }

    public interface SelectContactsNotOnSnapchatModel {
        long _id();

        String displayName();

        String phone();
    }

    public static final class SelectContactsNotOnSnapchatMapper<T extends SelectContactsNotOnSnapchatModel> implements ainw<T> {
        private final SelectContactsNotOnSnapchatCreator<T> creator;

        public SelectContactsNotOnSnapchatMapper(SelectContactsNotOnSnapchatCreator<T> selectContactsNotOnSnapchatCreator) {
            this.creator = selectContactsNotOnSnapchatCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.getString(2));
        }
    }
}

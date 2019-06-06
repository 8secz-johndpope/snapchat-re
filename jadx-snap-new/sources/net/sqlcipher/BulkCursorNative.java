package net.sqlcipher;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import net.sqlcipher.IContentObserver.Stub;

public abstract class BulkCursorNative extends Binder implements IBulkCursor {
    public BulkCursorNative() {
        attachInterface(this, IBulkCursor.descriptor);
    }

    public static IBulkCursor asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IBulkCursor iBulkCursor = (IBulkCursor) iBinder.queryLocalInterface(IBulkCursor.descriptor);
        return iBulkCursor != null ? iBulkCursor : new BulkCursorProxy(iBinder);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        String str = IBulkCursor.descriptor;
        boolean updateRows;
        Bundle extras;
        switch (i) {
            case 1:
                parcel.enforceInterface(str);
                CursorWindow window = getWindow(parcel.readInt());
                if (window == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeInt(1);
                window.writeToParcel(parcel2, 0);
                return true;
            case 2:
                parcel.enforceInterface(str);
                i = count();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            case 3:
                parcel.enforceInterface(str);
                String[] columnNames = getColumnNames();
                parcel2.writeNoException();
                parcel2.writeInt(columnNames.length);
                int length = columnNames.length;
                while (i3 < length) {
                    parcel2.writeString(columnNames[i3]);
                    i3++;
                }
                return true;
            case 4:
                parcel.enforceInterface(str);
                updateRows = updateRows(parcel.readHashMap(null));
                parcel2.writeNoException();
                if (updateRows) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 5:
                parcel.enforceInterface(str);
                updateRows = deleteRow(parcel.readInt());
                parcel2.writeNoException();
                if (updateRows) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 6:
                parcel.enforceInterface(str);
                deactivate();
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface(str);
                i = requery(Stub.asInterface(parcel.readStrongBinder()), (CursorWindow) CursorWindow.CREATOR.createFromParcel(parcel));
                parcel2.writeNoException();
                parcel2.writeInt(i);
                parcel2.writeBundle(getExtras());
                return true;
            case 8:
                parcel.enforceInterface(str);
                onMove(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface(str);
                updateRows = getWantsAllOnMoveCalls();
                parcel2.writeNoException();
                if (updateRows) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 10:
                parcel.enforceInterface(str);
                extras = getExtras();
                parcel2.writeNoException();
                parcel2.writeBundle(extras);
                return true;
            case 11:
                parcel.enforceInterface(str);
                extras = respond(parcel.readBundle(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeBundle(extras);
                return true;
            case 12:
                try {
                    parcel.enforceInterface(str);
                    close();
                    parcel2.writeNoException();
                    return true;
                } catch (Exception e) {
                    DatabaseUtils.writeExceptionToParcel(parcel2, e);
                    return true;
                }
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}

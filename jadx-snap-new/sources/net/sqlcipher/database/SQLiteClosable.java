package net.sqlcipher.database;

public abstract class SQLiteClosable {
    private Object mLock = new Object();
    private int mReferenceCount = 1;

    private String getObjInfo() {
        String path;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" (");
        if (this instanceof SQLiteDatabase) {
            stringBuilder.append("database = ");
            path = ((SQLiteDatabase) this).getPath();
        } else {
            if ((this instanceof SQLiteProgram) || (this instanceof SQLiteStatement) || (this instanceof SQLiteQuery)) {
                stringBuilder.append("mSql = ");
                path = ((SQLiteProgram) this).mSql;
            }
            stringBuilder.append(") ");
            return stringBuilder.toString();
        }
        stringBuilder.append(path);
        stringBuilder.append(") ");
        return stringBuilder.toString();
    }

    public void acquireReference() {
        synchronized (this.mLock) {
            if (this.mReferenceCount > 0) {
                this.mReferenceCount++;
            } else {
                StringBuilder stringBuilder = new StringBuilder("attempt to re-open an already-closed object: ");
                stringBuilder.append(getObjInfo());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public abstract void onAllReferencesReleased();

    /* Access modifiers changed, original: protected */
    public void onAllReferencesReleasedFromContainer() {
    }

    public void releaseReference() {
        synchronized (this.mLock) {
            this.mReferenceCount--;
            if (this.mReferenceCount == 0) {
                onAllReferencesReleased();
            }
        }
    }

    public void releaseReferenceFromContainer() {
        synchronized (this.mLock) {
            this.mReferenceCount--;
            if (this.mReferenceCount == 0) {
                onAllReferencesReleasedFromContainer();
            }
        }
    }
}

package net.sqlcipher;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class MatrixCursor extends AbstractCursor {
    private final int columnCount;
    private final String[] columnNames;
    private Object[] data;
    private int rowCount;

    public class RowBuilder {
        private final int endIndex;
        private int index;

        RowBuilder(int i, int i2) {
            this.index = i;
            this.endIndex = i2;
        }

        public RowBuilder add(Object obj) {
            if (this.index != this.endIndex) {
                Object[] access$000 = MatrixCursor.this.data;
                int i = this.index;
                this.index = i + 1;
                access$000[i] = obj;
                return this;
            }
            throw new CursorIndexOutOfBoundsException("No more columns left.");
        }
    }

    public MatrixCursor(String[] strArr) {
        this(strArr, 16);
    }

    public MatrixCursor(String[] strArr, int i) {
        this.rowCount = 0;
        this.columnNames = strArr;
        this.columnCount = strArr.length;
        if (i <= 0) {
            i = 1;
        }
        this.data = new Object[(this.columnCount * i)];
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:8:0x003d in {4, 5, 7} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void addRow(java.util.ArrayList<?> r6, int r7) {
        /*
        r5 = this;
        r0 = r6.size();
        r1 = r5.columnCount;
        if (r0 != r1) goto L_0x001f;
        r1 = r5.rowCount;
        r1 = r1 + 1;
        r5.rowCount = r1;
        r1 = r5.data;
        r2 = 0;
        if (r2 >= r0) goto L_0x001e;
        r3 = r7 + r2;
        r4 = r6.get(r2);
        r1[r3] = r4;
        r2 = r2 + 1;
        goto L_0x0011;
        return;
        r6 = new java.lang.IllegalArgumentException;
        r7 = new java.lang.StringBuilder;
        r1 = "columnNames.length = ";
        r7.<init>(r1);
        r1 = r5.columnCount;
        r7.append(r1);
        r1 = ", columnValues.size() = ";
        r7.append(r1);
        r7.append(r0);
        r7 = r7.toString();
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.MatrixCursor.addRow(java.util.ArrayList, int):void");
    }

    private void ensureCapacity(int i) {
        Object[] objArr = this.data;
        if (i > objArr.length) {
            int length = objArr.length << 1;
            if (length >= i) {
                i = length;
            }
            this.data = new Object[i];
            System.arraycopy(objArr, 0, this.data, 0, objArr.length);
        }
    }

    private Object get(int i) {
        if (i < 0 || i >= this.columnCount) {
            StringBuilder stringBuilder = new StringBuilder("Requested column: ");
            stringBuilder.append(i);
            stringBuilder.append(", # of columns: ");
            stringBuilder.append(this.columnCount);
            throw new CursorIndexOutOfBoundsException(stringBuilder.toString());
        } else if (this.mPos < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        } else if (this.mPos < this.rowCount) {
            return this.data[(this.mPos * this.columnCount) + i];
        } else {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0044 in {3, 9, 11, 14, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public void addRow(java.lang.Iterable<?> r6) {
        /*
        r5 = this;
        r0 = r5.rowCount;
        r1 = r5.columnCount;
        r0 = r0 * r1;
        r1 = r1 + r0;
        r5.ensureCapacity(r1);
        r2 = r6 instanceof java.util.ArrayList;
        if (r2 == 0) goto L_0x0013;
        r6 = (java.util.ArrayList) r6;
        r5.addRow(r6, r0);
        return;
        r2 = r5.data;
        r6 = r6.iterator();
        r3 = r6.hasNext();
        if (r3 == 0) goto L_0x0033;
        r3 = r6.next();
        if (r0 == r1) goto L_0x002b;
        r4 = r0 + 1;
        r2[r0] = r3;
        r0 = r4;
        goto L_0x0019;
        r6 = new java.lang.IllegalArgumentException;
        r0 = "columnValues.size() > columnNames.length";
        r6.<init>(r0);
        throw r6;
        if (r0 != r1) goto L_0x003c;
        r6 = r5.rowCount;
        r6 = r6 + 1;
        r5.rowCount = r6;
        return;
        r6 = new java.lang.IllegalArgumentException;
        r0 = "columnValues.size() < columnNames.length";
        r6.<init>(r0);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.MatrixCursor.addRow(java.lang.Iterable):void");
    }

    public void addRow(Object[] objArr) {
        int length = objArr.length;
        int i = this.columnCount;
        if (length == i) {
            length = this.rowCount;
            this.rowCount = length + 1;
            length *= i;
            ensureCapacity(i + length);
            System.arraycopy(objArr, 0, this.data, length, this.columnCount);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("columnNames.length = ");
        stringBuilder.append(this.columnCount);
        stringBuilder.append(", columnValues.length = ");
        stringBuilder.append(objArr.length);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String[] getColumnNames() {
        return this.columnNames;
    }

    public int getCount() {
        return this.rowCount;
    }

    public double getDouble(int i) {
        Object obj = get(i);
        return obj == null ? 0.0d : obj instanceof Number ? ((Number) obj).doubleValue() : Double.parseDouble(obj.toString());
    }

    public float getFloat(int i) {
        Object obj = get(i);
        return obj == null ? MapboxConstants.MINIMUM_ZOOM : obj instanceof Number ? ((Number) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int getInt(int i) {
        Object obj = get(i);
        return obj == null ? 0 : obj instanceof Number ? ((Number) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public long getLong(int i) {
        Object obj = get(i);
        return obj == null ? 0 : obj instanceof Number ? ((Number) obj).longValue() : Long.parseLong(obj.toString());
    }

    public short getShort(int i) {
        Object obj = get(i);
        return obj == null ? (short) 0 : obj instanceof Number ? ((Number) obj).shortValue() : Short.parseShort(obj.toString());
    }

    public String getString(int i) {
        Object obj = get(i);
        return obj == null ? null : obj.toString();
    }

    public int getType(int i) {
        return DatabaseUtils.getTypeOfObject(get(i));
    }

    public boolean isNull(int i) {
        return get(i) == null;
    }

    public RowBuilder newRow() {
        this.rowCount++;
        int i = this.rowCount * this.columnCount;
        ensureCapacity(i);
        return new RowBuilder(i - this.columnCount, i);
    }
}

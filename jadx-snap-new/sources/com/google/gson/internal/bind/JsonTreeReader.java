package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

public final class JsonTreeReader extends JsonReader {
    private static final Object SENTINEL_CLOSED = new Object();
    private static final Reader UNREADABLE_READER = new Reader() {
        public final void close() {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private int[] pathIndices = new int[32];
    private String[] pathNames = new String[32];
    private Object[] stack = new Object[32];
    private int stackSize = 0;

    public JsonTreeReader(JsonElement jsonElement) {
        super(UNREADABLE_READER);
        push(jsonElement);
    }

    private void expect(JsonToken jsonToken) {
        if (peek() != jsonToken) {
            StringBuilder stringBuilder = new StringBuilder("Expected ");
            stringBuilder.append(jsonToken);
            stringBuilder.append(" but was ");
            stringBuilder.append(peek());
            stringBuilder.append(locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private String locationString() {
        StringBuilder stringBuilder = new StringBuilder(" at path ");
        stringBuilder.append(getPath());
        return stringBuilder.toString();
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i = this.stackSize - 1;
        this.stackSize = i;
        Object obj = objArr[i];
        objArr[this.stackSize] = null;
        return obj;
    }

    private void push(Object obj) {
        int i = this.stackSize;
        Object[] objArr = this.stack;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i << 1)];
            int[] iArr = new int[(i << 1)];
            String[] strArr = new String[(i << 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.pathIndices, 0, iArr, 0, this.stackSize);
            System.arraycopy(this.pathNames, 0, strArr, 0, this.stackSize);
            this.stack = objArr2;
            this.pathIndices = iArr;
            this.pathNames = strArr;
        }
        Object[] objArr3 = this.stack;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        objArr3[i2] = obj;
    }

    public final void beginArray() {
        expect(JsonToken.BEGIN_ARRAY);
        push(((JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    public final void beginObject() {
        expect(JsonToken.BEGIN_OBJECT);
        push(((JsonObject) peekStack()).entrySet().iterator());
    }

    public final void close() {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    public final void endArray() {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final void endObject() {
        expect(JsonToken.END_OBJECT);
        popStack();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final String getPath() {
        StringBuilder stringBuilder = new StringBuilder("$");
        int i = 0;
        while (i < this.stackSize) {
            Object[] objArr = this.stack;
            if (objArr[i] instanceof JsonArray) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    stringBuilder.append('[');
                    stringBuilder.append(this.pathIndices[i]);
                    stringBuilder.append(']');
                }
            } else if (objArr[i] instanceof JsonObject) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    stringBuilder.append('.');
                    String[] strArr = this.pathNames;
                    if (strArr[i] != null) {
                        stringBuilder.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public final boolean hasNext() {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    public final boolean nextBoolean() {
        expect(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) popStack()).getAsBoolean();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            i--;
            iArr[i] = iArr[i] + 1;
        }
        return asBoolean;
    }

    public final double nextDouble() {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
            if (isLenient() || !(Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
                popStack();
                int i = this.stackSize;
                if (i > 0) {
                    int[] iArr = this.pathIndices;
                    i--;
                    iArr[i] = iArr[i] + 1;
                }
                return asDouble;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(asDouble)));
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(JsonToken.NUMBER);
        stringBuilder.append(" but was ");
        stringBuilder.append(peek);
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final int nextInt() {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            int asInt = ((JsonPrimitive) peekStack()).getAsInt();
            popStack();
            int i = this.stackSize;
            if (i > 0) {
                int[] iArr = this.pathIndices;
                i--;
                iArr[i] = iArr[i] + 1;
            }
            return asInt;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(JsonToken.NUMBER);
        stringBuilder.append(" but was ");
        stringBuilder.append(peek);
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final long nextLong() {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            long asLong = ((JsonPrimitive) peekStack()).getAsLong();
            popStack();
            int i = this.stackSize;
            if (i > 0) {
                int[] iArr = this.pathIndices;
                i--;
                iArr[i] = iArr[i] + 1;
            }
            return asLong;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(JsonToken.NUMBER);
        stringBuilder.append(" but was ");
        stringBuilder.append(peek);
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final String nextName() {
        expect(JsonToken.NAME);
        Entry entry = (Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = str;
        push(entry.getValue());
        return str;
    }

    public final void nextNull() {
        expect(JsonToken.NULL);
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final String nextString() {
        JsonToken peek = peek();
        if (peek == JsonToken.STRING || peek == JsonToken.NUMBER) {
            String asString = ((JsonPrimitive) popStack()).getAsString();
            int i = this.stackSize;
            if (i > 0) {
                int[] iArr = this.pathIndices;
                i--;
                iArr[i] = iArr[i] + 1;
            }
            return asString;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(JsonToken.STRING);
        stringBuilder.append(" but was ");
        stringBuilder.append(peek);
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:51:0x0084 in {3, 10, 11, 14, 16, 20, 24, 30, 34, 38, 40, 44, 48, 50} preds:[]
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
    public final com.google.gson.stream.JsonToken peek() {
        /*
        r3 = this;
        r0 = r3.stackSize;
        if (r0 != 0) goto L_0x0007;
        r0 = com.google.gson.stream.JsonToken.END_DOCUMENT;
        return r0;
        r0 = r3.peekStack();
        r1 = r0 instanceof java.util.Iterator;
        if (r1 == 0) goto L_0x0036;
        r1 = r3.stack;
        r2 = r3.stackSize;
        r2 = r2 + -2;
        r1 = r1[r2];
        r1 = r1 instanceof com.google.gson.JsonObject;
        r0 = (java.util.Iterator) r0;
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x002e;
        if (r1 == 0) goto L_0x0026;
        r0 = com.google.gson.stream.JsonToken.NAME;
        return r0;
        r0 = r0.next();
        r3.push(r0);
        goto L_0x0000;
        if (r1 == 0) goto L_0x0033;
        r0 = com.google.gson.stream.JsonToken.END_OBJECT;
        return r0;
        r0 = com.google.gson.stream.JsonToken.END_ARRAY;
        return r0;
        r1 = r0 instanceof com.google.gson.JsonObject;
        if (r1 == 0) goto L_0x003d;
        r0 = com.google.gson.stream.JsonToken.BEGIN_OBJECT;
        return r0;
        r1 = r0 instanceof com.google.gson.JsonArray;
        if (r1 == 0) goto L_0x0044;
        r0 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        return r0;
        r1 = r0 instanceof com.google.gson.JsonPrimitive;
        if (r1 == 0) goto L_0x006b;
        r0 = (com.google.gson.JsonPrimitive) r0;
        r1 = r0.isString();
        if (r1 == 0) goto L_0x0053;
        r0 = com.google.gson.stream.JsonToken.STRING;
        return r0;
        r1 = r0.isBoolean();
        if (r1 == 0) goto L_0x005c;
        r0 = com.google.gson.stream.JsonToken.BOOLEAN;
        return r0;
        r0 = r0.isNumber();
        if (r0 == 0) goto L_0x0065;
        r0 = com.google.gson.stream.JsonToken.NUMBER;
        return r0;
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        r1 = r0 instanceof com.google.gson.JsonNull;
        if (r1 == 0) goto L_0x0072;
        r0 = com.google.gson.stream.JsonToken.NULL;
        return r0;
        r1 = SENTINEL_CLOSED;
        if (r0 != r1) goto L_0x007e;
        r0 = new java.lang.IllegalStateException;
        r1 = "JsonReader is closed";
        r0.<init>(r1);
        throw r0;
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonTreeReader.peek():com.google.gson.stream.JsonToken");
    }

    public final void promoteNameToValue() {
        expect(JsonToken.NAME);
        Entry entry = (Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new JsonPrimitive((String) entry.getKey()));
    }

    public final void skipValue() {
        String str = "null";
        if (peek() == JsonToken.NAME) {
            nextName();
            this.pathNames[this.stackSize - 2] = str;
        } else {
            popStack();
            this.pathNames[this.stackSize - 1] = str;
        }
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}

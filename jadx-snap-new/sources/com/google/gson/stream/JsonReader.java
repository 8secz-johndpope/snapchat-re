package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import org.opencv.imgproc.Imgproc;

public class JsonReader implements Closeable {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final char[] buffer = new char[Imgproc.INTER_TAB_SIZE2];
    private final Reader in;
    private boolean lenient = false;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    private int[] pathIndices;
    private String[] pathNames;
    int peeked = 0;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int pos = 0;
    private int[] stack = new int[32];
    private int stackSize = 0;

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() {
            public final void promoteNameToValue(JsonReader jsonReader) {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int i = jsonReader.peeked;
                if (i == 0) {
                    i = jsonReader.doPeek();
                }
                if (i == 13) {
                    jsonReader.peeked = 9;
                } else if (i == 12) {
                    jsonReader.peeked = 8;
                } else if (i == 14) {
                    jsonReader.peeked = 10;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Expected a name but was ");
                    stringBuilder.append(jsonReader.peek());
                    stringBuilder.append(jsonReader.locationString());
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = this.stack;
        int i = this.stackSize;
        this.stackSize = i + 1;
        iArr[i] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        if (reader != null) {
            this.in = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void checkLenient() {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() {
        nextNonWhitespace(true);
        this.pos--;
        int i = this.pos;
        char[] cArr = NON_EXECUTE_PREFIX;
        if (i + cArr.length <= this.limit || fillBuffer(cArr.length)) {
            i = 0;
            while (true) {
                cArr = NON_EXECUTE_PREFIX;
                if (i >= cArr.length) {
                    this.pos += cArr.length;
                    return;
                } else if (this.buffer[this.pos + i] == cArr[i]) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private boolean fillBuffer(int i) {
        char[] cArr = this.buffer;
        int i2 = this.lineStart;
        int i3 = this.pos;
        this.lineStart = i2 - i3;
        i2 = this.limit;
        if (i2 != i3) {
            this.limit = i2 - i3;
            System.arraycopy(cArr, i3, cArr, 0, this.limit);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.in;
            i3 = this.limit;
            i2 = reader.read(cArr, i3, cArr.length - i3);
            if (i2 == -1) {
                return false;
            }
            this.limit += i2;
            if (this.lineNumber == 0) {
                i2 = this.lineStart;
                if (i2 == 0 && this.limit > 0 && cArr[0] == 65279) {
                    this.pos++;
                    this.lineStart = i2 + 1;
                    i++;
                }
            }
        } while (this.limit < i);
        return true;
    }

    private boolean isLiteral(char c) {
        if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
            if (c != '#') {
                if (c != ',') {
                    if (!(c == '/' || c == '=')) {
                        if (!(c == '{' || c == '}' || c == ':')) {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            checkLenient();
        }
        return false;
    }

    private String locationString() {
        int i = this.lineNumber + 1;
        int i2 = (this.pos - this.lineStart) + 1;
        StringBuilder stringBuilder = new StringBuilder(" at line ");
        stringBuilder.append(i);
        stringBuilder.append(" column ");
        stringBuilder.append(i2);
        stringBuilder.append(" path ");
        stringBuilder.append(getPath());
        return stringBuilder.toString();
    }

    /* JADX WARNING: Missing block: B:23:0x0050, code skipped:
            if (r1 != '/') goto L_0x0093;
     */
    /* JADX WARNING: Missing block: B:24:0x0052, code skipped:
            r7.pos = r4;
     */
    /* JADX WARNING: Missing block: B:25:0x0055, code skipped:
            if (r4 != r2) goto L_0x0068;
     */
    /* JADX WARNING: Missing block: B:26:0x0057, code skipped:
            r7.pos--;
            r2 = fillBuffer(2);
            r7.pos++;
     */
    /* JADX WARNING: Missing block: B:27:0x0065, code skipped:
            if (r2 != false) goto L_0x0068;
     */
    /* JADX WARNING: Missing block: B:28:0x0067, code skipped:
            return r1;
     */
    /* JADX WARNING: Missing block: B:29:0x0068, code skipped:
            checkLenient();
            r2 = r7.pos;
            r3 = r0[r2];
     */
    /* JADX WARNING: Missing block: B:30:0x0071, code skipped:
            if (r3 == '*') goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:31:0x0073, code skipped:
            if (r3 == '/') goto L_0x0076;
     */
    /* JADX WARNING: Missing block: B:32:0x0075, code skipped:
            return r1;
     */
    /* JADX WARNING: Missing block: B:33:0x0076, code skipped:
            r7.pos = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:34:0x007b, code skipped:
            r7.pos = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:35:0x0085, code skipped:
            if (skipTo("*/") == false) goto L_0x008c;
     */
    /* JADX WARNING: Missing block: B:38:0x0092, code skipped:
            throw syntaxError("Unterminated comment");
     */
    /* JADX WARNING: Missing block: B:40:0x0095, code skipped:
            if (r1 != '#') goto L_0x00a1;
     */
    /* JADX WARNING: Missing block: B:41:0x0097, code skipped:
            r7.pos = r4;
            checkLenient();
     */
    /* JADX WARNING: Missing block: B:43:0x00a1, code skipped:
            r7.pos = r4;
     */
    /* JADX WARNING: Missing block: B:44:0x00a3, code skipped:
            return r1;
     */
    private int nextNonWhitespace(boolean r8) {
        /*
        r7 = this;
        r0 = r7.buffer;
    L_0x0002:
        r1 = r7.pos;
    L_0x0004:
        r2 = r7.limit;
    L_0x0006:
        r3 = 1;
        if (r1 != r2) goto L_0x0032;
    L_0x0009:
        r7.pos = r1;
        r1 = r7.fillBuffer(r3);
        if (r1 == 0) goto L_0x0016;
    L_0x0011:
        r1 = r7.pos;
        r2 = r7.limit;
        goto L_0x0032;
    L_0x0016:
        if (r8 != 0) goto L_0x001a;
    L_0x0018:
        r8 = -1;
        return r8;
    L_0x001a:
        r8 = new java.io.EOFException;
        r0 = new java.lang.StringBuilder;
        r1 = "End of input";
        r0.<init>(r1);
        r1 = r7.locationString();
        r0.append(r1);
        r0 = r0.toString();
        r8.<init>(r0);
        throw r8;
    L_0x0032:
        r4 = r1 + 1;
        r1 = r0[r1];
        r5 = 10;
        if (r1 != r5) goto L_0x0042;
    L_0x003a:
        r1 = r7.lineNumber;
        r1 = r1 + r3;
        r7.lineNumber = r1;
        r7.lineStart = r4;
        goto L_0x00a4;
    L_0x0042:
        r5 = 32;
        if (r1 == r5) goto L_0x00a4;
    L_0x0046:
        r5 = 13;
        if (r1 == r5) goto L_0x00a4;
    L_0x004a:
        r5 = 9;
        if (r1 == r5) goto L_0x00a4;
    L_0x004e:
        r5 = 47;
        if (r1 != r5) goto L_0x0093;
    L_0x0052:
        r7.pos = r4;
        r6 = 2;
        if (r4 != r2) goto L_0x0068;
    L_0x0057:
        r2 = r7.pos;
        r2 = r2 - r3;
        r7.pos = r2;
        r2 = r7.fillBuffer(r6);
        r4 = r7.pos;
        r4 = r4 + r3;
        r7.pos = r4;
        if (r2 != 0) goto L_0x0068;
    L_0x0067:
        return r1;
    L_0x0068:
        r7.checkLenient();
        r2 = r7.pos;
        r3 = r0[r2];
        r4 = 42;
        if (r3 == r4) goto L_0x007b;
    L_0x0073:
        if (r3 == r5) goto L_0x0076;
    L_0x0075:
        return r1;
    L_0x0076:
        r2 = r2 + 1;
        r7.pos = r2;
        goto L_0x009c;
    L_0x007b:
        r2 = r2 + 1;
        r7.pos = r2;
        r1 = "*/";
        r1 = r7.skipTo(r1);
        if (r1 == 0) goto L_0x008c;
    L_0x0087:
        r1 = r7.pos;
        r1 = r1 + r6;
        goto L_0x0004;
    L_0x008c:
        r8 = "Unterminated comment";
        r8 = r7.syntaxError(r8);
        throw r8;
    L_0x0093:
        r2 = 35;
        if (r1 != r2) goto L_0x00a1;
    L_0x0097:
        r7.pos = r4;
        r7.checkLenient();
    L_0x009c:
        r7.skipToEndOfLine();
        goto L_0x0002;
    L_0x00a1:
        r7.pos = r4;
        return r1;
    L_0x00a4:
        r1 = r4;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextNonWhitespace(boolean):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0056 in {7, 10, 13, 14, 17, 19} preds:[]
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
    private java.lang.String nextQuotedValue(char r9) {
        /*
        r8 = this;
        r0 = r8.buffer;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r8.pos;
        r3 = r8.limit;
        r4 = r2;
        r5 = 1;
        if (r4 >= r3) goto L_0x0041;
        r6 = r4 + 1;
        r4 = r0[r4];
        if (r4 != r9) goto L_0x0021;
        r8.pos = r6;
        r6 = r6 - r2;
        r6 = r6 - r5;
        r1.append(r0, r2, r6);
        r9 = r1.toString();
        return r9;
        r7 = 92;
        if (r4 != r7) goto L_0x0034;
        r8.pos = r6;
        r6 = r6 - r2;
        r6 = r6 - r5;
        r1.append(r0, r2, r6);
        r2 = r8.readEscapeCharacter();
        r1.append(r2);
        goto L_0x0007;
        r7 = 10;
        if (r4 != r7) goto L_0x003f;
        r4 = r8.lineNumber;
        r4 = r4 + r5;
        r8.lineNumber = r4;
        r8.lineStart = r6;
        r4 = r6;
        goto L_0x000c;
        r3 = r4 - r2;
        r1.append(r0, r2, r3);
        r8.pos = r4;
        r2 = r8.fillBuffer(r5);
        if (r2 == 0) goto L_0x004f;
        goto L_0x0007;
        r9 = "Unterminated string";
        r9 = r8.syntaxError(r9);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextQuotedValue(char):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARNING: Missing block: B:32:0x004b, code skipped:
            checkLenient();
     */
    private java.lang.String nextUnquotedValue() {
        /*
        r6 = this;
        r0 = 0;
        r1 = 0;
        r2 = r1;
    L_0x0003:
        r1 = 0;
    L_0x0004:
        r3 = r6.pos;
        r4 = r3 + r1;
        r5 = r6.limit;
        if (r4 >= r5) goto L_0x004f;
    L_0x000c:
        r4 = r6.buffer;
        r3 = r3 + r1;
        r3 = r4[r3];
        r4 = 9;
        if (r3 == r4) goto L_0x005d;
    L_0x0015:
        r4 = 10;
        if (r3 == r4) goto L_0x005d;
    L_0x0019:
        r4 = 12;
        if (r3 == r4) goto L_0x005d;
    L_0x001d:
        r4 = 13;
        if (r3 == r4) goto L_0x005d;
    L_0x0021:
        r4 = 32;
        if (r3 == r4) goto L_0x005d;
    L_0x0025:
        r4 = 35;
        if (r3 == r4) goto L_0x004b;
    L_0x0029:
        r4 = 44;
        if (r3 == r4) goto L_0x005d;
    L_0x002d:
        r4 = 47;
        if (r3 == r4) goto L_0x004b;
    L_0x0031:
        r4 = 61;
        if (r3 == r4) goto L_0x004b;
    L_0x0035:
        r4 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r3 == r4) goto L_0x005d;
    L_0x0039:
        r4 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r3 == r4) goto L_0x005d;
    L_0x003d:
        r4 = 58;
        if (r3 == r4) goto L_0x005d;
    L_0x0041:
        r4 = 59;
        if (r3 == r4) goto L_0x004b;
    L_0x0045:
        switch(r3) {
            case 91: goto L_0x005d;
            case 92: goto L_0x004b;
            case 93: goto L_0x005d;
            default: goto L_0x0048;
        };
    L_0x0048:
        r1 = r1 + 1;
        goto L_0x0004;
    L_0x004b:
        r6.checkLenient();
        goto L_0x005d;
    L_0x004f:
        r3 = r6.buffer;
        r3 = r3.length;
        if (r1 >= r3) goto L_0x005f;
    L_0x0054:
        r3 = r1 + 1;
        r3 = r6.fillBuffer(r3);
        if (r3 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x0004;
    L_0x005d:
        r0 = r1;
        goto L_0x0079;
    L_0x005f:
        if (r2 != 0) goto L_0x0066;
    L_0x0061:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
    L_0x0066:
        r3 = r6.buffer;
        r4 = r6.pos;
        r2.append(r3, r4, r1);
        r3 = r6.pos;
        r3 = r3 + r1;
        r6.pos = r3;
        r1 = 1;
        r1 = r6.fillBuffer(r1);
        if (r1 != 0) goto L_0x0003;
    L_0x0079:
        if (r2 != 0) goto L_0x0085;
    L_0x007b:
        r1 = new java.lang.String;
        r2 = r6.buffer;
        r3 = r6.pos;
        r1.<init>(r2, r3, r0);
        goto L_0x0090;
    L_0x0085:
        r1 = r6.buffer;
        r3 = r6.pos;
        r2.append(r1, r3, r0);
        r1 = r2.toString();
    L_0x0090:
        r2 = r6.pos;
        r2 = r2 + r0;
        r6.pos = r2;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextUnquotedValue():java.lang.String");
    }

    private int peekKeyword() {
        int i;
        String str;
        char c = this.buffer[this.pos];
        String str2;
        if (c == 't' || c == 'T') {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            if (this.pos + i2 >= this.limit && !fillBuffer(i2 + 1)) {
                return 0;
            }
            char c2 = this.buffer[this.pos + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
            i2++;
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i;
        return i;
    }

    private int peekNumber() {
        char c;
        int i;
        char[] cArr = this.buffer;
        int i2 = this.pos;
        int i3 = 0;
        int i4 = this.limit;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        long j = 0;
        Object obj = null;
        while (true) {
            if (i2 + i5 == i4) {
                if (i5 != cArr.length) {
                    if (!fillBuffer(i5 + 1)) {
                        break;
                    }
                    i2 = this.pos;
                    i4 = this.limit;
                } else {
                    return i3;
                }
            }
            c = cArr[i2 + i5];
            if (c == '+') {
                i3 = 0;
                if (i6 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i3 = 0;
                if (i6 != 2 && i6 != 4) {
                    return 0;
                }
                i6 = 5;
                i5++;
            } else {
                if (c == '-') {
                    i3 = 0;
                    if (i6 == 0) {
                        i6 = 1;
                        obj = 1;
                    } else if (i6 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i3 = 0;
                    if (i6 != 2) {
                        return 0;
                    }
                    i6 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (i6 == 1 || i6 == 0) {
                        j = (long) (-(c - 48));
                        i3 = 0;
                        i6 = 2;
                    } else {
                        if (i6 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - 48));
                            i3 = (j > MIN_INCOMPLETE_INTEGER || (j == MIN_INCOMPLETE_INTEGER && j2 < j)) ? 1 : 0;
                            j = j2;
                            i7 = i3 & i7;
                        } else if (i6 == 3) {
                            i3 = 0;
                            i6 = 4;
                        } else if (i6 == 5 || i6 == 6) {
                            i3 = 0;
                            i6 = 7;
                        }
                        i3 = 0;
                    }
                }
                i5++;
            }
            i6 = 6;
            i5++;
        }
        if (isLiteral(c)) {
            return 0;
        }
        if (i6 == 2 && i7 != 0 && (j != Long.MIN_VALUE || obj != null)) {
            if (obj == null) {
                j = -j;
            }
            this.peekedLong = j;
            this.pos += i5;
            i = 15;
        } else if (i6 != 2 && i6 != 4 && i6 != 7) {
            return 0;
        } else {
            this.peekedNumberLength = i5;
            i = 16;
        }
        this.peeked = i;
        return i;
    }

    private void push(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 << 1)];
            int[] iArr3 = new int[(i2 << 1)];
            String[] strArr = new String[(i2 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.pathIndices, 0, iArr3, 0, this.stackSize);
            System.arraycopy(this.pathNames, 0, strArr, 0, this.stackSize);
            this.stack = iArr2;
            this.pathIndices = iArr3;
            this.pathNames = strArr;
        }
        int[] iArr4 = this.stack;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr4[i3] = i;
    }

    private char readEscapeCharacter() {
        String str = "Unterminated escape sequence";
        if (this.pos != this.limit || fillBuffer(1)) {
            char[] cArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.lineNumber++;
                this.lineStart = this.pos;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw syntaxError("Invalid escape sequence");
                } else if (this.pos + 4 <= this.limit || fillBuffer(4)) {
                    int i2 = 0;
                    int i3 = this.pos;
                    int i4 = i3 + 4;
                    while (i3 < i4) {
                        int i5;
                        char c2 = this.buffer[i3];
                        c = (char) (i2 << 4);
                        if (c2 < '0' || c2 > '9') {
                            if (c2 >= 'a' && c2 <= 'f') {
                                i5 = c2 - 97;
                            } else if (c2 < 'A' || c2 > 'F') {
                                StringBuilder stringBuilder = new StringBuilder("\\u");
                                stringBuilder.append(new String(this.buffer, this.pos, 4));
                                throw new NumberFormatException(stringBuilder.toString());
                            } else {
                                i5 = c2 - 65;
                            }
                            i5 += 10;
                        } else {
                            i5 = c2 - 48;
                        }
                        i2 = (char) (c + i5);
                        i3++;
                    }
                    this.pos += 4;
                    return i2;
                } else {
                    throw syntaxError(str);
                }
            }
            return c;
        }
        throw syntaxError(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0039 in {7, 10, 13, 14, 17, 19} preds:[]
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
    private void skipQuotedValue(char r7) {
        /*
        r6 = this;
        r0 = r6.buffer;
        r1 = r6.pos;
        r2 = r6.limit;
        r3 = 1;
        if (r1 >= r2) goto L_0x0029;
        r4 = r1 + 1;
        r1 = r0[r1];
        if (r1 != r7) goto L_0x0012;
        r6.pos = r4;
        return;
        r5 = 92;
        if (r1 != r5) goto L_0x001c;
        r6.pos = r4;
        r6.readEscapeCharacter();
        goto L_0x0002;
        r5 = 10;
        if (r1 != r5) goto L_0x0027;
        r1 = r6.lineNumber;
        r1 = r1 + r3;
        r6.lineNumber = r1;
        r6.lineStart = r4;
        r1 = r4;
        goto L_0x0006;
        r6.pos = r1;
        r1 = r6.fillBuffer(r3);
        if (r1 == 0) goto L_0x0032;
        goto L_0x0002;
        r7 = "Unterminated string";
        r7 = r6.syntaxError(r7);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.skipQuotedValue(char):void");
    }

    private boolean skipTo(String str) {
        while (true) {
            int i = 0;
            if (this.pos + str.length() > this.limit && !fillBuffer(str.length())) {
                return false;
            }
            char[] cArr = this.buffer;
            int i2 = this.pos;
            if (cArr[i2] == 10) {
                this.lineNumber++;
                this.lineStart = i2 + 1;
            } else {
                while (i < str.length()) {
                    if (this.buffer[this.pos + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.pos++;
        }
    }

    private void skipToEndOfLine() {
        char c;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                break;
            }
            char[] cArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            c = cArr[i];
            if (c == 10) {
                this.lineNumber++;
                this.lineStart = this.pos;
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Missing block: B:31:0x0048, code skipped:
            checkLenient();
     */
    private void skipUnquotedValue() {
        /*
        r4 = this;
    L_0x0000:
        r0 = 0;
    L_0x0001:
        r1 = r4.pos;
        r2 = r1 + r0;
        r3 = r4.limit;
        if (r2 >= r3) goto L_0x0051;
    L_0x0009:
        r2 = r4.buffer;
        r1 = r1 + r0;
        r1 = r2[r1];
        r2 = 9;
        if (r1 == r2) goto L_0x004b;
    L_0x0012:
        r2 = 10;
        if (r1 == r2) goto L_0x004b;
    L_0x0016:
        r2 = 12;
        if (r1 == r2) goto L_0x004b;
    L_0x001a:
        r2 = 13;
        if (r1 == r2) goto L_0x004b;
    L_0x001e:
        r2 = 32;
        if (r1 == r2) goto L_0x004b;
    L_0x0022:
        r2 = 35;
        if (r1 == r2) goto L_0x0048;
    L_0x0026:
        r2 = 44;
        if (r1 == r2) goto L_0x004b;
    L_0x002a:
        r2 = 47;
        if (r1 == r2) goto L_0x0048;
    L_0x002e:
        r2 = 61;
        if (r1 == r2) goto L_0x0048;
    L_0x0032:
        r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r1 == r2) goto L_0x004b;
    L_0x0036:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r1 == r2) goto L_0x004b;
    L_0x003a:
        r2 = 58;
        if (r1 == r2) goto L_0x004b;
    L_0x003e:
        r2 = 59;
        if (r1 == r2) goto L_0x0048;
    L_0x0042:
        switch(r1) {
            case 91: goto L_0x004b;
            case 92: goto L_0x0048;
            case 93: goto L_0x004b;
            default: goto L_0x0045;
        };
    L_0x0045:
        r0 = r0 + 1;
        goto L_0x0001;
    L_0x0048:
        r4.checkLenient();
    L_0x004b:
        r1 = r4.pos;
        r1 = r1 + r0;
        r4.pos = r1;
        return;
    L_0x0051:
        r1 = r1 + r0;
        r4.pos = r1;
        r0 = 1;
        r0 = r4.fillBuffer(r0);
        if (r0 != 0) goto L_0x0000;
    L_0x005b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.skipUnquotedValue():void");
    }

    private IOException syntaxError(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(locationString());
        throw new MalformedJsonException(stringBuilder.toString());
    }

    public void beginArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 3) {
            push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected BEGIN_ARRAY but was ");
        stringBuilder.append(peek());
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void beginObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 1) {
            push(3);
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected BEGIN_OBJECT but was ");
        stringBuilder.append(peek());
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void close() {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    public int doPeek() {
        /*
        r15 = this;
        r0 = r15.stack;
        r1 = r15.stackSize;
        r2 = r1 + -1;
        r2 = r0[r2];
        r3 = 8;
        r4 = 39;
        r5 = 34;
        r6 = 93;
        r7 = 3;
        r8 = 7;
        r9 = 59;
        r10 = 44;
        r11 = 4;
        r12 = 2;
        r13 = 1;
        if (r2 != r13) goto L_0x0020;
    L_0x001b:
        r1 = r1 - r13;
        r0[r1] = r12;
        goto L_0x00a2;
    L_0x0020:
        if (r2 != r12) goto L_0x003a;
    L_0x0022:
        r0 = r15.nextNonWhitespace(r13);
        if (r0 == r10) goto L_0x00a2;
    L_0x0028:
        if (r0 == r9) goto L_0x0036;
    L_0x002a:
        if (r0 != r6) goto L_0x002f;
    L_0x002c:
        r15.peeked = r11;
        return r11;
    L_0x002f:
        r0 = "Unterminated array";
        r0 = r15.syntaxError(r0);
        throw r0;
    L_0x0036:
        r15.checkLenient();
        goto L_0x00a2;
    L_0x003a:
        r14 = 5;
        if (r2 == r7) goto L_0x0117;
    L_0x003d:
        if (r2 != r14) goto L_0x0041;
    L_0x003f:
        goto L_0x0117;
    L_0x0041:
        if (r2 != r11) goto L_0x0076;
    L_0x0043:
        r1 = r1 - r13;
        r0[r1] = r14;
        r0 = r15.nextNonWhitespace(r13);
        r1 = 58;
        if (r0 == r1) goto L_0x00a2;
    L_0x004e:
        r1 = 61;
        if (r0 != r1) goto L_0x006f;
    L_0x0052:
        r15.checkLenient();
        r0 = r15.pos;
        r1 = r15.limit;
        if (r0 < r1) goto L_0x0061;
    L_0x005b:
        r0 = r15.fillBuffer(r13);
        if (r0 == 0) goto L_0x00a2;
    L_0x0061:
        r0 = r15.buffer;
        r1 = r15.pos;
        r0 = r0[r1];
        r14 = 62;
        if (r0 != r14) goto L_0x00a2;
    L_0x006b:
        r1 = r1 + r13;
        r15.pos = r1;
        goto L_0x00a2;
    L_0x006f:
        r0 = "Expected ':'";
        r0 = r15.syntaxError(r0);
        throw r0;
    L_0x0076:
        r0 = 6;
        if (r2 != r0) goto L_0x0088;
    L_0x0079:
        r0 = r15.lenient;
        if (r0 == 0) goto L_0x0080;
    L_0x007d:
        r15.consumeNonExecutePrefix();
    L_0x0080:
        r0 = r15.stack;
        r1 = r15.stackSize;
        r1 = r1 - r13;
        r0[r1] = r8;
        goto L_0x00a2;
    L_0x0088:
        if (r2 != r8) goto L_0x00a0;
    L_0x008a:
        r0 = 0;
        r0 = r15.nextNonWhitespace(r0);
        r1 = -1;
        if (r0 != r1) goto L_0x0097;
    L_0x0092:
        r0 = 17;
    L_0x0094:
        r15.peeked = r0;
        return r0;
    L_0x0097:
        r15.checkLenient();
        r0 = r15.pos;
        r0 = r0 - r13;
        r15.pos = r0;
        goto L_0x00a2;
    L_0x00a0:
        if (r2 == r3) goto L_0x010f;
    L_0x00a2:
        r0 = r15.nextNonWhitespace(r13);
        if (r0 == r5) goto L_0x010c;
    L_0x00a8:
        if (r0 == r4) goto L_0x0106;
    L_0x00aa:
        if (r0 == r10) goto L_0x00ef;
    L_0x00ac:
        if (r0 == r9) goto L_0x00ef;
    L_0x00ae:
        r1 = 91;
        if (r0 == r1) goto L_0x00ec;
    L_0x00b2:
        if (r0 == r6) goto L_0x00e7;
    L_0x00b4:
        r1 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        if (r0 == r1) goto L_0x00e4;
    L_0x00b8:
        r0 = r15.pos;
        r0 = r0 - r13;
        r15.pos = r0;
        r0 = r15.peekKeyword();
        if (r0 == 0) goto L_0x00c4;
    L_0x00c3:
        return r0;
    L_0x00c4:
        r0 = r15.peekNumber();
        if (r0 == 0) goto L_0x00cb;
    L_0x00ca:
        return r0;
    L_0x00cb:
        r0 = r15.buffer;
        r1 = r15.pos;
        r0 = r0[r1];
        r0 = r15.isLiteral(r0);
        if (r0 == 0) goto L_0x00dd;
    L_0x00d7:
        r15.checkLenient();
        r0 = 10;
        goto L_0x0094;
    L_0x00dd:
        r0 = "Expected value";
        r0 = r15.syntaxError(r0);
        throw r0;
    L_0x00e4:
        r15.peeked = r13;
        return r13;
    L_0x00e7:
        if (r2 != r13) goto L_0x00ef;
    L_0x00e9:
        r15.peeked = r11;
        return r11;
    L_0x00ec:
        r15.peeked = r7;
        return r7;
    L_0x00ef:
        if (r2 == r13) goto L_0x00fb;
    L_0x00f1:
        if (r2 != r12) goto L_0x00f4;
    L_0x00f3:
        goto L_0x00fb;
    L_0x00f4:
        r0 = "Unexpected value";
        r0 = r15.syntaxError(r0);
        throw r0;
    L_0x00fb:
        r15.checkLenient();
        r0 = r15.pos;
        r0 = r0 - r13;
        r15.pos = r0;
        r15.peeked = r8;
        return r8;
    L_0x0106:
        r15.checkLenient();
        r15.peeked = r3;
        return r3;
    L_0x010c:
        r0 = 9;
        goto L_0x0094;
    L_0x010f:
        r0 = new java.lang.IllegalStateException;
        r1 = "JsonReader is closed";
        r0.<init>(r1);
        throw r0;
    L_0x0117:
        r0 = r15.stack;
        r1 = r15.stackSize;
        r1 = r1 - r13;
        r0[r1] = r11;
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r2 != r14) goto L_0x0139;
    L_0x0122:
        r1 = r15.nextNonWhitespace(r13);
        if (r1 == r10) goto L_0x0139;
    L_0x0128:
        if (r1 == r9) goto L_0x0136;
    L_0x012a:
        if (r1 != r0) goto L_0x012f;
    L_0x012c:
        r15.peeked = r12;
        return r12;
    L_0x012f:
        r0 = "Unterminated object";
        r0 = r15.syntaxError(r0);
        throw r0;
    L_0x0136:
        r15.checkLenient();
    L_0x0139:
        r1 = r15.nextNonWhitespace(r13);
        if (r1 == r5) goto L_0x016e;
    L_0x013f:
        if (r1 == r4) goto L_0x0167;
    L_0x0141:
        r3 = "Expected name";
        if (r1 == r0) goto L_0x015d;
    L_0x0145:
        r15.checkLenient();
        r0 = r15.pos;
        r0 = r0 - r13;
        r15.pos = r0;
        r0 = (char) r1;
        r0 = r15.isLiteral(r0);
        if (r0 == 0) goto L_0x0158;
    L_0x0154:
        r0 = 14;
        goto L_0x0094;
    L_0x0158:
        r0 = r15.syntaxError(r3);
        throw r0;
    L_0x015d:
        if (r2 == r14) goto L_0x0162;
    L_0x015f:
        r15.peeked = r12;
        return r12;
    L_0x0162:
        r0 = r15.syntaxError(r3);
        throw r0;
    L_0x0167:
        r15.checkLenient();
        r0 = 12;
        goto L_0x0094;
    L_0x016e:
        r0 = 13;
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.doPeek():int");
    }

    public void endArray() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 4) {
            this.stackSize--;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected END_ARRAY but was ");
        stringBuilder.append(peek());
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void endObject() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 2) {
            this.stackSize--;
            String[] strArr = this.pathNames;
            int i2 = this.stackSize;
            strArr[i2] = null;
            int[] iArr = this.pathIndices;
            i2--;
            iArr[i2] = iArr[i2] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected END_OBJECT but was ");
        stringBuilder.append(peek());
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String getPath() {
        StringBuilder stringBuilder = new StringBuilder("$");
        int i = this.stackSize;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.stack[i2];
            if (i3 == 1 || i3 == 2) {
                stringBuilder.append('[');
                stringBuilder.append(this.pathIndices[i2]);
                stringBuilder.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                stringBuilder.append('.');
                String[] strArr = this.pathNames;
                if (strArr[i2] != null) {
                    stringBuilder.append(strArr[i2]);
                }
            }
        }
        return stringBuilder.toString();
    }

    public boolean hasNext() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    public boolean nextBoolean() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        int[] iArr;
        int i2;
        if (i == 5) {
            this.peeked = 0;
            iArr = this.pathIndices;
            i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.peeked = 0;
            iArr = this.pathIndices;
            i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return false;
        } else {
            StringBuilder stringBuilder = new StringBuilder("Expected a boolean but was ");
            stringBuilder.append(peek());
            stringBuilder.append(locationString());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public double nextDouble() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.peekedLong;
        }
        if (i == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            String nextQuotedValue;
            if (i == 8 || i == 9) {
                nextQuotedValue = nextQuotedValue(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                nextQuotedValue = nextUnquotedValue();
            } else if (i != 11) {
                StringBuilder stringBuilder = new StringBuilder("Expected a double but was ");
                stringBuilder.append(peek());
                stringBuilder.append(locationString());
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.peekedString = nextQuotedValue;
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        if (this.lenient || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder stringBuilder2 = new StringBuilder("JSON forbids NaN and infinities: ");
        stringBuilder2.append(parseDouble);
        stringBuilder2.append(locationString());
        throw new MalformedJsonException(stringBuilder2.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x00eb in {2, 8, 10, 13, 19, 21, 23, 26, 27, 28, 31, 33, 36, 38} preds:[]
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
    public int nextInt() {
        /*
        r8 = this;
        r0 = r8.peeked;
        if (r0 != 0) goto L_0x0008;
        r0 = r8.doPeek();
        r1 = 15;
        r2 = "Expected an int but was ";
        r3 = 0;
        if (r0 != r1) goto L_0x0041;
        r0 = r8.peekedLong;
        r4 = (int) r0;
        r5 = (long) r4;
        r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r7 != 0) goto L_0x0026;
        r8.peeked = r3;
        r0 = r8.pathIndices;
        r1 = r8.stackSize;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r4;
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r2);
        r2 = r8.peekedLong;
        r1.append(r2);
        r2 = r8.locationString();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        r1 = 16;
        if (r0 != r1) goto L_0x005a;
        r0 = new java.lang.String;
        r1 = r8.buffer;
        r4 = r8.pos;
        r5 = r8.peekedNumberLength;
        r0.<init>(r1, r4, r5);
        r8.peekedString = r0;
        r0 = r8.pos;
        r1 = r8.peekedNumberLength;
        r0 = r0 + r1;
        r8.pos = r0;
        goto L_0x00ae;
        r1 = 10;
        r4 = 8;
        if (r0 == r4) goto L_0x0084;
        r5 = 9;
        if (r0 == r5) goto L_0x0084;
        if (r0 != r1) goto L_0x0067;
        goto L_0x0084;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r2);
        r2 = r8.peek();
        r1.append(r2);
        r2 = r8.locationString();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        if (r0 != r1) goto L_0x008d;
        r0 = r8.nextUnquotedValue();
        r8.peekedString = r0;
        goto L_0x0099;
        if (r0 != r4) goto L_0x0092;
        r0 = 39;
        goto L_0x0094;
        r0 = 34;
        r0 = r8.nextQuotedValue(r0);
        goto L_0x008a;
        r0 = r8.peekedString;	 Catch:{ NumberFormatException -> 0x00ae }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00ae }
        r8.peeked = r3;	 Catch:{ NumberFormatException -> 0x00ae }
        r1 = r8.pathIndices;	 Catch:{ NumberFormatException -> 0x00ae }
        r4 = r8.stackSize;	 Catch:{ NumberFormatException -> 0x00ae }
        r4 = r4 + -1;	 Catch:{ NumberFormatException -> 0x00ae }
        r5 = r1[r4];	 Catch:{ NumberFormatException -> 0x00ae }
        r5 = r5 + 1;	 Catch:{ NumberFormatException -> 0x00ae }
        r1[r4] = r5;	 Catch:{ NumberFormatException -> 0x00ae }
        return r0;
        r0 = 11;
        r8.peeked = r0;
        r0 = r8.peekedString;
        r0 = java.lang.Double.parseDouble(r0);
        r4 = (int) r0;
        r5 = (double) r4;
        r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r7 != 0) goto L_0x00d0;
        r0 = 0;
        r8.peekedString = r0;
        r8.peeked = r3;
        r0 = r8.pathIndices;
        r1 = r8.stackSize;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r4;
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r2);
        r2 = r8.peekedString;
        r1.append(r2);
        r2 = r8.locationString();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextInt():int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x00ca in {2, 6, 9, 15, 17, 19, 22, 23, 24, 27, 29, 32, 34} preds:[]
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
    public long nextLong() {
        /*
        r9 = this;
        r0 = r9.peeked;
        if (r0 != 0) goto L_0x0008;
        r0 = r9.doPeek();
        r1 = 15;
        r2 = 0;
        if (r0 != r1) goto L_0x001e;
        r9.peeked = r2;
        r0 = r9.pathIndices;
        r1 = r9.stackSize;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        r0 = r9.peekedLong;
        return r0;
        r1 = 16;
        r3 = "Expected a long but was ";
        if (r0 != r1) goto L_0x0039;
        r0 = new java.lang.String;
        r1 = r9.buffer;
        r4 = r9.pos;
        r5 = r9.peekedNumberLength;
        r0.<init>(r1, r4, r5);
        r9.peekedString = r0;
        r0 = r9.pos;
        r1 = r9.peekedNumberLength;
        r0 = r0 + r1;
        r9.pos = r0;
        goto L_0x008d;
        r1 = 10;
        r4 = 8;
        if (r0 == r4) goto L_0x0063;
        r5 = 9;
        if (r0 == r5) goto L_0x0063;
        if (r0 != r1) goto L_0x0046;
        goto L_0x0063;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r3);
        r2 = r9.peek();
        r1.append(r2);
        r2 = r9.locationString();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        if (r0 != r1) goto L_0x006c;
        r0 = r9.nextUnquotedValue();
        r9.peekedString = r0;
        goto L_0x0078;
        if (r0 != r4) goto L_0x0071;
        r0 = 39;
        goto L_0x0073;
        r0 = 34;
        r0 = r9.nextQuotedValue(r0);
        goto L_0x0069;
        r0 = r9.peekedString;	 Catch:{ NumberFormatException -> 0x008d }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x008d }
        r9.peeked = r2;	 Catch:{ NumberFormatException -> 0x008d }
        r4 = r9.pathIndices;	 Catch:{ NumberFormatException -> 0x008d }
        r5 = r9.stackSize;	 Catch:{ NumberFormatException -> 0x008d }
        r5 = r5 + -1;	 Catch:{ NumberFormatException -> 0x008d }
        r6 = r4[r5];	 Catch:{ NumberFormatException -> 0x008d }
        r6 = r6 + 1;	 Catch:{ NumberFormatException -> 0x008d }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x008d }
        return r0;
        r0 = 11;
        r9.peeked = r0;
        r0 = r9.peekedString;
        r0 = java.lang.Double.parseDouble(r0);
        r4 = (long) r0;
        r6 = (double) r4;
        r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r8 != 0) goto L_0x00af;
        r0 = 0;
        r9.peekedString = r0;
        r9.peeked = r2;
        r0 = r9.pathIndices;
        r1 = r9.stackSize;
        r1 = r1 + -1;
        r2 = r0[r1];
        r2 = r2 + 1;
        r0[r1] = r2;
        return r4;
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r3);
        r2 = r9.peekedString;
        r1.append(r2);
        r2 = r9.locationString();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextLong():long");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x004e in {2, 5, 8, 9, 12, 14, 16} preds:[]
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
    public java.lang.String nextName() {
        /*
        r3 = this;
        r0 = r3.peeked;
        if (r0 != 0) goto L_0x0008;
        r0 = r3.doPeek();
        r1 = 14;
        if (r0 != r1) goto L_0x0011;
        r0 = r3.nextUnquotedValue();
        goto L_0x0023;
        r1 = 12;
        if (r0 != r1) goto L_0x001c;
        r0 = 39;
        r0 = r3.nextQuotedValue(r0);
        goto L_0x0023;
        r1 = 13;
        if (r0 != r1) goto L_0x002f;
        r0 = 34;
        goto L_0x0017;
        r1 = 0;
        r3.peeked = r1;
        r1 = r3.pathNames;
        r2 = r3.stackSize;
        r2 = r2 + -1;
        r1[r2] = r0;
        return r0;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected a name but was ";
        r1.<init>(r2);
        r2 = r3.peek();
        r1.append(r2);
        r2 = r3.locationString();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextName():java.lang.String");
    }

    public void nextNull() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 7) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected null but was ");
        stringBuilder.append(peek());
        stringBuilder.append(locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x007d in {2, 5, 8, 9, 12, 15, 18, 21, 23, 25} preds:[]
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
    public java.lang.String nextString() {
        /*
        r4 = this;
        r0 = r4.peeked;
        if (r0 != 0) goto L_0x0008;
        r0 = r4.doPeek();
        r1 = 10;
        if (r0 != r1) goto L_0x0011;
        r0 = r4.nextUnquotedValue();
        goto L_0x004e;
        r1 = 8;
        if (r0 != r1) goto L_0x001c;
        r0 = 39;
        r0 = r4.nextQuotedValue(r0);
        goto L_0x004e;
        r1 = 9;
        if (r0 != r1) goto L_0x0023;
        r0 = 34;
        goto L_0x0017;
        r1 = 11;
        if (r0 != r1) goto L_0x002d;
        r0 = r4.peekedString;
        r1 = 0;
        r4.peekedString = r1;
        goto L_0x004e;
        r1 = 15;
        if (r0 != r1) goto L_0x0038;
        r0 = r4.peekedLong;
        r0 = java.lang.Long.toString(r0);
        goto L_0x004e;
        r1 = 16;
        if (r0 != r1) goto L_0x005e;
        r0 = new java.lang.String;
        r1 = r4.buffer;
        r2 = r4.pos;
        r3 = r4.peekedNumberLength;
        r0.<init>(r1, r2, r3);
        r1 = r4.pos;
        r2 = r4.peekedNumberLength;
        r1 = r1 + r2;
        r4.pos = r1;
        r1 = 0;
        r4.peeked = r1;
        r1 = r4.pathIndices;
        r2 = r4.stackSize;
        r2 = r2 + -1;
        r3 = r1[r2];
        r3 = r3 + 1;
        r1[r2] = r3;
        return r0;
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected a string but was ";
        r1.<init>(r2);
        r2 = r4.peek();
        r1.append(r2);
        r2 = r4.locationString();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextString():java.lang.String");
    }

    public JsonToken peek() {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public void skipValue() {
        int i;
        int i2 = 0;
        do {
            i = this.peeked;
            if (i == 0) {
                i = doPeek();
            }
            if (i == 3) {
                push(1);
            } else if (i == 1) {
                push(3);
            } else if (i == 4 || i == 2) {
                this.stackSize--;
                i2--;
                this.peeked = 0;
            } else if (i == 14 || i == 10) {
                skipUnquotedValue();
                this.peeked = 0;
            } else {
                char c;
                if (i == 8 || i == 12) {
                    c = '\'';
                } else if (i == 9 || i == 13) {
                    c = '\"';
                } else {
                    if (i == 16) {
                        this.pos += this.peekedNumberLength;
                    }
                    this.peeked = 0;
                }
                skipQuotedValue(c);
                this.peeked = 0;
            }
            i2++;
            this.peeked = 0;
        } while (i2 != 0);
        int[] iArr = this.pathIndices;
        i2 = this.stackSize;
        i = i2 - 1;
        iArr[i] = iArr[i] + 1;
        this.pathNames[i2 - 1] = "null";
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(locationString());
        return stringBuilder.toString();
    }
}

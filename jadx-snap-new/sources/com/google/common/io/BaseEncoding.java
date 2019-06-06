package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

public abstract class BaseEncoding {
    private static final BaseEncoding BASE16 = new Base16Encoding("base16()", "0123456789ABCDEF");
    private static final BaseEncoding BASE32;
    private static final BaseEncoding BASE32_HEX;
    private static final BaseEncoding BASE64;
    private static final BaseEncoding BASE64_URL;

    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    static class StandardBaseEncoding extends BaseEncoding {
        final Alphabet alphabet;
        private transient BaseEncoding lowerCase;
        final Character paddingChar;

        StandardBaseEncoding(Alphabet alphabet, Character ch) {
            this.alphabet = (Alphabet) Preconditions.checkNotNull(alphabet);
            boolean z = ch == null || !alphabet.matches(ch.charValue());
            Preconditions.checkArgument(z, "Padding character %s was already in alphabet", (Object) ch);
            this.paddingChar = ch;
        }

        StandardBaseEncoding(String str, String str2, Character ch) {
            this(new Alphabet(str, str2.toCharArray()), ch);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x008b in {10, 11, 14, 15, 16, 18} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        int decodeTo(byte[] r13, java.lang.CharSequence r14) {
            /*
            r12 = this;
            com.google.common.base.Preconditions.checkNotNull(r13);
            r14 = r12.trimTrailingPadding(r14);
            r0 = r12.alphabet;
            r1 = r14.length();
            r0 = r0.isValidPaddingStartPosition(r1);
            if (r0 == 0) goto L_0x0073;
            r0 = 0;
            r1 = 0;
            r2 = 0;
            r3 = r14.length();
            if (r1 >= r3) goto L_0x0072;
            r3 = 0;
            r5 = r3;
            r3 = 0;
            r4 = 0;
            r7 = r12.alphabet;
            r7 = r7.charsPerChunk;
            if (r3 >= r7) goto L_0x0047;
            r7 = r12.alphabet;
            r7 = r7.bitsPerChar;
            r5 = r5 << r7;
            r7 = r1 + r3;
            r8 = r14.length();
            if (r7 >= r8) goto L_0x0044;
            r7 = r12.alphabet;
            r8 = r4 + 1;
            r4 = r4 + r1;
            r4 = r14.charAt(r4);
            r4 = r7.decode(r4);
            r9 = (long) r4;
            r5 = r5 | r9;
            r4 = r8;
            r3 = r3 + 1;
            goto L_0x0021;
            r3 = r12.alphabet;
            r3 = r3.bytesPerChunk;
            r3 = r3 << 3;
            r7 = r12.alphabet;
            r7 = r7.bitsPerChar;
            r4 = r4 * r7;
            r3 = r3 - r4;
            r4 = r12.alphabet;
            r4 = r4.bytesPerChunk;
            r4 = r4 + -1;
            r4 = r4 << 3;
            if (r4 < r3) goto L_0x006c;
            r7 = r2 + 1;
            r8 = r5 >>> r4;
            r10 = 255; // 0xff float:3.57E-43 double:1.26E-321;
            r8 = r8 & r10;
            r9 = (int) r8;
            r8 = (byte) r9;
            r13[r2] = r8;
            r4 = r4 + -8;
            r2 = r7;
            goto L_0x005b;
            r3 = r12.alphabet;
            r3 = r3.charsPerChunk;
            r1 = r1 + r3;
            goto L_0x0016;
            return r2;
            r13 = new com.google.common.io.BaseEncoding$DecodingException;
            r0 = new java.lang.StringBuilder;
            r1 = "Invalid input length ";
            r0.<init>(r1);
            r14 = r14.length();
            r0.append(r14);
            r14 = r0.toString();
            r13.<init>(r14);
            throw r13;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding$StandardBaseEncoding.decodeTo(byte[], java.lang.CharSequence):int");
        }

        /* Access modifiers changed, original: 0000 */
        public void encodeChunkTo(Appendable appendable, byte[] bArr, int i, int i2) {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            Preconditions.checkArgument(i2 <= this.alphabet.bytesPerChunk);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = ((i2 + 1) << 3) - this.alphabet.bitsPerChar;
            while (i3 < (i2 << 3)) {
                appendable.append(this.alphabet.encode(((int) (j >>> (i5 - i3))) & this.alphabet.mask));
                i3 += this.alphabet.bitsPerChar;
            }
            if (this.paddingChar != null) {
                while (i3 < (this.alphabet.bytesPerChunk << 3)) {
                    appendable.append(this.paddingChar.charValue());
                    i3 += this.alphabet.bitsPerChar;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                encodeChunkTo(appendable, bArr, i + i3, Math.min(this.alphabet.bytesPerChunk, i2 - i3));
                i3 += this.alphabet.bytesPerChunk;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof StandardBaseEncoding) {
                StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
                if (this.alphabet.equals(standardBaseEncoding.alphabet) && Objects.equal(this.paddingChar, standardBaseEncoding.paddingChar)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.alphabet.hashCode() ^ Objects.hashCode(this.paddingChar);
        }

        public BaseEncoding lowerCase() {
            BaseEncoding baseEncoding = this.lowerCase;
            if (baseEncoding == null) {
                Alphabet lowerCase = this.alphabet.lowerCase();
                baseEncoding = lowerCase == this.alphabet ? this : newInstance(lowerCase, this.paddingChar);
                this.lowerCase = baseEncoding;
            }
            return baseEncoding;
        }

        /* Access modifiers changed, original: 0000 */
        public int maxDecodedSize(int i) {
            return (int) (((((long) this.alphabet.bitsPerChar) * ((long) i)) + 7) / 8);
        }

        /* Access modifiers changed, original: 0000 */
        public int maxEncodedSize(int i) {
            return this.alphabet.charsPerChunk * IntMath.divide(i, this.alphabet.bytesPerChunk, RoundingMode.CEILING);
        }

        /* Access modifiers changed, original: 0000 */
        public BaseEncoding newInstance(Alphabet alphabet, Character ch) {
            return new StandardBaseEncoding(alphabet, ch);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
            stringBuilder.append(this.alphabet.toString());
            if (8 % this.alphabet.bitsPerChar != 0) {
                String str;
                if (this.paddingChar == null) {
                    str = ".omitPadding()";
                } else {
                    stringBuilder.append(".withPadChar('");
                    stringBuilder.append(this.paddingChar);
                    str = "')";
                }
                stringBuilder.append(str);
            }
            return stringBuilder.toString();
        }

        /* Access modifiers changed, original: 0000 */
        public CharSequence trimTrailingPadding(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            Character ch = this.paddingChar;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }
    }

    static final class Base64Encoding extends StandardBaseEncoding {
        private Base64Encoding(Alphabet alphabet, Character ch) {
            super(alphabet, ch);
            Preconditions.checkArgument(alphabet.chars.length == 64);
        }

        Base64Encoding(String str, String str2, Character ch) {
            this(new Alphabet(str, str2.toCharArray()), ch);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0092 in {9, 10, 11, 12, 14} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final int decodeTo(byte[] r6, java.lang.CharSequence r7) {
            /*
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6);
            r7 = r5.trimTrailingPadding(r7);
            r0 = r5.alphabet;
            r1 = r7.length();
            r0 = r0.isValidPaddingStartPosition(r1);
            if (r0 == 0) goto L_0x007a;
            r0 = 0;
            r1 = 0;
            r2 = r7.length();
            if (r0 >= r2) goto L_0x0079;
            r2 = r5.alphabet;
            r3 = r0 + 1;
            r0 = r7.charAt(r0);
            r0 = r2.decode(r0);
            r0 = r0 << 18;
            r2 = r5.alphabet;
            r4 = r3 + 1;
            r3 = r7.charAt(r3);
            r2 = r2.decode(r3);
            r2 = r2 << 12;
            r0 = r0 | r2;
            r2 = r1 + 1;
            r3 = r0 >>> 16;
            r3 = (byte) r3;
            r6[r1] = r3;
            r1 = r7.length();
            if (r4 >= r1) goto L_0x0076;
            r1 = r5.alphabet;
            r3 = r4 + 1;
            r4 = r7.charAt(r4);
            r1 = r1.decode(r4);
            r1 = r1 << 6;
            r0 = r0 | r1;
            r1 = r2 + 1;
            r4 = r0 >>> 8;
            r4 = (byte) r4;
            r6[r2] = r4;
            r2 = r7.length();
            if (r3 >= r2) goto L_0x0074;
            r2 = r5.alphabet;
            r4 = r3 + 1;
            r3 = r7.charAt(r3);
            r2 = r2.decode(r3);
            r0 = r0 | r2;
            r2 = r1 + 1;
            r0 = (byte) r0;
            r6[r1] = r0;
            goto L_0x0076;
            r0 = r3;
            goto L_0x0015;
            r1 = r2;
            r0 = r4;
            goto L_0x0015;
            return r1;
            r6 = new com.google.common.io.BaseEncoding$DecodingException;
            r0 = new java.lang.StringBuilder;
            r1 = "Invalid input length ";
            r0.<init>(r1);
            r7 = r7.length();
            r0.append(r7);
            r7 = r0.toString();
            r6.<init>(r7);
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding$Base64Encoding.decodeTo(byte[], java.lang.CharSequence):int");
        }

        /* Access modifiers changed, original: final */
        public final void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) {
            Preconditions.checkNotNull(appendable);
            int i3 = i + i2;
            Preconditions.checkPositionIndexes(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                i = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8);
                i4 = i5 + 1;
                i |= bArr[i5] & 255;
                appendable.append(this.alphabet.encode(i >>> 18));
                appendable.append(this.alphabet.encode((i >>> 12) & 63));
                appendable.append(this.alphabet.encode((i >>> 6) & 63));
                appendable.append(this.alphabet.encode(i & 63));
                i2 -= 3;
                i = i4;
            }
            if (i < i3) {
                encodeChunkTo(appendable, bArr, i, i3 - i);
            }
        }

        /* Access modifiers changed, original: final */
        public final BaseEncoding newInstance(Alphabet alphabet, Character ch) {
            return new Base64Encoding(alphabet, ch);
        }
    }

    static final class Base16Encoding extends StandardBaseEncoding {
        final char[] encoding;

        private Base16Encoding(Alphabet alphabet) {
            super(alphabet, null);
            this.encoding = new char[RasterSource.DEFAULT_TILE_SIZE];
            Preconditions.checkArgument(alphabet.chars.length == 16);
            for (int i = 0; i < 256; i++) {
                this.encoding[i] = alphabet.encode(i >>> 4);
                this.encoding[i | 256] = alphabet.encode(i & 15);
            }
        }

        Base16Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x004f in {5, 6, 8} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final int decodeTo(byte[] r6, java.lang.CharSequence r7) {
            /*
            r5 = this;
            com.google.common.base.Preconditions.checkNotNull(r6);
            r0 = r7.length();
            r0 = r0 % 2;
            r1 = 1;
            if (r0 == r1) goto L_0x0037;
            r0 = 0;
            r1 = 0;
            r2 = r7.length();
            if (r0 >= r2) goto L_0x0036;
            r2 = r5.alphabet;
            r3 = r7.charAt(r0);
            r2 = r2.decode(r3);
            r2 = r2 << 4;
            r3 = r5.alphabet;
            r4 = r0 + 1;
            r4 = r7.charAt(r4);
            r3 = r3.decode(r4);
            r2 = r2 | r3;
            r3 = r1 + 1;
            r2 = (byte) r2;
            r6[r1] = r2;
            r0 = r0 + 2;
            r1 = r3;
            goto L_0x000e;
            return r1;
            r6 = new com.google.common.io.BaseEncoding$DecodingException;
            r0 = new java.lang.StringBuilder;
            r1 = "Invalid input length ";
            r0.<init>(r1);
            r7 = r7.length();
            r0.append(r7);
            r7 = r0.toString();
            r6.<init>(r7);
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding$Base16Encoding.decodeTo(byte[], java.lang.CharSequence):int");
        }

        /* Access modifiers changed, original: final */
        public final void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & 255;
                appendable.append(this.encoding[i4]);
                appendable.append(this.encoding[i4 | 256]);
            }
        }

        /* Access modifiers changed, original: final */
        public final BaseEncoding newInstance(Alphabet alphabet, Character ch) {
            return new Base16Encoding(alphabet);
        }
    }

    static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        final int mask;
        private final String name;
        private final boolean[] validPadding;

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x00ac in {11, 12, 15, 16, 17, 21, 23, 26, 29} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        Alphabet(java.lang.String r9, char[] r10) {
            /*
            r8 = this;
            r8.<init>();
            r9 = com.google.common.base.Preconditions.checkNotNull(r9);
            r9 = (java.lang.String) r9;
            r8.name = r9;
            r9 = com.google.common.base.Preconditions.checkNotNull(r10);
            r9 = (char[]) r9;
            r8.chars = r9;
            r9 = r10.length;	 Catch:{ ArithmeticException -> 0x0096 }
            r0 = java.math.RoundingMode.UNNECESSARY;	 Catch:{ ArithmeticException -> 0x0096 }
            r9 = com.google.common.math.IntMath.log2(r9, r0);	 Catch:{ ArithmeticException -> 0x0096 }
            r8.bitsPerChar = r9;	 Catch:{ ArithmeticException -> 0x0096 }
            r9 = r8.bitsPerChar;
            r9 = java.lang.Integer.lowestOneBit(r9);
            r0 = 8;
            r9 = java.lang.Math.min(r0, r9);
            r0 = r0 / r9;	 Catch:{ ArithmeticException -> 0x007c }
            r8.charsPerChunk = r0;	 Catch:{ ArithmeticException -> 0x007c }
            r0 = r8.bitsPerChar;	 Catch:{ ArithmeticException -> 0x007c }
            r0 = r0 / r9;	 Catch:{ ArithmeticException -> 0x007c }
            r8.bytesPerChunk = r0;	 Catch:{ ArithmeticException -> 0x007c }
            r9 = r10.length;
            r0 = 1;
            r9 = r9 - r0;
            r8.mask = r9;
            r9 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r1 = new byte[r9];
            r2 = -1;
            java.util.Arrays.fill(r1, r2);
            r3 = 0;
            r4 = 0;
            r5 = r10.length;
            if (r4 >= r5) goto L_0x0060;
            r5 = r10[r4];
            if (r5 >= r9) goto L_0x0048;
            r6 = 1;
            goto L_0x0049;
            r6 = 0;
            r7 = "Non-ASCII character: %s";
            com.google.common.base.Preconditions.checkArgument(r6, r7, r5);
            r6 = r1[r5];
            if (r6 != r2) goto L_0x0054;
            r6 = 1;
            goto L_0x0055;
            r6 = 0;
            r7 = "Duplicate character: %s";
            com.google.common.base.Preconditions.checkArgument(r6, r7, r5);
            r6 = (byte) r4;
            r1[r5] = r6;
            r4 = r4 + 1;
            goto L_0x003f;
            r8.decodabet = r1;
            r9 = r8.charsPerChunk;
            r9 = new boolean[r9];
            r10 = r8.bytesPerChunk;
            if (r3 >= r10) goto L_0x0079;
            r10 = r3 << 3;
            r1 = r8.bitsPerChar;
            r2 = java.math.RoundingMode.CEILING;
            r10 = com.google.common.math.IntMath.divide(r10, r1, r2);
            r9[r10] = r0;
            r3 = r3 + 1;
            goto L_0x0066;
            r8.validPadding = r9;
            return;
            r9 = move-exception;
            r0 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r2 = "Illegal alphabet ";
            r1.<init>(r2);
            r2 = new java.lang.String;
            r2.<init>(r10);
            r1.append(r2);
            r10 = r1.toString();
            r0.<init>(r10, r9);
            throw r0;
            r9 = move-exception;
            r0 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r2 = "Illegal alphabet length ";
            r1.<init>(r2);
            r10 = r10.length;
            r1.append(r10);
            r10 = r1.toString();
            r0.<init>(r10, r9);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding$Alphabet.<init>(java.lang.String, char[]):void");
        }

        private boolean hasLowerCase() {
            for (char isLowerCase : this.chars) {
                if (Ascii.isLowerCase(isLowerCase)) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasUpperCase() {
            for (char isUpperCase : this.chars) {
                if (Ascii.isUpperCase(isUpperCase)) {
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: final */
        public final int decode(char c) {
            String str = "Unrecognized character: 0x";
            StringBuilder stringBuilder;
            if (c <= 127) {
                byte b = this.decodabet[c];
                if (b != (byte) -1) {
                    return b;
                }
                if (c <= ' ' || c == 127) {
                    stringBuilder = new StringBuilder(str);
                    stringBuilder.append(Integer.toHexString(c));
                    throw new DecodingException(stringBuilder.toString());
                }
                throw new DecodingException("Unrecognized character: ".concat(String.valueOf(c)));
            }
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(Integer.toHexString(c));
            throw new DecodingException(stringBuilder.toString());
        }

        /* Access modifiers changed, original: final */
        public final char encode(int i) {
            return this.chars[i];
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Alphabet)) {
                return false;
            }
            return Arrays.equals(this.chars, ((Alphabet) obj).chars);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.chars);
        }

        /* Access modifiers changed, original: final */
        public final boolean isValidPaddingStartPosition(int i) {
            return this.validPadding[i % this.charsPerChunk];
        }

        /* Access modifiers changed, original: final */
        public final Alphabet lowerCase() {
            if (!hasUpperCase()) {
                return this;
            }
            Preconditions.checkState(hasLowerCase() ^ 1, "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i < cArr2.length) {
                    cArr[i] = Ascii.toLowerCase(cArr2[i]);
                    i++;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.name);
                    stringBuilder.append(".lowerCase()");
                    return new Alphabet(stringBuilder.toString(), cArr);
                }
            }
        }

        public final boolean matches(char c) {
            byte[] bArr = this.decodabet;
            return c < bArr.length && bArr[c] != (byte) -1;
        }

        public final String toString() {
            return this.name;
        }
    }

    static {
        Character valueOf = Character.valueOf('=');
        BASE64 = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        BASE64_URL = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        BASE32 = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        BASE32_HEX = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
    }

    BaseEncoding() {
    }

    public static BaseEncoding base16() {
        return BASE16;
    }

    public static BaseEncoding base32() {
        return BASE32;
    }

    public static BaseEncoding base32Hex() {
        return BASE32_HEX;
    }

    public static BaseEncoding base64() {
        return BASE64;
    }

    public static BaseEncoding base64Url() {
        return BASE64_URL;
    }

    private static byte[] extract(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public final byte[] decode(CharSequence charSequence) {
        try {
            return decodeChecked(charSequence);
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* Access modifiers changed, original: final */
    public final byte[] decodeChecked(CharSequence charSequence) {
        charSequence = trimTrailingPadding(charSequence);
        byte[] bArr = new byte[maxDecodedSize(charSequence.length())];
        return extract(bArr, decodeTo(bArr, charSequence));
    }

    public abstract int decodeTo(byte[] bArr, CharSequence charSequence);

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public final String encode(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        StringBuilder stringBuilder = new StringBuilder(maxEncodedSize(i2));
        try {
            encodeTo(stringBuilder, bArr, i, i2);
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public abstract void encodeTo(Appendable appendable, byte[] bArr, int i, int i2);

    public abstract BaseEncoding lowerCase();

    public abstract int maxDecodedSize(int i);

    public abstract int maxEncodedSize(int i);

    /* Access modifiers changed, original: 0000 */
    public CharSequence trimTrailingPadding(CharSequence charSequence) {
        return (CharSequence) Preconditions.checkNotNull(charSequence);
    }
}

package com.google.protobuf;

import java.nio.ByteBuffer;
import org.opencv.imgproc.Imgproc;

final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    public static final int COMPLETE = 0;
    public static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor = (UnsafeProcessor.isAvailable() ? new UnsafeProcessor() : new SafeProcessor());

    static abstract class Processor {
        Processor() {
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            i += Utf8.estimateConsecutiveAscii(byteBuffer, i, i2);
            while (i < i2) {
                int i3 = i + 1;
                byte b = byteBuffer.get(i);
                if (b < (byte) 0) {
                    if (b >= (byte) -32) {
                        byte b2;
                        if (b < (byte) -16) {
                            if (i3 < i2 - 1) {
                                int i4 = i3 + 1;
                                b2 = byteBuffer.get(i3);
                                if (b2 > (byte) -65 || ((b == (byte) -32 && b2 < (byte) -96) || ((b == (byte) -19 && b2 >= (byte) -96) || byteBuffer.get(i4) > (byte) -65))) {
                                    return -1;
                                }
                                i = i4 + 1;
                            }
                        } else if (i3 < i2 - 2) {
                            int i5 = i3 + 1;
                            b2 = byteBuffer.get(i3);
                            if (b2 <= (byte) -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                                i = i5 + 1;
                                if (byteBuffer.get(i5) <= (byte) -65) {
                                    i3 = i + 1;
                                    if (byteBuffer.get(i) > (byte) -65) {
                                    }
                                }
                            }
                            return -1;
                        }
                        return Utf8.incompleteStateFor(byteBuffer, b, i3, i2 - i3);
                    } else if (i3 >= i2) {
                        return b;
                    } else {
                        if (b < (byte) -62 || byteBuffer.get(i3) > (byte) -65) {
                            return -1;
                        }
                        i = i3 + 1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* Access modifiers changed, original: final */
        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:65:0x00f5 in {6, 9, 15, 21, 22, 28, 44, 45, 47, 48, 49, 52, 58, 59, 61, 63, 64} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final void encodeUtf8Default(java.lang.CharSequence r8, java.nio.ByteBuffer r9) {
            /*
            r7 = this;
            r0 = r8.length();
            r1 = r9.position();
            r2 = 0;
            r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            if (r2 >= r0) goto L_0x001c;
            r4 = r8.charAt(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            if (r4 >= r3) goto L_0x001c;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r3 = r1 + r2;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r4 = (byte) r4;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r9.put(r3, r4);	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r2 = r2 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            goto L_0x0009;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            if (r2 != r0) goto L_0x0024;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r0 = r1 + r2;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r9.position(r0);	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            return;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r1 = r1 + r2;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            if (r2 >= r0) goto L_0x00c1;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r4 = r8.charAt(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            if (r4 >= r3) goto L_0x0033;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r4 = (byte) r4;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r9.put(r1, r4);	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            goto L_0x00bb;
            r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
            if (r4 >= r5) goto L_0x004c;
            r5 = r1 + 1;
            r6 = r4 >>> 6;
            r6 = r6 | 192;
            r6 = (byte) r6;
            r9.put(r1, r6);	 Catch:{ IndexOutOfBoundsException -> 0x004a }
            r1 = r4 & 63;	 Catch:{ IndexOutOfBoundsException -> 0x004a }
            r1 = r1 | r3;	 Catch:{ IndexOutOfBoundsException -> 0x004a }
            r1 = (byte) r1;	 Catch:{ IndexOutOfBoundsException -> 0x004a }
            r9.put(r5, r1);	 Catch:{ IndexOutOfBoundsException -> 0x004a }
            r1 = r5;
            goto L_0x00bb;
            r1 = r5;
            goto L_0x00c5;
            r5 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
            if (r4 < r5) goto L_0x009f;
            r5 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
            if (r5 >= r4) goto L_0x0057;
            goto L_0x009f;
            r5 = r2 + 1;
            if (r5 == r0) goto L_0x0099;
            r2 = r8.charAt(r5);	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            r6 = java.lang.Character.isSurrogatePair(r4, r2);	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            if (r6 == 0) goto L_0x0095;	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            r2 = java.lang.Character.toCodePoint(r4, r2);	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            r4 = r1 + 1;
            r6 = r2 >>> 18;
            r6 = r6 | 240;
            r6 = (byte) r6;
            r9.put(r1, r6);	 Catch:{ IndexOutOfBoundsException -> 0x0093 }
            r1 = r4 + 1;
            r6 = r2 >>> 12;
            r6 = r6 & 63;
            r6 = r6 | r3;
            r6 = (byte) r6;
            r9.put(r4, r6);	 Catch:{ IndexOutOfBoundsException -> 0x0097 }
            r4 = r1 + 1;
            r6 = r2 >>> 6;
            r6 = r6 & 63;
            r6 = r6 | r3;
            r6 = (byte) r6;
            r9.put(r1, r6);	 Catch:{ IndexOutOfBoundsException -> 0x0093 }
            r1 = r2 & 63;	 Catch:{ IndexOutOfBoundsException -> 0x0093 }
            r1 = r1 | r3;	 Catch:{ IndexOutOfBoundsException -> 0x0093 }
            r1 = (byte) r1;	 Catch:{ IndexOutOfBoundsException -> 0x0093 }
            r9.put(r4, r1);	 Catch:{ IndexOutOfBoundsException -> 0x0093 }
            r1 = r4;
            r2 = r5;
            goto L_0x00bb;
            r1 = r4;
            goto L_0x0097;
            r2 = r5;
            goto L_0x0099;
            r2 = r5;
            goto L_0x00c5;
            r3 = new com.google.protobuf.Utf8$UnpairedSurrogateException;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r3.<init>(r2, r0);	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            throw r3;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r5 = r1 + 1;
            r6 = r4 >>> 12;
            r6 = r6 | 224;
            r6 = (byte) r6;
            r9.put(r1, r6);	 Catch:{ IndexOutOfBoundsException -> 0x004a }
            r1 = r5 + 1;
            r6 = r4 >>> 6;
            r6 = r6 & 63;
            r6 = r6 | r3;
            r6 = (byte) r6;
            r9.put(r5, r6);	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r4 = r4 & 63;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r4 = r4 | r3;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r4 = (byte) r4;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r9.put(r1, r4);	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r2 = r2 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r1 = r1 + 1;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            goto L_0x0025;	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            r9.position(r1);	 Catch:{ IndexOutOfBoundsException -> 0x00c5 }
            return;
            r0 = r9.position();
            r9 = r9.position();
            r1 = r1 - r9;
            r1 = r1 + 1;
            r9 = java.lang.Math.max(r2, r1);
            r0 = r0 + r9;
            r9 = new java.lang.ArrayIndexOutOfBoundsException;
            r1 = new java.lang.StringBuilder;
            r3 = "Failed writing ";
            r1.<init>(r3);
            r8 = r8.charAt(r2);
            r1.append(r8);
            r8 = " at index ";
            r1.append(r8);
            r1.append(r0);
            r8 = r1.toString();
            r9.<init>(r8);
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8$Processor.encodeUtf8Default(java.lang.CharSequence, java.nio.ByteBuffer):void");
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        /* Access modifiers changed, original: final */
        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
            return partialIsValidUtf8(0, byteBuffer, i, i2) == 0;
        }

        /* Access modifiers changed, original: final */
        public final boolean isValidUtf8(byte[] bArr, int i, int i2) {
            return partialIsValidUtf8(0, bArr, i, i2) == 0;
        }

        /* Access modifiers changed, original: final */
        public final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i, byteBuffer, i2, i3) : partialIsValidUtf8Default(i, byteBuffer, i2, i3);
            } else {
                int arrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            }
        }

        public abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:8:0x0017, code skipped:
            if (r8.get(r9) > (byte) -65) goto L_0x0019;
     */
        /* JADX WARNING: Missing block: B:27:0x0048, code skipped:
            if (r8.get(r9) > (byte) -65) goto L_0x004a;
     */
        /* JADX WARNING: Missing block: B:47:0x0086, code skipped:
            if (r8.get(r7) > (byte) -65) goto L_0x0088;
     */
        public final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
            r6 = this;
            if (r7 == 0) goto L_0x0089;
        L_0x0002:
            if (r9 < r10) goto L_0x0005;
        L_0x0004:
            return r7;
        L_0x0005:
            r0 = (byte) r7;
            r1 = -32;
            r2 = -1;
            r3 = -65;
            if (r0 >= r1) goto L_0x001a;
        L_0x000d:
            r7 = -62;
            if (r0 < r7) goto L_0x0019;
        L_0x0011:
            r7 = r9 + 1;
            r9 = r8.get(r9);
            if (r9 <= r3) goto L_0x008a;
        L_0x0019:
            return r2;
        L_0x001a:
            r4 = -16;
            if (r0 >= r4) goto L_0x004b;
        L_0x001e:
            r7 = r7 >> 8;
            r7 = r7 ^ r2;
            r7 = (byte) r7;
            if (r7 != 0) goto L_0x0034;
        L_0x0024:
            r7 = r9 + 1;
            r9 = r8.get(r9);
            if (r7 < r10) goto L_0x0031;
        L_0x002c:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r9);
            return r7;
        L_0x0031:
            r5 = r9;
            r9 = r7;
            r7 = r5;
        L_0x0034:
            if (r7 > r3) goto L_0x004a;
        L_0x0036:
            r4 = -96;
            if (r0 != r1) goto L_0x003c;
        L_0x003a:
            if (r7 < r4) goto L_0x004a;
        L_0x003c:
            r1 = -19;
            if (r0 != r1) goto L_0x0042;
        L_0x0040:
            if (r7 >= r4) goto L_0x004a;
        L_0x0042:
            r7 = r9 + 1;
            r9 = r8.get(r9);
            if (r9 <= r3) goto L_0x008a;
        L_0x004a:
            return r2;
        L_0x004b:
            r1 = r7 >> 8;
            r1 = r1 ^ r2;
            r1 = (byte) r1;
            r4 = 0;
            if (r1 != 0) goto L_0x005f;
        L_0x0052:
            r7 = r9 + 1;
            r1 = r8.get(r9);
            if (r7 < r10) goto L_0x0063;
        L_0x005a:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r1);
            return r7;
        L_0x005f:
            r7 = r7 >> 16;
            r4 = (byte) r7;
            r7 = r9;
        L_0x0063:
            if (r4 != 0) goto L_0x0073;
        L_0x0065:
            r9 = r7 + 1;
            r4 = r8.get(r7);
            if (r9 < r10) goto L_0x0072;
        L_0x006d:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r1, r4);
            return r7;
        L_0x0072:
            r7 = r9;
        L_0x0073:
            if (r1 > r3) goto L_0x0088;
        L_0x0075:
            r9 = r0 << 28;
            r1 = r1 + 112;
            r9 = r9 + r1;
            r9 = r9 >> 30;
            if (r9 != 0) goto L_0x0088;
        L_0x007e:
            if (r4 > r3) goto L_0x0088;
        L_0x0080:
            r9 = r7 + 1;
            r7 = r8.get(r7);
            if (r7 <= r3) goto L_0x0089;
        L_0x0088:
            return r2;
        L_0x0089:
            r7 = r9;
        L_0x008a:
            r7 = partialIsValidUtf8(r8, r7, r10);
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8$Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i, int i2) {
            StringBuilder stringBuilder = new StringBuilder("Unpaired surrogate at index ");
            stringBuilder.append(i);
            stringBuilder.append(" of ");
            stringBuilder.append(i2);
            super(stringBuilder.toString());
        }
    }

    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= (byte) 0) {
                i++;
            }
            return i >= i2 ? 0 : partialIsValidUtf8NonAscii(bArr, i, i2);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < (byte) 0) {
                    byte b2;
                    if (b < (byte) -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= (byte) -62) {
                            i = i3 + 1;
                            if (bArr[i3] > (byte) -65) {
                            }
                        }
                        return -1;
                    } else if (b < (byte) -16) {
                        if (i3 >= i2 - 1) {
                            return Utf8.incompleteStateFor(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        b2 = bArr[i3];
                        if (b2 <= (byte) -65 && ((b != (byte) -32 || b2 >= (byte) -96) && (b != (byte) -19 || b2 < (byte) -96))) {
                            i = i4 + 1;
                            if (bArr[i4] > (byte) -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return Utf8.incompleteStateFor(bArr, i3, i2);
                    } else {
                        int i5 = i3 + 1;
                        b2 = bArr[i3];
                        if (b2 <= (byte) -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            i = i5 + 1;
                            if (bArr[i5] <= (byte) -65) {
                                i3 = i + 1;
                                if (bArr[i] > (byte) -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        /* Access modifiers changed, original: final */
        public final int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int length = charSequence.length();
            i2 += i;
            int i4 = 0;
            while (i4 < length) {
                i3 = i4 + i;
                if (i3 >= i2) {
                    break;
                }
                char charAt = charSequence.charAt(i4);
                if (charAt >= 128) {
                    break;
                }
                bArr[i3] = (byte) charAt;
                i4++;
            }
            if (i4 == length) {
                return i + length;
            }
            i += i4;
            while (i4 < length) {
                int i5;
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < 128 && i < i2) {
                    i5 = i + 1;
                    bArr[i] = (byte) charAt2;
                } else if (charAt2 < 2048 && i <= i2 - 2) {
                    i5 = i + 1;
                    bArr[i] = (byte) ((charAt2 >>> 6) | 960);
                    i = i5 + 1;
                    bArr[i5] = (byte) ((charAt2 & 63) | 128);
                    i4++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i <= i2 - 3) {
                    i5 = i + 1;
                    bArr[i] = (byte) ((charAt2 >>> 12) | 480);
                    i = i5 + 1;
                    bArr[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i5 = i + 1;
                    bArr[i] = (byte) ((charAt2 & 63) | 128);
                } else if (i <= i2 - 4) {
                    i5 = i4 + 1;
                    if (i5 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i5);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            i4 = Character.toCodePoint(charAt2, charAt3);
                            i3 = i + 1;
                            bArr[i] = (byte) ((i4 >>> 18) | 240);
                            i = i3 + 1;
                            bArr[i3] = (byte) (((i4 >>> 12) & 63) | 128);
                            i3 = i + 1;
                            bArr[i] = (byte) (((i4 >>> 6) & 63) | 128);
                            i = i3 + 1;
                            bArr[i3] = (byte) ((i4 & 63) | 128);
                            i4 = i5;
                            i4++;
                        } else {
                            i4 = i5;
                        }
                    }
                    throw new UnpairedSurrogateException(i4 - 1, length);
                } else {
                    if (55296 <= charAt2 && charAt2 <= 57343) {
                        int i6 = i4 + 1;
                        if (i6 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i6))) {
                            throw new UnpairedSurrogateException(i4, length);
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder("Failed writing ");
                    stringBuilder.append(charAt2);
                    stringBuilder.append(" at index ");
                    stringBuilder.append(i);
                    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                }
                i = i5;
                i4++;
            }
            return i;
        }

        /* Access modifiers changed, original: final */
        public final void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:8:0x0015, code skipped:
            if (r8[r9] > (byte) -65) goto L_0x0017;
     */
        /* JADX WARNING: Missing block: B:27:0x0042, code skipped:
            if (r8[r9] > (byte) -65) goto L_0x0044;
     */
        /* JADX WARNING: Missing block: B:47:0x007a, code skipped:
            if (r8[r7] > (byte) -65) goto L_0x007c;
     */
        public final int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
            r6 = this;
            if (r7 == 0) goto L_0x007d;
        L_0x0002:
            if (r9 < r10) goto L_0x0005;
        L_0x0004:
            return r7;
        L_0x0005:
            r0 = (byte) r7;
            r1 = -32;
            r2 = -1;
            r3 = -65;
            if (r0 >= r1) goto L_0x0018;
        L_0x000d:
            r7 = -62;
            if (r0 < r7) goto L_0x0017;
        L_0x0011:
            r7 = r9 + 1;
            r9 = r8[r9];
            if (r9 <= r3) goto L_0x007e;
        L_0x0017:
            return r2;
        L_0x0018:
            r4 = -16;
            if (r0 >= r4) goto L_0x0045;
        L_0x001c:
            r7 = r7 >> 8;
            r7 = r7 ^ r2;
            r7 = (byte) r7;
            if (r7 != 0) goto L_0x0030;
        L_0x0022:
            r7 = r9 + 1;
            r9 = r8[r9];
            if (r7 < r10) goto L_0x002d;
        L_0x0028:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r9);
            return r7;
        L_0x002d:
            r5 = r9;
            r9 = r7;
            r7 = r5;
        L_0x0030:
            if (r7 > r3) goto L_0x0044;
        L_0x0032:
            r4 = -96;
            if (r0 != r1) goto L_0x0038;
        L_0x0036:
            if (r7 < r4) goto L_0x0044;
        L_0x0038:
            r1 = -19;
            if (r0 != r1) goto L_0x003e;
        L_0x003c:
            if (r7 >= r4) goto L_0x0044;
        L_0x003e:
            r7 = r9 + 1;
            r9 = r8[r9];
            if (r9 <= r3) goto L_0x007e;
        L_0x0044:
            return r2;
        L_0x0045:
            r1 = r7 >> 8;
            r1 = r1 ^ r2;
            r1 = (byte) r1;
            r4 = 0;
            if (r1 != 0) goto L_0x0057;
        L_0x004c:
            r7 = r9 + 1;
            r1 = r8[r9];
            if (r7 < r10) goto L_0x005b;
        L_0x0052:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r1);
            return r7;
        L_0x0057:
            r7 = r7 >> 16;
            r4 = (byte) r7;
            r7 = r9;
        L_0x005b:
            if (r4 != 0) goto L_0x0069;
        L_0x005d:
            r9 = r7 + 1;
            r4 = r8[r7];
            if (r9 < r10) goto L_0x0068;
        L_0x0063:
            r7 = com.google.protobuf.Utf8.incompleteStateFor(r0, r1, r4);
            return r7;
        L_0x0068:
            r7 = r9;
        L_0x0069:
            if (r1 > r3) goto L_0x007c;
        L_0x006b:
            r9 = r0 << 28;
            r1 = r1 + 112;
            r9 = r9 + r1;
            r9 = r9 >> 30;
            if (r9 != 0) goto L_0x007c;
        L_0x0074:
            if (r4 > r3) goto L_0x007c;
        L_0x0076:
            r9 = r7 + 1;
            r7 = r8[r7];
            if (r7 <= r3) goto L_0x007d;
        L_0x007c:
            return r2;
        L_0x007d:
            r7 = r9;
        L_0x007e:
            r7 = partialIsValidUtf8(r8, r7, r10);
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8$SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* Access modifiers changed, original: final */
        public final int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }
    }

    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* JADX WARNING: Missing block: B:19:0x0039, code skipped:
            return -1;
     */
        /* JADX WARNING: Missing block: B:36:0x0064, code skipped:
            return -1;
     */
        private static int partialIsValidUtf8(long r8, int r10) {
            /*
            r0 = unsafeEstimateConsecutiveAscii(r8, r10);
            r1 = (long) r0;
            r8 = r8 + r1;
            r10 = r10 - r0;
        L_0x0007:
            r0 = 0;
            r1 = 0;
        L_0x0009:
            r2 = 1;
            if (r10 <= 0) goto L_0x001a;
        L_0x000d:
            r4 = r8 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r8);
            if (r1 < 0) goto L_0x0019;
        L_0x0015:
            r10 = r10 + -1;
            r8 = r4;
            goto L_0x0009;
        L_0x0019:
            r8 = r4;
        L_0x001a:
            if (r10 != 0) goto L_0x001d;
        L_0x001c:
            return r0;
        L_0x001d:
            r10 = r10 + -1;
            r0 = -32;
            r4 = -65;
            r5 = -1;
            if (r1 >= r0) goto L_0x003a;
        L_0x0026:
            if (r10 != 0) goto L_0x0029;
        L_0x0028:
            return r1;
        L_0x0029:
            r10 = r10 + -1;
            r0 = -62;
            if (r1 < r0) goto L_0x0039;
        L_0x002f:
            r2 = r2 + r8;
            r8 = com.google.protobuf.UnsafeUtil.getByte(r8);
            if (r8 <= r4) goto L_0x0037;
        L_0x0036:
            goto L_0x0039;
        L_0x0037:
            r8 = r2;
            goto L_0x0007;
        L_0x0039:
            return r5;
        L_0x003a:
            r6 = -16;
            if (r1 >= r6) goto L_0x0065;
        L_0x003e:
            r6 = 2;
            if (r10 >= r6) goto L_0x0046;
        L_0x0041:
            r8 = unsafeIncompleteStateFor(r8, r1, r10);
            return r8;
        L_0x0046:
            r10 = r10 + -2;
            r6 = r8 + r2;
            r8 = com.google.protobuf.UnsafeUtil.getByte(r8);
            if (r8 > r4) goto L_0x0064;
        L_0x0050:
            r9 = -96;
            if (r1 != r0) goto L_0x0056;
        L_0x0054:
            if (r8 < r9) goto L_0x0064;
        L_0x0056:
            r0 = -19;
            if (r1 != r0) goto L_0x005c;
        L_0x005a:
            if (r8 >= r9) goto L_0x0064;
        L_0x005c:
            r8 = r6 + r2;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r6);
            if (r0 <= r4) goto L_0x0007;
        L_0x0064:
            return r5;
        L_0x0065:
            r0 = 3;
            if (r10 >= r0) goto L_0x006d;
        L_0x0068:
            r8 = unsafeIncompleteStateFor(r8, r1, r10);
            return r8;
        L_0x006d:
            r10 = r10 + -3;
            r6 = r8 + r2;
            r8 = com.google.protobuf.UnsafeUtil.getByte(r8);
            if (r8 > r4) goto L_0x008f;
        L_0x0077:
            r9 = r1 << 28;
            r8 = r8 + 112;
            r9 = r9 + r8;
            r8 = r9 >> 30;
            if (r8 != 0) goto L_0x008f;
        L_0x0080:
            r8 = r6 + r2;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r6);
            if (r0 > r4) goto L_0x008f;
        L_0x0088:
            r2 = r2 + r8;
            r8 = com.google.protobuf.UnsafeUtil.getByte(r8);
            if (r8 <= r4) goto L_0x0037;
        L_0x008f:
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8$UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }

        /* JADX WARNING: Missing block: B:19:0x0039, code skipped:
            return -1;
     */
        /* JADX WARNING: Missing block: B:36:0x0064, code skipped:
            return -1;
     */
        private static int partialIsValidUtf8(byte[] r8, long r9, int r11) {
            /*
            r0 = unsafeEstimateConsecutiveAscii(r8, r9, r11);
            r11 = r11 - r0;
            r0 = (long) r0;
            r9 = r9 + r0;
        L_0x0007:
            r0 = 0;
            r1 = 0;
        L_0x0009:
            r2 = 1;
            if (r11 <= 0) goto L_0x001a;
        L_0x000d:
            r4 = r9 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r8, r9);
            if (r1 < 0) goto L_0x0019;
        L_0x0015:
            r11 = r11 + -1;
            r9 = r4;
            goto L_0x0009;
        L_0x0019:
            r9 = r4;
        L_0x001a:
            if (r11 != 0) goto L_0x001d;
        L_0x001c:
            return r0;
        L_0x001d:
            r11 = r11 + -1;
            r0 = -32;
            r4 = -65;
            r5 = -1;
            if (r1 >= r0) goto L_0x003a;
        L_0x0026:
            if (r11 != 0) goto L_0x0029;
        L_0x0028:
            return r1;
        L_0x0029:
            r11 = r11 + -1;
            r0 = -62;
            if (r1 < r0) goto L_0x0039;
        L_0x002f:
            r2 = r2 + r9;
            r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r9);
            if (r9 <= r4) goto L_0x0037;
        L_0x0036:
            goto L_0x0039;
        L_0x0037:
            r9 = r2;
            goto L_0x0007;
        L_0x0039:
            return r5;
        L_0x003a:
            r6 = -16;
            if (r1 >= r6) goto L_0x0065;
        L_0x003e:
            r6 = 2;
            if (r11 >= r6) goto L_0x0046;
        L_0x0041:
            r8 = unsafeIncompleteStateFor(r8, r1, r9, r11);
            return r8;
        L_0x0046:
            r11 = r11 + -2;
            r6 = r9 + r2;
            r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r9);
            if (r9 > r4) goto L_0x0064;
        L_0x0050:
            r10 = -96;
            if (r1 != r0) goto L_0x0056;
        L_0x0054:
            if (r9 < r10) goto L_0x0064;
        L_0x0056:
            r0 = -19;
            if (r1 != r0) goto L_0x005c;
        L_0x005a:
            if (r9 >= r10) goto L_0x0064;
        L_0x005c:
            r9 = r6 + r2;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r8, r6);
            if (r0 <= r4) goto L_0x0007;
        L_0x0064:
            return r5;
        L_0x0065:
            r0 = 3;
            if (r11 >= r0) goto L_0x006d;
        L_0x0068:
            r8 = unsafeIncompleteStateFor(r8, r1, r9, r11);
            return r8;
        L_0x006d:
            r11 = r11 + -3;
            r6 = r9 + r2;
            r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r9);
            if (r9 > r4) goto L_0x008f;
        L_0x0077:
            r10 = r1 << 28;
            r9 = r9 + 112;
            r10 = r10 + r9;
            r9 = r10 >> 30;
            if (r9 != 0) goto L_0x008f;
        L_0x0080:
            r9 = r6 + r2;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r8, r6);
            if (r0 > r4) goto L_0x008f;
        L_0x0088:
            r2 = r2 + r9;
            r9 = com.google.protobuf.UnsafeUtil.getByte(r8, r9);
            if (r9 <= r4) goto L_0x0037;
        L_0x008f:
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8$UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = ((int) j) & 7;
            long j2 = j;
            int i3 = i2;
            while (i3 > 0) {
                long j3 = 1 + j2;
                if (UnsafeUtil.getByte(j2) < (byte) 0) {
                    return i2 - i3;
                }
                i3--;
                j2 = j3;
            }
            i3 = i - i2;
            while (i3 >= 8 && (UnsafeUtil.getLong(j2) & Utf8.ASCII_MASK_LONG) == 0) {
                j2 += 8;
                i3 -= 8;
            }
            return i - i3;
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = ((int) j) & 7;
            long j2 = j;
            int i3 = i2;
            while (i3 > 0) {
                long j3 = 1 + j2;
                if (UnsafeUtil.getByte(bArr, j2) < (byte) 0) {
                    return i2 - i3;
                }
                i3--;
                j2 = j3;
            }
            i3 = i - i2;
            while (i3 >= 8 && (UnsafeUtil.getLong(bArr, j2) & Utf8.ASCII_MASK_LONG) == 0) {
                j2 += 8;
                i3 -= 8;
            }
            return i - i3;
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j));
            }
            if (i2 == 2) {
                return Utf8.incompleteStateFor(i, (int) UnsafeUtil.getByte(j), (int) UnsafeUtil.getByte(j + 1));
            }
            throw new AssertionError();
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i2 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.incompleteStateFor(i, (int) UnsafeUtil.getByte(bArr, j), (int) UnsafeUtil.getByte(bArr, j + 1));
            }
            throw new AssertionError();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:54:0x0169 in {9, 12, 18, 19, 24, 27, 30, 37, 38, 39, 41, 47, 49, 51, 53} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final int encodeUtf8(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
            /*
            r22 = this;
            r0 = r23;
            r1 = r24;
            r2 = r25;
            r3 = r26;
            r4 = com.google.protobuf.UnsafeUtil.getArrayBaseOffset();
            r6 = (long) r2;
            r4 = r4 + r6;
            r6 = (long) r3;
            r6 = r6 + r4;
            r8 = r23.length();
            r9 = " at index ";
            r10 = "Failed writing ";
            if (r8 > r3) goto L_0x0149;
            r11 = r1.length;
            r11 = r11 - r3;
            if (r11 < r2) goto L_0x0149;
            r2 = 0;
            r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r11 = 1;
            if (r2 >= r8) goto L_0x0034;
            r13 = r0.charAt(r2);
            if (r13 >= r3) goto L_0x0034;
            r11 = r11 + r4;
            r3 = (byte) r13;
            com.google.protobuf.UnsafeUtil.putByte(r1, r4, r3);
            r2 = r2 + 1;
            r4 = r11;
            goto L_0x001f;
            if (r2 != r8) goto L_0x003d;
            r0 = com.google.protobuf.UnsafeUtil.getArrayBaseOffset();
            r4 = r4 - r0;
            r0 = (int) r4;
            return r0;
            if (r2 >= r8) goto L_0x0036;
            r13 = r0.charAt(r2);
            if (r13 >= r3) goto L_0x0055;
            r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r14 >= 0) goto L_0x0055;
            r14 = r4 + r11;
            r13 = (byte) r13;
            com.google.protobuf.UnsafeUtil.putByte(r1, r4, r13);
            r4 = r11;
            r12 = r14;
            r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            goto L_0x0105;
            r14 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
            if (r13 >= r14) goto L_0x007f;
            r14 = 2;
            r14 = r6 - r14;
            r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1));
            if (r16 > 0) goto L_0x007f;
            r14 = r4 + r11;
            r3 = r13 >>> 6;
            r3 = r3 | 960;
            r3 = (byte) r3;
            com.google.protobuf.UnsafeUtil.putByte(r1, r4, r3);
            r3 = r14 + r11;
            r5 = r13 & 63;
            r13 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r5 = r5 | r13;
            r5 = (byte) r5;
            com.google.protobuf.UnsafeUtil.putByte(r1, r14, r5);
            r20 = r11;
            r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r12 = r3;
            r4 = r20;
            goto L_0x0105;
            r3 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
            r14 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
            if (r13 < r14) goto L_0x0089;
            if (r3 >= r13) goto L_0x00b8;
            r15 = 3;
            r15 = r6 - r15;
            r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1));
            if (r17 > 0) goto L_0x00b8;
            r14 = r4 + r11;
            r3 = r13 >>> 12;
            r3 = r3 | 480;
            r3 = (byte) r3;
            com.google.protobuf.UnsafeUtil.putByte(r1, r4, r3);
            r3 = r14 + r11;
            r5 = r13 >>> 6;
            r5 = r5 & 63;
            r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r5 = r5 | r11;
            r5 = (byte) r5;
            com.google.protobuf.UnsafeUtil.putByte(r1, r14, r5);
            r14 = 1;
            r18 = r3 + r14;
            r5 = r13 & 63;
            r5 = r5 | r11;
            r5 = (byte) r5;
            com.google.protobuf.UnsafeUtil.putByte(r1, r3, r5);
            r12 = r18;
            r4 = 1;
            goto L_0x0051;
            r11 = 4;
            r11 = r6 - r11;
            r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1));
            if (r15 > 0) goto L_0x0119;
            r3 = r2 + 1;
            if (r3 == r8) goto L_0x0111;
            r2 = r0.charAt(r3);
            r11 = java.lang.Character.isSurrogatePair(r13, r2);
            if (r11 == 0) goto L_0x0110;
            r2 = java.lang.Character.toCodePoint(r13, r2);
            r11 = 1;
            r13 = r4 + r11;
            r15 = r2 >>> 18;
            r15 = r15 | 240;
            r15 = (byte) r15;
            com.google.protobuf.UnsafeUtil.putByte(r1, r4, r15);
            r4 = r13 + r11;
            r15 = r2 >>> 12;
            r15 = r15 & 63;
            r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r12 = r15 | 128;
            r12 = (byte) r12;
            com.google.protobuf.UnsafeUtil.putByte(r1, r13, r12);
            r12 = 1;
            r14 = r4 + r12;
            r16 = r2 >>> 6;
            r12 = r16 & 63;
            r12 = r12 | r11;
            r12 = (byte) r12;
            com.google.protobuf.UnsafeUtil.putByte(r1, r4, r12);
            r4 = 1;
            r12 = r14 + r4;
            r2 = r2 & 63;
            r2 = r2 | r11;
            r2 = (byte) r2;
            com.google.protobuf.UnsafeUtil.putByte(r1, r14, r2);
            r2 = r3;
            r2 = r2 + 1;
            r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r20 = r4;
            r4 = r12;
            r11 = r20;
            goto L_0x003d;
            r2 = r3;
            r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException;
            r2 = r2 + -1;
            r0.<init>(r2, r8);
            throw r0;
            if (r14 > r13) goto L_0x0131;
            if (r13 > r3) goto L_0x0131;
            r1 = r2 + 1;
            if (r1 == r8) goto L_0x012b;
            r0 = r0.charAt(r1);
            r0 = java.lang.Character.isSurrogatePair(r13, r0);
            if (r0 != 0) goto L_0x0131;
            r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException;
            r0.<init>(r2, r8);
            throw r0;
            r0 = new java.lang.ArrayIndexOutOfBoundsException;
            r1 = new java.lang.StringBuilder;
            r1.<init>(r10);
            r1.append(r13);
            r1.append(r9);
            r1.append(r4);
            r1 = r1.toString();
            r0.<init>(r1);
            throw r0;
            r1 = new java.lang.ArrayIndexOutOfBoundsException;
            r4 = new java.lang.StringBuilder;
            r4.<init>(r10);
            r8 = r8 + -1;
            r0 = r0.charAt(r8);
            r4.append(r0);
            r4.append(r9);
            r0 = r2 + r3;
            r4.append(r0);
            r0 = r4.toString();
            r1.<init>(r0);
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8$UnsafeProcessor.encodeUtf8(java.lang.CharSequence, byte[], int, int):int");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:54:0x016d in {7, 9, 11, 17, 22, 23, 26, 29, 36, 37, 38, 40, 46, 48, 50, 51, 53} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final void encodeUtf8Direct(java.lang.CharSequence r22, java.nio.ByteBuffer r23) {
            /*
            r21 = this;
            r0 = r22;
            r1 = r23;
            r2 = com.google.protobuf.UnsafeUtil.addressOffset(r23);
            r4 = r23.position();
            r4 = (long) r4;
            r4 = r4 + r2;
            r6 = r23.limit();
            r6 = (long) r6;
            r6 = r6 + r2;
            r8 = r22.length();
            r9 = (long) r8;
            r11 = r6 - r4;
            r13 = " at index ";
            r14 = "Failed writing ";
            r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
            if (r15 > 0) goto L_0x014b;
            r9 = 0;
            r10 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r11 = 1;
            if (r9 >= r8) goto L_0x0039;
            r15 = r0.charAt(r9);
            if (r15 >= r10) goto L_0x0039;
            r11 = r11 + r4;
            r10 = (byte) r15;
            com.google.protobuf.UnsafeUtil.putByte(r4, r10);
            r9 = r9 + 1;
            r4 = r11;
            goto L_0x0024;
            if (r9 != r8) goto L_0x0041;
            r4 = r4 - r2;
            r0 = (int) r4;
            r1.position(r0);
            return;
            if (r9 >= r8) goto L_0x0142;
            r15 = r0.charAt(r9);
            if (r15 >= r10) goto L_0x005b;
            r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r16 >= 0) goto L_0x005b;
            r16 = r4 + r11;
            r15 = (byte) r15;
            com.google.protobuf.UnsafeUtil.putByte(r4, r15);
            r4 = r16;
            r15 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r17 = r2;
            goto L_0x00ff;
            r10 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
            if (r15 >= r10) goto L_0x0082;
            r17 = 2;
            r17 = r6 - r17;
            r10 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1));
            if (r10 > 0) goto L_0x0082;
            r17 = r2;
            r1 = r4 + r11;
            r3 = r15 >>> 6;
            r3 = r3 | 960;
            r3 = (byte) r3;
            com.google.protobuf.UnsafeUtil.putByte(r4, r3);
            r3 = r1 + r11;
            r5 = r15 & 63;
            r10 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r5 = r5 | r10;
            r5 = (byte) r5;
            com.google.protobuf.UnsafeUtil.putByte(r1, r5);
            r4 = r3;
            r15 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            goto L_0x00ff;
            r17 = r2;
            r1 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
            r2 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
            if (r15 < r2) goto L_0x008e;
            if (r1 >= r15) goto L_0x00b8;
            r19 = 3;
            r19 = r6 - r19;
            r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1));
            if (r3 > 0) goto L_0x00b8;
            r1 = r4 + r11;
            r3 = r15 >>> 12;
            r3 = r3 | 480;
            r3 = (byte) r3;
            com.google.protobuf.UnsafeUtil.putByte(r4, r3);
            r3 = r1 + r11;
            r5 = r15 >>> 6;
            r5 = r5 & 63;
            r10 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r5 = r5 | r10;
            r5 = (byte) r5;
            com.google.protobuf.UnsafeUtil.putByte(r1, r5);
            r1 = r3 + r11;
            r5 = r15 & 63;
            r5 = r5 | r10;
            r5 = (byte) r5;
            com.google.protobuf.UnsafeUtil.putByte(r3, r5);
            r4 = r1;
            goto L_0x007f;
            r19 = 4;
            r19 = r6 - r19;
            r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1));
            if (r3 > 0) goto L_0x0112;
            r1 = r9 + 1;
            if (r1 == r8) goto L_0x0109;
            r2 = r0.charAt(r1);
            r3 = java.lang.Character.isSurrogatePair(r15, r2);
            if (r3 == 0) goto L_0x010a;
            r2 = java.lang.Character.toCodePoint(r15, r2);
            r9 = r4 + r11;
            r3 = r2 >>> 18;
            r3 = r3 | 240;
            r3 = (byte) r3;
            com.google.protobuf.UnsafeUtil.putByte(r4, r3);
            r3 = r9 + r11;
            r5 = r2 >>> 12;
            r5 = r5 & 63;
            r15 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r5 = r5 | r15;
            r5 = (byte) r5;
            com.google.protobuf.UnsafeUtil.putByte(r9, r5);
            r9 = r3 + r11;
            r5 = r2 >>> 6;
            r5 = r5 & 63;
            r5 = r5 | r15;
            r5 = (byte) r5;
            com.google.protobuf.UnsafeUtil.putByte(r3, r5);
            r3 = r9 + r11;
            r2 = r2 & 63;
            r2 = r2 | r15;
            r2 = (byte) r2;
            com.google.protobuf.UnsafeUtil.putByte(r9, r2);
            r9 = r1;
            r4 = r3;
            r9 = r9 + 1;
            r1 = r23;
            r2 = r17;
            r10 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            goto L_0x0041;
            r1 = r9;
            r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException;
            r1 = r1 + -1;
            r0.<init>(r1, r8);
            throw r0;
            if (r2 > r15) goto L_0x012a;
            if (r15 > r1) goto L_0x012a;
            r1 = r9 + 1;
            if (r1 == r8) goto L_0x0124;
            r0 = r0.charAt(r1);
            r0 = java.lang.Character.isSurrogatePair(r15, r0);
            if (r0 != 0) goto L_0x012a;
            r0 = new com.google.protobuf.Utf8$UnpairedSurrogateException;
            r0.<init>(r9, r8);
            throw r0;
            r0 = new java.lang.ArrayIndexOutOfBoundsException;
            r1 = new java.lang.StringBuilder;
            r1.<init>(r14);
            r1.append(r15);
            r1.append(r13);
            r1.append(r4);
            r1 = r1.toString();
            r0.<init>(r1);
            throw r0;
            r17 = r2;
            r4 = r4 - r17;
            r0 = (int) r4;
            r1 = r23;
            goto L_0x003d;
            r2 = new java.lang.ArrayIndexOutOfBoundsException;
            r3 = new java.lang.StringBuilder;
            r3.<init>(r14);
            r8 = r8 + -1;
            r0 = r0.charAt(r8);
            r3.append(r0);
            r3.append(r13);
            r0 = r23.limit();
            r3.append(r0);
            r0 = r3.toString();
            r2.<init>(r0);
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8$UnsafeProcessor.encodeUtf8Direct(java.lang.CharSequence, java.nio.ByteBuffer):void");
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:12:0x002f, code skipped:
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r2) > (byte) -65) goto L_0x0031;
     */
        /* JADX WARNING: Missing block: B:31:0x0060, code skipped:
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r2) > (byte) -65) goto L_0x0062;
     */
        /* JADX WARNING: Missing block: B:52:0x00a2, code skipped:
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r2) > (byte) -65) goto L_0x00a4;
     */
        public final int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
            /*
            r11 = this;
            r0 = r14 | r15;
            r1 = r13.length;
            r1 = r1 - r15;
            r0 = r0 | r1;
            r1 = 0;
            if (r0 < 0) goto L_0x00ad;
        L_0x0008:
            r2 = com.google.protobuf.UnsafeUtil.getArrayBaseOffset();
            r4 = (long) r14;
            r2 = r2 + r4;
            r4 = com.google.protobuf.UnsafeUtil.getArrayBaseOffset();
            r14 = (long) r15;
            r4 = r4 + r14;
            if (r12 == 0) goto L_0x00a5;
        L_0x0016:
            r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r14 < 0) goto L_0x001b;
        L_0x001a:
            return r12;
        L_0x001b:
            r14 = (byte) r12;
            r15 = -32;
            r0 = -1;
            r6 = -65;
            r7 = 1;
            if (r14 >= r15) goto L_0x0032;
        L_0x0025:
            r12 = -62;
            if (r14 < r12) goto L_0x0031;
        L_0x0029:
            r14 = r2 + r7;
            r12 = com.google.protobuf.UnsafeUtil.getByte(r13, r2);
            if (r12 <= r6) goto L_0x00a6;
        L_0x0031:
            return r0;
        L_0x0032:
            r9 = -16;
            if (r14 >= r9) goto L_0x0063;
        L_0x0036:
            r12 = r12 >> 8;
            r12 = r12 ^ r0;
            r12 = (byte) r12;
            if (r12 != 0) goto L_0x004c;
        L_0x003c:
            r9 = r2 + r7;
            r12 = com.google.protobuf.UnsafeUtil.getByte(r13, r2);
            r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
            if (r1 < 0) goto L_0x004b;
        L_0x0046:
            r12 = com.google.protobuf.Utf8.incompleteStateFor(r14, r12);
            return r12;
        L_0x004b:
            r2 = r9;
        L_0x004c:
            if (r12 > r6) goto L_0x0062;
        L_0x004e:
            r1 = -96;
            if (r14 != r15) goto L_0x0054;
        L_0x0052:
            if (r12 < r1) goto L_0x0062;
        L_0x0054:
            r15 = -19;
            if (r14 != r15) goto L_0x005a;
        L_0x0058:
            if (r12 >= r1) goto L_0x0062;
        L_0x005a:
            r14 = r2 + r7;
            r12 = com.google.protobuf.UnsafeUtil.getByte(r13, r2);
            if (r12 <= r6) goto L_0x00a6;
        L_0x0062:
            return r0;
        L_0x0063:
            r15 = r12 >> 8;
            r15 = r15 ^ r0;
            r15 = (byte) r15;
            if (r15 != 0) goto L_0x007a;
        L_0x0069:
            r9 = r2 + r7;
            r15 = com.google.protobuf.UnsafeUtil.getByte(r13, r2);
            r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
            if (r12 < 0) goto L_0x0078;
        L_0x0073:
            r12 = com.google.protobuf.Utf8.incompleteStateFor(r14, r15);
            return r12;
        L_0x0078:
            r2 = r9;
            goto L_0x007d;
        L_0x007a:
            r12 = r12 >> 16;
            r1 = (byte) r12;
        L_0x007d:
            if (r1 != 0) goto L_0x008f;
        L_0x007f:
            r9 = r2 + r7;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r13, r2);
            r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
            if (r12 < 0) goto L_0x008e;
        L_0x0089:
            r12 = com.google.protobuf.Utf8.incompleteStateFor(r14, r15, r1);
            return r12;
        L_0x008e:
            r2 = r9;
        L_0x008f:
            if (r15 > r6) goto L_0x00a4;
        L_0x0091:
            r12 = r14 << 28;
            r15 = r15 + 112;
            r12 = r12 + r15;
            r12 = r12 >> 30;
            if (r12 != 0) goto L_0x00a4;
        L_0x009a:
            if (r1 > r6) goto L_0x00a4;
        L_0x009c:
            r14 = r2 + r7;
            r12 = com.google.protobuf.UnsafeUtil.getByte(r13, r2);
            if (r12 <= r6) goto L_0x00a6;
        L_0x00a4:
            return r0;
        L_0x00a5:
            r14 = r2;
        L_0x00a6:
            r4 = r4 - r14;
            r12 = (int) r4;
            r12 = partialIsValidUtf8(r13, r14, r12);
            return r12;
        L_0x00ad:
            r12 = new java.lang.ArrayIndexOutOfBoundsException;
            r0 = 3;
            r0 = new java.lang.Object[r0];
            r13 = r13.length;
            r13 = java.lang.Integer.valueOf(r13);
            r0[r1] = r13;
            r13 = 1;
            r14 = java.lang.Integer.valueOf(r14);
            r0[r13] = r14;
            r13 = 2;
            r14 = java.lang.Integer.valueOf(r15);
            r0[r13] = r14;
            r13 = "Array length=%d, index=%d, limit=%d";
            r13 = java.lang.String.format(r13, r0);
            r12.<init>(r13);
            throw r12;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8$UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:12:0x002f, code skipped:
            if (com.google.protobuf.UnsafeUtil.getByte(r2) > (byte) -65) goto L_0x0031;
     */
        /* JADX WARNING: Missing block: B:31:0x0060, code skipped:
            if (com.google.protobuf.UnsafeUtil.getByte(r2) > (byte) -65) goto L_0x0062;
     */
        /* JADX WARNING: Missing block: B:52:0x00a2, code skipped:
            if (com.google.protobuf.UnsafeUtil.getByte(r2) > (byte) -65) goto L_0x00a4;
     */
        public final int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
            r10 = this;
            r0 = r13 | r14;
            r1 = r12.limit();
            r1 = r1 - r14;
            r0 = r0 | r1;
            r1 = 0;
            if (r0 < 0) goto L_0x00ad;
        L_0x000b:
            r2 = com.google.protobuf.UnsafeUtil.addressOffset(r12);
            r4 = (long) r13;
            r2 = r2 + r4;
            r14 = r14 - r13;
            r12 = (long) r14;
            r12 = r12 + r2;
            if (r11 == 0) goto L_0x00a5;
        L_0x0016:
            r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
            if (r14 < 0) goto L_0x001b;
        L_0x001a:
            return r11;
        L_0x001b:
            r14 = (byte) r11;
            r0 = -32;
            r4 = -1;
            r5 = -65;
            r6 = 1;
            if (r14 >= r0) goto L_0x0032;
        L_0x0025:
            r11 = -62;
            if (r14 < r11) goto L_0x0031;
        L_0x0029:
            r0 = r2 + r6;
            r11 = com.google.protobuf.UnsafeUtil.getByte(r2);
            if (r11 <= r5) goto L_0x00a6;
        L_0x0031:
            return r4;
        L_0x0032:
            r8 = -16;
            if (r14 >= r8) goto L_0x0063;
        L_0x0036:
            r11 = r11 >> 8;
            r11 = r11 ^ r4;
            r11 = (byte) r11;
            if (r11 != 0) goto L_0x004c;
        L_0x003c:
            r8 = r2 + r6;
            r11 = com.google.protobuf.UnsafeUtil.getByte(r2);
            r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
            if (r1 < 0) goto L_0x004b;
        L_0x0046:
            r11 = com.google.protobuf.Utf8.incompleteStateFor(r14, r11);
            return r11;
        L_0x004b:
            r2 = r8;
        L_0x004c:
            if (r11 > r5) goto L_0x0062;
        L_0x004e:
            r1 = -96;
            if (r14 != r0) goto L_0x0054;
        L_0x0052:
            if (r11 < r1) goto L_0x0062;
        L_0x0054:
            r0 = -19;
            if (r14 != r0) goto L_0x005a;
        L_0x0058:
            if (r11 >= r1) goto L_0x0062;
        L_0x005a:
            r0 = r2 + r6;
            r11 = com.google.protobuf.UnsafeUtil.getByte(r2);
            if (r11 <= r5) goto L_0x00a6;
        L_0x0062:
            return r4;
        L_0x0063:
            r0 = r11 >> 8;
            r0 = r0 ^ r4;
            r0 = (byte) r0;
            if (r0 != 0) goto L_0x007a;
        L_0x0069:
            r8 = r2 + r6;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r2);
            r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
            if (r11 < 0) goto L_0x0078;
        L_0x0073:
            r11 = com.google.protobuf.Utf8.incompleteStateFor(r14, r0);
            return r11;
        L_0x0078:
            r2 = r8;
            goto L_0x007d;
        L_0x007a:
            r11 = r11 >> 16;
            r1 = (byte) r11;
        L_0x007d:
            if (r1 != 0) goto L_0x008f;
        L_0x007f:
            r8 = r2 + r6;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r2);
            r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
            if (r11 < 0) goto L_0x008e;
        L_0x0089:
            r11 = com.google.protobuf.Utf8.incompleteStateFor(r14, r0, r1);
            return r11;
        L_0x008e:
            r2 = r8;
        L_0x008f:
            if (r0 > r5) goto L_0x00a4;
        L_0x0091:
            r11 = r14 << 28;
            r0 = r0 + 112;
            r11 = r11 + r0;
            r11 = r11 >> 30;
            if (r11 != 0) goto L_0x00a4;
        L_0x009a:
            if (r1 > r5) goto L_0x00a4;
        L_0x009c:
            r0 = r2 + r6;
            r11 = com.google.protobuf.UnsafeUtil.getByte(r2);
            if (r11 <= r5) goto L_0x00a6;
        L_0x00a4:
            return r4;
        L_0x00a5:
            r0 = r2;
        L_0x00a6:
            r12 = r12 - r0;
            r11 = (int) r12;
            r11 = partialIsValidUtf8(r0, r11);
            return r11;
        L_0x00ad:
            r11 = new java.lang.ArrayIndexOutOfBoundsException;
            r0 = 3;
            r0 = new java.lang.Object[r0];
            r12 = r12.limit();
            r12 = java.lang.Integer.valueOf(r12);
            r0[r1] = r12;
            r12 = 1;
            r13 = java.lang.Integer.valueOf(r13);
            r0[r12] = r13;
            r12 = 2;
            r13 = java.lang.Integer.valueOf(r14);
            r0[r12] = r13;
            r12 = "buffer limit=%d, index=%d, limit=%d";
            r12 = java.lang.String.format(r12, r0);
            r11.<init>(r12);
            throw r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8$UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    private Utf8() {
    }

    static int encode(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return processor.encodeUtf8(charSequence, bArr, i, i2);
    }

    static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0048 in {4, 9, 10, 12, 14} preds:[]
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
    static int encodedLength(java.lang.CharSequence r5) {
        /*
        r0 = r5.length();
        r1 = 0;
        if (r1 >= r0) goto L_0x0012;
        r2 = r5.charAt(r1);
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 >= r3) goto L_0x0012;
        r1 = r1 + 1;
        goto L_0x0005;
        r2 = r0;
        if (r1 >= r0) goto L_0x002a;
        r3 = r5.charAt(r1);
        r4 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r3 >= r4) goto L_0x0025;
        r3 = 127 - r3;
        r3 = r3 >>> 31;
        r2 = r2 + r3;
        r1 = r1 + 1;
        goto L_0x0013;
        r5 = encodedLengthGeneral(r5, r1);
        r2 = r2 + r5;
        if (r2 < r0) goto L_0x002d;
        return r2;
        r5 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "UTF-8 length does not fit in int: ";
        r0.<init>(r1);
        r1 = (long) r2;
        r3 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r1 = r1 + r3;
        r0.append(r1);
        r0 = r0.toString();
        r5.<init>(r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.encodedLength(java.lang.CharSequence):int");
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= Imgproc.FLOODFILL_FIXED_RANGE) {
                        i++;
                    } else {
                        throw new UnpairedSurrogateException(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    private static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i2) {
        i2 -= 7;
        int i3 = i;
        while (i3 < i2 && (byteBuffer.getLong(i3) & ASCII_MASK_LONG) == 0) {
            i3 += 8;
        }
        return i3 - i;
    }

    private static int incompleteStateFor(int i) {
        return i > -12 ? -1 : i;
    }

    private static int incompleteStateFor(int i, int i2) {
        return (i > -12 || i2 > -65) ? -1 : i ^ (i2 << 8);
    }

    private static int incompleteStateFor(int i, int i2, int i3) {
        return (i > -12 || i2 > -65 || i3 > -65) ? -1 : (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    private static int incompleteStateFor(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return incompleteStateFor(i);
        }
        if (i3 == 1) {
            return incompleteStateFor(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return incompleteStateFor(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    private static int incompleteStateFor(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        i2 -= i;
        if (i2 == 0) {
            return incompleteStateFor(i3);
        }
        if (i2 == 1) {
            return incompleteStateFor(i3, bArr[i]);
        }
        if (i2 == 2) {
            return incompleteStateFor(i3, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return processor.isValidUtf8(bArr, i, i2);
    }

    static int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return processor.partialIsValidUtf8(i, byteBuffer, i2, i3);
    }

    public static int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3) {
        return processor.partialIsValidUtf8(i, bArr, i2, i3);
    }
}

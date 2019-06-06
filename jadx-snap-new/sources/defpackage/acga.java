package defpackage;

import com.addlive.djinni.CommunicationError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView;

/* renamed from: acga */
public final class acga extends ExtendableMessageNano<acga> {
    private int a = 0;
    private String b;
    private int c;
    private String d;
    private acgb[] e;
    private acev f;
    private int g;

    public acga() {
        String str = "";
        this.b = str;
        this.c = 0;
        this.d = str;
        this.e = acgb.a();
        this.f = null;
        this.g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.a & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.b);
        }
        if ((this.a & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, this.c);
        }
        if ((this.a & 4) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.d);
        }
        acgb[] acgbArr = this.e;
        if (acgbArr != null && acgbArr.length > 0) {
            int i = 0;
            while (true) {
                acgb[] acgbArr2 = this.e;
                if (i >= acgbArr2.length) {
                    break;
                }
                MessageNano messageNano = acgbArr2[i];
                if (messageNano != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(20, messageNano);
                }
                i++;
            }
        }
        acev acev = this.f;
        if (acev != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(30, acev);
        }
        return (this.a & 8) != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(40, this.g) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.b = codedInputByteBufferNano.readString();
                readTag = this.a | 1;
            } else if (readTag == 80) {
                readTag = codedInputByteBufferNano.readInt32();
                switch (readTag) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        switch (readTag) {
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                                break;
                            default:
                                switch (readTag) {
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                        break;
                                    default:
                                        switch (readTag) {
                                            case 260:
                                            case 261:
                                            case 262:
                                            case 263:
                                            case 264:
                                            case 265:
                                            case 266:
                                            case 267:
                                            case 268:
                                            case 269:
                                            case 270:
                                            case 271:
                                            case 272:
                                            case ModuleDescriptor.MODULE_VERSION /*273*/:
                                            case 274:
                                            case 275:
                                            case 276:
                                            case 277:
                                            case 278:
                                            case 279:
                                            case 280:
                                            case 281:
                                            case 282:
                                            case 283:
                                            case 284:
                                            case 285:
                                            case 286:
                                            case 287:
                                            case 288:
                                            case 289:
                                            case 290:
                                            case 291:
                                            case 292:
                                            case 293:
                                            case 294:
                                            case 295:
                                            case 296:
                                            case 297:
                                            case 298:
                                            case 299:
                                            case MapboxConstants.ANIMATION_DURATION /*300*/:
                                            case 301:
                                            case 302:
                                            case 303:
                                            case 304:
                                            case 305:
                                            case 306:
                                            case 307:
                                            case 308:
                                            case 309:
                                            case 310:
                                            case 311:
                                            case 312:
                                            case 313:
                                            case 314:
                                            case 315:
                                            case 316:
                                            case 317:
                                            case 318:
                                            case 319:
                                            case 320:
                                            case 321:
                                            case 322:
                                            case 323:
                                            case 324:
                                            case 325:
                                            case 326:
                                            case 327:
                                            case 328:
                                            case 329:
                                            case 330:
                                            case 331:
                                            case 332:
                                            case 333:
                                            case 334:
                                            case 335:
                                            case 336:
                                            case 337:
                                            case 338:
                                            case 339:
                                            case 340:
                                            case 341:
                                            case 342:
                                            case 343:
                                            case 344:
                                            case 345:
                                            case 346:
                                            case 347:
                                            case 348:
                                            case 349:
                                            case 350:
                                            case 351:
                                            case 352:
                                            case 353:
                                            case 354:
                                            case 355:
                                            case 356:
                                            case 357:
                                            case 358:
                                            case 359:
                                                break;
                                            default:
                                                switch (readTag) {
                                                    case MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS /*2000*/:
                                                    case CommunicationError.INVALID_HOST /*2001*/:
                                                    case CommunicationError.INVALID_PORT /*2002*/:
                                                    case CommunicationError.BAD_AUTH /*2003*/:
                                                    case CommunicationError.COMM_AUTH_ERROR /*2004*/:
                                                        break;
                                                    default:
                                                        switch (readTag) {
                                                            case 2024:
                                                            case 2025:
                                                            case 2026:
                                                            case 2027:
                                                            case 2028:
                                                            case 2029:
                                                            case 2030:
                                                            case 2031:
                                                            case 2032:
                                                            case 2033:
                                                            case 2034:
                                                                break;
                                                            default:
                                                                switch (readTag) {
                                                                    case 2036:
                                                                    case 2037:
                                                                    case 2038:
                                                                    case 2039:
                                                                    case 2040:
                                                                    case 2041:
                                                                    case 2042:
                                                                    case 2043:
                                                                    case 2044:
                                                                    case 2045:
                                                                    case 2046:
                                                                    case 2047:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
                this.c = readTag;
                readTag = this.a | 2;
            } else if (readTag == 90) {
                this.d = codedInputByteBufferNano.readString();
                readTag = this.a | 4;
            } else if (readTag == 162) {
                readTag = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 162);
                acgb[] acgbArr = this.e;
                int length = acgbArr == null ? 0 : acgbArr.length;
                acgb[] acgbArr2 = new acgb[(readTag + length)];
                if (length != 0) {
                    System.arraycopy(this.e, 0, acgbArr2, 0, length);
                }
                while (length < acgbArr2.length - 1) {
                    acgbArr2[length] = new acgb();
                    codedInputByteBufferNano.readMessage(acgbArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                acgbArr2[length] = new acgb();
                codedInputByteBufferNano.readMessage(acgbArr2[length]);
                this.e = acgbArr2;
            } else if (readTag == 242) {
                if (this.f == null) {
                    this.f = new acev();
                }
                codedInputByteBufferNano.readMessage(this.f);
            } else if (readTag == 320) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2 || readTag == 3 || readTag == 100) {
                    this.g = readTag;
                    readTag = this.a | 8;
                }
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.a = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.a & 1) != 0) {
            codedOutputByteBufferNano.writeString(1, this.b);
        }
        if ((this.a & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(10, this.c);
        }
        if ((this.a & 4) != 0) {
            codedOutputByteBufferNano.writeString(11, this.d);
        }
        acgb[] acgbArr = this.e;
        if (acgbArr != null && acgbArr.length > 0) {
            int i = 0;
            while (true) {
                acgb[] acgbArr2 = this.e;
                if (i >= acgbArr2.length) {
                    break;
                }
                MessageNano messageNano = acgbArr2[i];
                if (messageNano != null) {
                    codedOutputByteBufferNano.writeMessage(20, messageNano);
                }
                i++;
            }
        }
        acev acev = this.f;
        if (acev != null) {
            codedOutputByteBufferNano.writeMessage(30, acev);
        }
        if ((this.a & 8) != 0) {
            codedOutputByteBufferNano.writeInt32(40, this.g);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

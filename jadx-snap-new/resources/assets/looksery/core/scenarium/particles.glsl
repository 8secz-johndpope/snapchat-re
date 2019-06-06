//-----------------------------------------------------------------------
// Copyright (c) 2017 Snap Inc.
//-----------------------------------------------------------------------

#include <std.glsl>

#if NUM_COLORS>0
varying vec4 colorVarying;
#endif

#if NUM_TEXTURES>0
varying vec2 textureCoordinate0;
#endif
#if NUM_TEXTURES>1
varying vec2 textureCoordinate1;
#endif
#if NUM_TEXTURES>2
varying vec2 textureCoordinate2;
#endif
#if NUM_TEXTURES>3
varying vec2 textureCoordinate3;
#endif



#ifdef VERTEX_SHADER

attribute vec3 position;

#if NUM_COLORS>0
attribute vec4 color;
#endif

#if NUM_TEXTURES>0
attribute vec2 inputTextureCoordinate0;
#endif

#if NUM_TEXTURES>1
attribute vec2 inputTextureCoordinate1;
#endif

#if NUM_TEXTURES>2
attribute vec2 inputTextureCoordinate2;
#endif

#if NUM_TEXTURES>3
attribute vec2 inputTextureCoordinate3;
#endif

void main(void) {

    gl_Position = sc_ViewProjectionMatrix * vec4(position, 1.0);

#if NUM_COLORS>0
    colorVarying = color;
#endif
    
#if NUM_TEXTURES>0
    textureCoordinate0 = vec2(inputTextureCoordinate0.x,1.0-inputTextureCoordinate0.y);
#endif
    
#if NUM_TEXTURES>1
    textureCoordinate1 = vec2(inputTextureCoordinate1.x,1.0-inputTextureCoordinate1.y);
#endif
    
#if NUM_TEXTURES>2
    textureCoordinate2 = vec2(inputTextureCoordinate2.x,1.0-inputTextureCoordinate2.y);
#endif
    
#if NUM_TEXTURES>3
    textureCoordinate3 = vec2(inputTextureCoordinate3.x,1.0-inputTextureCoordinate3.y);
#endif
}



#endif

#ifdef FRAGMENT_SHADER

#if NUM_TEXTURES>0
uniform sampler2D texture0;
#endif

#if NUM_TEXTURES>1
uniform sampler2D texture1;
#endif

#if NUM_TEXTURES>2
uniform sampler2D texture2;
#endif

#if NUM_TEXTURES>3
uniform sampler2D texture3;
#endif


#define TEXARG_CURRENT 0
#define TEXARG_DIFFUSE 1
#define TEXARG_TEXTURE 2


#define TEXOP_ARGUMENT1    0
#define TEXOP_ADD            1
#define TEXOP_SUBTRACT    2
#define TEXOP_MODULATE    3
#define TEXOP_MODULATE2X    4
#define TEXOP_MODULATE4X    5



void main(void) {
    
    vec4 color;
    vec4 arg1;
    vec4 arg2;
    vec4 colorTex;

#if NUM_STAGES==0
    color = colorVarying;
#endif
    
#if NUM_STAGES>0
#if ((STAGE0_RGB_ARG1==TEXARG_TEXTURE) || (STAGE0_ALPHA_ARG1==TEXARG_TEXTURE) || (STAGE0_RGB_ARG2==TEXARG_TEXTURE) || (STAGE0_ALPHA_ARG2==TEXARG_TEXTURE))
    colorTex=texture2D(texture0,textureCoordinate0);
#endif
    // load arg1
    #if(STAGE0_RGB_ARG1==TEXARG_CURRENT)
        arg1.xyz = color.xyz;
    #elif(STAGE0_RGB_ARG1==TEXARG_DIFFUSE)
        arg1.xyz = colorVarying.xyz;
    #elif(STAGE0_RGB_ARG1==TEXARG_TEXTURE)
        arg1.xyz = colorTex.xyz;
    #endif
    #if(STAGE0_ALPHA_ARG1==TEXARG_CURRENT)
        arg1.w = color.w;
    #elif(STAGE0_ALPHA_ARG1==TEXARG_DIFFUSE)
        arg1.w = colorVarying.w;
    #elif(STAGE0_ALPHA_ARG1==TEXARG_TEXTURE)
        arg1.w = colorTex.w;
    #endif
    // load arg2
    #if(STAGE0_RGB_ARG2==TEXARG_CURRENT)
        arg2.xyz = color.xyz;
    #elif(STAGE0_RGB_ARG2==TEXARG_DIFFUSE)
        arg2.xyz = colorVarying.xyz;
    #elif(STAGE0_RGB_ARG2==TEXARG_TEXTURE)
        arg2.xyz = colorTex.xyz;
    #endif
    #if(STAGE0_ALPHA_ARG2==TEXARG_CURRENT)
        arg2.w = color.w;
    #elif(STAGE0_ALPHA_ARG2==TEXARG_DIFFUSE)
        arg2.w = colorVarying.w;
    #elif(STAGE0_ALPHA_ARG2==TEXARG_TEXTURE)
        arg2.w = colorTex.w;
    #endif
    // color op
    #if(STAGE0_RGB_OP==TEXOP_ARGUMENT1)
        color.xyz = arg1.xyz;
    #elif(STAGE0_RGB_OP==TEXOP_ADD)
        color.xyz = arg1.xyz+arg2.xyz;
    #elif(STAGE0_RGB_OP==TEXOP_SUBTRACT)
        color.xyz = arg1.xyz-arg2.xyz;
    #elif(STAGE0_RGB_OP==TEXOP_MODULATE)
        color.xyz = arg1.xyz*arg2.xyz;
    #elif(STAGE0_RGB_OP==TEXOP_MODULATE2X)
        color.xyz = arg1.xyz*arg2.xyz;
        color.xyz = color.xyz+color.xyz;
    #else // modulate 4x
        color.xyz=arg1.xyz*arg2.xyz;
        color.xyz=color.xyz*4.0;
    #endif
    // alpha op
    #if(STAGE0_ALPHA_OP==TEXOP_ARGUMENT1)
        color.w = arg1.w;
    #elif(STAGE0_ALPHA_OP==TEXOP_ADD)
        color.w = arg1.w+arg2.w;
    #elif(STAGE0_ALPHA_OP==TEXOP_SUBTRACT)
        color.w = arg1.w-arg2.w;
    #elif(STAGE0_ALPHA_OP==TEXOP_MODULATE)
        color.w = arg1.w*arg2.w;
    #elif(STAGE0_ALPHA_OP==TEXOP_MODULATE2X)
        color.w = arg1.w*arg2.w;
        color.w = color.w+color.w;
    #else // modulate 4x
        color.w=arg1.w*arg2.w;
        color.w=color.w*4.0;
    #endif
#endif // NUM_STAGES>0
    
//
// STAGE 1
//
#if NUM_STAGES>1
#if ((STAGE1_RGB_ARG1==TEXARG_TEXTURE) || (STAGE1_ALPHA_ARG1==TEXARG_TEXTURE) || (STAGE1_RGB_ARG2==TEXARG_TEXTURE) || (STAGE1_ALPHA_ARG2==TEXARG_TEXTURE))
    colorTex=texture2D(texture1,textureCoordinate1);
#endif
    // load arg1
#if(STAGE1_RGB_ARG1==TEXARG_CURRENT)
    arg1.xyz = color.xyz;
#elif(STAGE1_RGB_ARG1==TEXARG_DIFFUSE)
    arg1.xyz = colorVarying.xyz;
#elif(STAGE1_RGB_ARG1==TEXARG_TEXTURE)
    arg1.xyz = colorTex.xyz;
#endif
#if(STAGE1_ALPHA_ARG1==TEXARG_CURRENT)
    arg1.w = color.w;
#elif(STAGE1_ALPHA_ARG1==TEXARG_DIFFUSE)
    arg1.w = colorVarying.w;
#elif(STAGE1_ALPHA_ARG1==TEXARG_TEXTURE)
    arg1.w = colorTex.w;
#endif
    // load arg2
#if(STAGE1_RGB_ARG2==TEXARG_CURRENT)
    arg2.xyz = color.xyz;
#elif(STAGE1_RGB_ARG2==TEXARG_DIFFUSE)
    arg2.xyz = colorVarying.xyz;
#elif(STAGE1_RGB_ARG2==TEXARG_TEXTURE)
    arg2.xyz = colorTex.xyz;
#endif
#if(STAGE1_ALPHA_ARG2==TEXARG_CURRENT)
    arg2.w = color.w;
#elif(STAGE1_ALPHA_ARG2==TEXARG_DIFFUSE)
    arg2.w = colorVarying.w;
#elif(STAGE1_ALPHA_ARG2==TEXARG_TEXTURE)
    arg2.w = colorTex.w;
#endif
    // color op
#if(STAGE1_RGB_OP==TEXOP_ARGUMENT1)
    color.xyz = arg1.xyz;
#elif(STAGE1_RGB_OP==TEXOP_ADD)
    color.xyz = arg1.xyz+arg2.xyz;
#elif(STAGE1_RGB_OP==TEXOP_SUBTRACT)
    color.xyz = arg1.xyz-arg2.xyz;
#elif(STAGE1_RGB_OP==TEXOP_MODULATE)
    color.xyz = arg1.xyz*arg2.xyz;
#elif(STAGE1_RGB_OP==TEXOP_MODULATE2X)
    color.xyz = arg1.xyz*arg2.xyz;
    color.xyz = color.xyz+color.xyz;
#else // modulate 4x
    color.xyz=arg1.xyz*arg2.xyz;
    color.xyz=color.xyz*4.0;
#endif
    // alpha op
#if(STAGE1_ALPHA_OP==TEXOP_ARGUMENT1)
    color.w = arg1.w;
#elif(STAGE1_ALPHA_OP==TEXOP_ADD)
    color.w = arg1.w+arg2.w;
#elif(STAGE1_ALPHA_OP==TEXOP_SUBTRACT)
    color.w = arg1.w-arg2.w;
#elif(STAGE1_ALPHA_OP==TEXOP_MODULATE)
    color.w = arg1.w*arg2.w;
#elif(STAGE1_ALPHA_OP==TEXOP_MODULATE2X)
    color.w = arg1.w*arg2.w;
    color.w = color.w+color.w;
#else // modulate 4x
    color.w=arg1.w*arg2.w;
    color.w=color.w*4.0;
#endif
#endif // NUM_STAGES>1

//
// STAGE 2
//
#if NUM_STAGES>2
#if ((STAGE2_RGB_ARG1==TEXARG_TEXTURE) || (STAGE2_ALPHA_ARG1==TEXARG_TEXTURE) || (STAGE2_RGB_ARG2==TEXARG_TEXTURE) || (STAGE2_ALPHA_ARG2==TEXARG_TEXTURE))
    colorTex=texture2D(texture2,textureCoordinate2);
#endif
    // load arg1
#if(STAGE2_RGB_ARG1==TEXARG_CURRENT)
    arg1.xyz = color.xyz;
#elif(STAGE2_RGB_ARG1==TEXARG_DIFFUSE)
    arg1.xyz = colorVarying.xyz;
#elif(STAGE2_RGB_ARG1==TEXARG_TEXTURE)
    arg1.xyz = colorTex.xyz;
#endif
#if(STAGE2_ALPHA_ARG1==TEXARG_CURRENT)
    arg1.w = color.w;
#elif(STAGE2_ALPHA_ARG1==TEXARG_DIFFUSE)
    arg1.w = colorVarying.w;
#elif(STAGE2_ALPHA_ARG1==TEXARG_TEXTURE)
    arg1.w = colorTex.w;
#endif
    // load arg2
#if(STAGE2_RGB_ARG2==TEXARG_CURRENT)
    arg2.xyz = color.xyz;
#elif(STAGE2_RGB_ARG2==TEXARG_DIFFUSE)
    arg2.xyz = colorVarying.xyz;
#elif(STAGE2_RGB_ARG2==TEXARG_TEXTURE)
    arg2.xyz = colorTex.xyz;
#endif
#if(STAGE2_ALPHA_ARG2==TEXARG_CURRENT)
    arg2.w = color.w;
#elif(STAGE2_ALPHA_ARG2==TEXARG_DIFFUSE)
    arg2.w = colorVarying.w;
#elif(STAGE2_ALPHA_ARG2==TEXARG_TEXTURE)
    arg2.w = colorTex.w;
#endif
    // color op
#if(STAGE2_RGB_OP==TEXOP_ARGUMENT1)
    color.xyz = arg1.xyz;
#elif(STAGE2_RGB_OP==TEXOP_ADD)
    color.xyz = arg1.xyz+arg2.xyz;
#elif(STAGE2_RGB_OP==TEXOP_SUBTRACT)
    color.xyz = arg1.xyz-arg2.xyz;
#elif(STAGE2_RGB_OP==TEXOP_MODULATE)
    color.xyz = arg1.xyz*arg2.xyz;
#elif(STAGE2_RGB_OP==TEXOP_MODULATE2X)
    color.xyz = arg1.xyz*arg2.xyz;
    color.xyz = color.xyz+color.xyz;
#else // modulate 4x
    color.xyz=arg1.xyz*arg2.xyz;
    color.xyz=color.xyz*4.0;
#endif
    // alpha op
#if(STAGE2_ALPHA_OP==TEXOP_ARGUMENT1)
    color.w = arg1.w;
#elif(STAGE2_ALPHA_OP==TEXOP_ADD)
    color.w = arg1.w+arg2.w;
#elif(STAGE2_ALPHA_OP==TEXOP_SUBTRACT)
    color.w = arg1.w-arg2.w;
#elif(STAGE2_ALPHA_OP==TEXOP_MODULATE)
    color.w = arg1.w*arg2.w;
#elif(STAGE2_ALPHA_OP==TEXOP_MODULATE2X)
    color.w = arg1.w*arg2.w;
    color.w = color.w+color.w;
#else // modulate 4x
    color.w=arg1.w*arg2.w;
    color.w=color.w*4.0;
#endif
#endif // NUM_STAGES>2

    //
    // STAGE 2
    //
#if NUM_STAGES>3
#if ((STAGE3_RGB_ARG1==TEXARG_TEXTURE) || (STAGE3_ALPHA_ARG1==TEXARG_TEXTURE) || (STAGE3_RGB_ARG2==TEXARG_TEXTURE) || (STAGE3_ALPHA_ARG2==TEXARG_TEXTURE))
    colorTex=texture2D(texture3,textureCoordinate3);
#endif
    // load arg1
#if(STAGE3_RGB_ARG1==TEXARG_CURRENT)
    arg1.xyz = color.xyz;
#elif(STAGE3_RGB_ARG1==TEXARG_DIFFUSE)
    arg1.xyz = colorVarying.xyz;
#elif(STAGE3_RGB_ARG1==TEXARG_TEXTURE)
    arg1.xyz = colorTex.xyz;
#endif
#if(STAGE3_ALPHA_ARG1==TEXARG_CURRENT)
    arg1.w = color.w;
#elif(STAGE3_ALPHA_ARG1==TEXARG_DIFFUSE)
    arg1.w = colorVarying.w;
#elif(STAGE3_ALPHA_ARG1==TEXARG_TEXTURE)
    arg1.w = colorTex.w;
#endif
    // load arg2
#if(STAGE3_RGB_ARG2==TEXARG_CURRENT)
    arg2.xyz = color.xyz;
#elif(STAGE3_RGB_ARG2==TEXARG_DIFFUSE)
    arg2.xyz = colorVarying.xyz;
#elif(STAGE3_RGB_ARG2==TEXARG_TEXTURE)
    arg2.xyz = colorTex.xyz;
#endif
#if(STAGE3_ALPHA_ARG2==TEXARG_CURRENT)
    arg2.w = color.w;
#elif(STAGE3_ALPHA_ARG2==TEXARG_DIFFUSE)
    arg2.w = colorVarying.w;
#elif(STAGE3_ALPHA_ARG2==TEXARG_TEXTURE)
    arg2.w = colorTex.w;
#endif
    // color op
#if(STAGE3_RGB_OP==TEXOP_ARGUMENT1)
    color.xyz = arg1.xyz;
#elif(STAGE3_RGB_OP==TEXOP_ADD)
    color.xyz = arg1.xyz+arg2.xyz;
#elif(STAGE3_RGB_OP==TEXOP_SUBTRACT)
    color.xyz = arg1.xyz-arg2.xyz;
#elif(STAGE3_RGB_OP==TEXOP_MODULATE)
    color.xyz = arg1.xyz*arg2.xyz;
#elif(STAGE3_RGB_OP==TEXOP_MODULATE2X)
    color.xyz = arg1.xyz*arg2.xyz;
    color.xyz = color.xyz+color.xyz;
#else // modulate 4x
    color.xyz=arg1.xyz*arg2.xyz;
    color.xyz=color.xyz*4.0;
#endif
    // alpha op
#if(STAGE3_ALPHA_OP==TEXOP_ARGUMENT1)
    color.w = arg1.w;
#elif(STAGE3_ALPHA_OP==TEXOP_ADD)
    color.w = arg1.w+arg2.w;
#elif(STAGE3_ALPHA_OP==TEXOP_SUBTRACT)
    color.w = arg1.w-arg2.w;
#elif(STAGE3_ALPHA_OP==TEXOP_MODULATE)
    color.w = arg1.w*arg2.w;
#elif(STAGE3_ALPHA_OP==TEXOP_MODULATE2X)
    color.w = arg1.w*arg2.w;
    color.w = color.w+color.w;
#else // modulate 4x
    color.w=arg1.w*arg2.w;
    color.w=color.w*4.0;
#endif
#endif // NUM_STAGES>3

    gl_FragColor=color;

#if (ALPHATEST)
    if(gl_FragColor.w==0.0)discard;
#endif
}


#endif

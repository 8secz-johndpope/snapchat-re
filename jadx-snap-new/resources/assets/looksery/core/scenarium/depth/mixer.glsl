//-----------------------------------------------------------------------
// Copyright (c) 2019 Snap Inc.
//-----------------------------------------------------------------------

#define SC_USE_USER_DEFINED_VS_MAIN

#include <std.glsl>
#include <std_vs.glsl>
#include <std_fs.glsl>
#include <depth/float_packing.glsl>

uniform sampler2D tex_RY_GY;
uniform sampler2D tex_BY_Y;
uniform sampler2D tex_R_G_B;
uniform sampler2D tex_RR_GG_BB;
uniform sampler2D tex_RG_RB_GB;
uniform sampler2D mainTexture;
uniform mat3 mainTextureTransform;
uniform float epsilon;

#ifdef VERTEX_SHADER

void main() {
    varTex0 = vec2(mainTextureTransform * vec3(texture0, 1.0));
    varTex1 = texture0;
    gl_Position = position;
}

#endif // VERTEX_SHADER

#ifdef FRAGMENT_SHADER

vec3 inverseSymMul(float m00, float m11, float m22, float m01, float m02, float m12, vec3 A) {
    float a00 = m22 * m11 - m12 * m12;
    float a01 = m02 * m12 - m22 * m01;
    float a02 = m01 * m12 - m02 * m11;

    float a11 = m22 * m00 - m02 * m02;
    float a12 = m01 * m02 - m00 * m12;

    float a22 = m00 * m11 - m01 * m01;
    float D = dot(vec3(m00, m01, m02), vec3(a00, a01, a02));
    mat3 Inv = mat3(a00, a01, a02,
                    a01, a11, a12,
                    a02, a12, a22);

    return (Inv*A)/D;
}

void main()
{
    vec4 RY_GY_BY_Y = vec4(textureDecode2(tex_RY_GY, varTex1), textureDecode2(tex_BY_Y, varTex1));
    vec3 R_G_B = texture2D(tex_R_G_B, varTex1).rgb;
    vec3 RR_GG_BB = texture2D(tex_RR_GG_BB, varTex1).rgb;
    vec3 RG_RB_GB = texture2D(tex_RG_RB_GB, varTex1).rgb;
    // cov_xy = mean_xy - mean_x*mean_y, var_x = mean_xx - mean_x*mean_x;
    vec3 covd = abs(RR_GG_BB - R_G_B*R_G_B) + vec3(epsilon*epsilon); // diagonal
    vec3 covo = RG_RB_GB - R_G_B.rrg*R_G_B.gbb; // over

    vec3 A = inverseSymMul(covd[0], covd[1], covd[2], covo[0], covo[1], covo[2],
                           RY_GY_BY_Y.rgb - R_G_B*RY_GY_BY_Y.a);
    //b = mean_y - A * mean_x, mask = A*hr_x + b
    float b = RY_GY_BY_Y.a - dot(A, R_G_B);
    vec3 hr_RGB = texture2D(mainTexture, varTex0).rgb;

    float mask = dot(A, hr_RGB)+b;
    gl_FragColor = vec4(encode2(mask), 0.0, 1.0);
}

#endif


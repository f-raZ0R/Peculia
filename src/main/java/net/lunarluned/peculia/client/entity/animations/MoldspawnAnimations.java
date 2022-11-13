package net.lunarluned.peculia.client.entity.animations;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

@Environment(EnvType.CLIENT)
public class MoldspawnAnimations {

    public static final AnimationDefinition MOLDSPAWN_IDLE = AnimationDefinition.Builder.withLength(2f).looping().addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.LINEAR))).addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2f, KeyframeAnimations.degreeVec(0.18f, 0f, 0.21f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Antenna_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(-15f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.4f, KeyframeAnimations.degreeVec(15f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2f, KeyframeAnimations.degreeVec(0.87f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Antenna_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(-15f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1.4f, KeyframeAnimations.degreeVec(15f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2f, KeyframeAnimations.degreeVec(0.87f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Front_Left", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.LINEAR))).addAnimation("Leg_Front_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 20f, 20f), AnimationChannel.Interpolations.LINEAR))).addAnimation("Leg_Back_Left", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.LINEAR))).addAnimation("Leg_Back_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -20f, 20f), AnimationChannel.Interpolations.LINEAR))).addAnimation("Leg_Front_Right", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.LINEAR))).addAnimation("Leg_Front_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -20f, -20f), AnimationChannel.Interpolations.LINEAR))).addAnimation("Leg_Back_Right", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.LINEAR))).addAnimation("Leg_Back_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 20f, -20f), AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition MOLDSPAWN_WALK = AnimationDefinition.Builder.withLength(1f).looping().addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 1.3000000000000003f, -1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 1.3f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 1.3000000000000003f, -1f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.25f, KeyframeAnimations.degreeVec(-1f, 0f, 5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.7f, KeyframeAnimations.degreeVec(-1f, 0f, -5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(5f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Antenna_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3f, KeyframeAnimations.degreeVec(32.5f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.7f, KeyframeAnimations.degreeVec(-25f, 0f, -25f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(-3.67f, 0f, -12.21f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Antenna_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3f, KeyframeAnimations.degreeVec(40f, -12f, 14f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.7f, KeyframeAnimations.degreeVec(-15f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(-2.44f, -0.12f, 7.05f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Front_Left", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Front_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -35f, 20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.25f, KeyframeAnimations.degreeVec(-5f, 5f, -16f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 60f, 20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.75f, KeyframeAnimations.degreeVec(2f, 15f, 20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -35f, 20f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Back_Left", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Back_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -45f, 20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 3f, 17f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 45f, 20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.75f, KeyframeAnimations.degreeVec(-5f, -5f, -16f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -45f, 20f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Front_Right", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Front_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -60f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.25f, KeyframeAnimations.degreeVec(5f, -10f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 35f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.75f, KeyframeAnimations.degreeVec(5f, -5f, 16f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -60f, -20f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Back_Right", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Back_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -45f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.25f, KeyframeAnimations.degreeVec(5f, 5f, 16f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 45f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.75f, KeyframeAnimations.degreeVec(-5f, 3f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(1f, KeyframeAnimations.degreeVec(0f, -45f, -20f), AnimationChannel.Interpolations.CATMULLROM))).build();
    public static final AnimationDefinition MOLDSPAWN_BITE = AnimationDefinition.Builder.withLength(1f).addAnimation("Pincer_Right", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.15f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3f, KeyframeAnimations.posVec(1f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Pincer_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.15f, KeyframeAnimations.degreeVec(0f, 40f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Pincer_Left", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.15f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3f, KeyframeAnimations.posVec(-1f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Pincer_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.15f, KeyframeAnimations.degreeVec(0f, -40f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).build();
    public static final AnimationDefinition MOLDSPAWN_LEAP = AnimationDefinition.Builder.withLength(0.5833333333333334f).addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5833333333333334f, KeyframeAnimations.posVec(0f, 3f, -1f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Body", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3333333333333333f, KeyframeAnimations.degreeVec(-20f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5833333333333334f, KeyframeAnimations.degreeVec(-20f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Antenna_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.degreeVec(25f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4166666666666667f, KeyframeAnimations.degreeVec(-25f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5833333333333334f, KeyframeAnimations.degreeVec(-25f, 0f, -10f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Antenna_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.degreeVec(25f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4166666666666667f, KeyframeAnimations.degreeVec(-25f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5833333333333334f, KeyframeAnimations.degreeVec(-25f, 0f, 10f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Front_Left", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4166666666666667f, KeyframeAnimations.posVec(0f, 5f, -3f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5833333333333334f, KeyframeAnimations.posVec(0f, 5f, -3f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Front_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 20f, 20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.degreeVec(0f, -25f, 20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4166666666666667f, KeyframeAnimations.degreeVec(0f, 35f, 20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5833333333333334f, KeyframeAnimations.degreeVec(0f, 35f, 20f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Back_Left", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.posVec(0f, 4.75f, 0.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3333333333333333f, KeyframeAnimations.posVec(0f, 1.5000000000000004f, 1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 1.5000000000000004f, 1f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Back_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -20f, 20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.degreeVec(-30f, -30f, 75f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3333333333333333f, KeyframeAnimations.degreeVec(0f, -60f, 20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, -60f, 20f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Front_Right", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4166666666666667f, KeyframeAnimations.posVec(0f, 5f, -3f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5833333333333334f, KeyframeAnimations.posVec(0f, 5f, -3f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Front_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -20f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.degreeVec(0f, 25f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4166666666666667f, KeyframeAnimations.degreeVec(0f, -35f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5833333333333334f, KeyframeAnimations.degreeVec(0f, -35f, -20f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Back_Right", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(0f, 2f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.posVec(0f, 4.75f, 0.5f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3333333333333333f, KeyframeAnimations.posVec(0f, 1.5000000000000004f, 1f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 1.5000000000000004f, 1f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Leg_Back_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 20f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.16666666666666666f, KeyframeAnimations.degreeVec(-30f, 30f, -75f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.3333333333333333f, KeyframeAnimations.degreeVec(0f, 60f, -20f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 60f, -20f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Pincer_Right", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(1f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Pincer_Right", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4166666666666667f, KeyframeAnimations.degreeVec(0f, 20f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5833333333333334f, KeyframeAnimations.degreeVec(0f, 20f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Pincer_Left", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0f, KeyframeAnimations.posVec(-1f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM))).addAnimation("Pincer_Left", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.4166666666666667f, KeyframeAnimations.degreeVec(0f, -20f, 0f), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(0.5833333333333334f, KeyframeAnimations.degreeVec(0f, -20f, 0f), AnimationChannel.Interpolations.CATMULLROM))).build();

}
package com.aburgerguy.mowolvesmod.client.render;

import com.aburgerguy.mowolvesmod.MoWolvesMod;
import com.aburgerguy.mowolvesmod.client.model.MongolianWolfModel;
import com.aburgerguy.mowolvesmod.entities.MongolianWolfEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MongolianWolfRenderer extends MobRenderer<MongolianWolfEntity, MongolianWolfModel<MongolianWolfEntity>>
{

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MoWolvesMod.MOD_ID, "textures/entity/mongolian_wolf.png");

    public MongolianWolfRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MongolianWolfModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(MongolianWolfEntity entity) {
        return TEXTURE;
    }
}

package com.aburgerguy.mowolvesmod.init;

import com.aburgerguy.mowolvesmod.MoWolvesMod;
import com.aburgerguy.mowolvesmod.entities.MongolianWolfEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MoWolvesMod.MOD_ID);

    // Entity Types
//    assets/mowolvesmod/textures/entity/mongolian_wolf.png
    public static final RegistryObject<EntityType<MongolianWolfEntity>> MONGOLIAN_WOLF = ENTITY_TYPES.register("mongolian_wolf",
            () -> EntityType.Builder.create(MongolianWolfEntity::new, EntityClassification.CREATURE)
            .size(1.0f,1.0f)
            .build(new ResourceLocation(MoWolvesMod.MOD_ID, "mongolian_wolf").toString()));

}

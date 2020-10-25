package com.aburgerguy.mowolvesmod.util;

import com.aburgerguy.mowolvesmod.MoWolvesMod;
import com.aburgerguy.mowolvesmod.client.render.MongolianWolfRenderer;
import com.aburgerguy.mowolvesmod.init.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MoWolvesMod.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MONGOLIAN_WOLF.get(), MongolianWolfRenderer::new);
    }

}

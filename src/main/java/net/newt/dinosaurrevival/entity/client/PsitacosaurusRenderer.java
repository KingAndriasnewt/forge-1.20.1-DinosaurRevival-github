package net.newt.dinosaurrevival.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import mod.azure.azurelib.model.GeoModel;
import mod.azure.azurelib.renderer.GeoEntityRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.newt.dinosaurrevival.DinosaurRevival;
import net.newt.dinosaurrevival.entity.custom.PsitacosaurusEntity;

public class PsitacosaurusRenderer extends GeoEntityRenderer<PsitacosaurusEntity> {
    public PsitacosaurusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PsitacosaurusModel());
    }

    @Override
    public ResourceLocation getTextureLocation(PsitacosaurusEntity animatable) {
        return new ResourceLocation(DinosaurRevival.MOD_ID, "textures/entity/piss_tacof.png");
    }
}

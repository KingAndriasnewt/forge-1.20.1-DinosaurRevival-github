package net.newt.dinosaurrevival.entity.client;

import mod.azure.azurelib.constant.DataTickets;
import mod.azure.azurelib.core.animatable.model.CoreGeoBone;
import mod.azure.azurelib.core.animation.AnimationState;
import mod.azure.azurelib.model.GeoModel;
import mod.azure.azurelib.model.data.EntityModelData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.newt.dinosaurrevival.DinosaurRevival;
import net.newt.dinosaurrevival.entity.custom.PsitacosaurusEntity;

public class PsitacosaurusModel extends GeoModel<PsitacosaurusEntity> {
    @Override
    public ResourceLocation getModelResource(PsitacosaurusEntity psitacosaurusEntity) {
        return new ResourceLocation(DinosaurRevival.MOD_ID, "geo/psitacosaurus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PsitacosaurusEntity psitacosaurusEntity) {
        return new ResourceLocation(DinosaurRevival.MOD_ID, "textures/entity/piss_tacof.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PsitacosaurusEntity psitacosaurusEntity) {
        return new ResourceLocation(DinosaurRevival.MOD_ID, "animations/psitacosaurus.animation.json");
    }

    @Override
    public void setCustomAnimations(PsitacosaurusEntity animatable, long instanceId, AnimationState<PsitacosaurusEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}

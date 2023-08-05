package de.johni0702.minecraft.bobby.mixin.sodium;

import me.jellysquid.mods.sodium.client.render.SodiumWorldRenderer;
import me.jellysquid.mods.sodium.client.render.chunk.RenderSectionManager;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
@Mixin(SodiumWorldRenderer.class)
public interface SodiumWorldRendererAccess {
    @Accessor(remap = false)
    RenderSectionManager getRenderSectionManager();
    @Accessor(remap = false)
    ClientWorld getWorld();
}

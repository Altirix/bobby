package de.johni0702.minecraft.bobby.mixin.sodium;

import de.johni0702.minecraft.bobby.Bobby;
import de.johni0702.minecraft.bobby.FakeChunk;
import de.johni0702.minecraft.bobby.ext.ChunkLightProviderExt;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import me.jellysquid.mods.sodium.client.render.SodiumWorldRenderer;
import me.jellysquid.mods.sodium.client.render.chunk.map.ChunkStatus;
import me.jellysquid.mods.sodium.client.render.chunk.map.ChunkTracker;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.WorldChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ChunkTracker.class)
public class SodiumChunkTrackerMixin {
//@Inject(remap=false, method = "onChunkStatusRemoved",
//        at = @At(value = "INVOKE",target = "Lme/jellysquid/mods/sodium/client/render/chunk/map/ChunkTracker;updateNeighbors(II)V"),
//        cancellable = true)
//    public void onChunkStatusReplaced(int x, int z, int flags, CallbackInfo ci) {
//    SodiumWorldRendererAccess sodiumWorldRendererAccess = (SodiumWorldRendererAccess)SodiumWorldRenderer.instance();
//    WorldChunk chunk = sodiumWorldRendererAccess.getWorld().getChunk(x,z);
//    if (!(chunk instanceof FakeChunk) && flags == ChunkStatus.FLAG_HAS_BLOCK_DATA) {
//        ci.cancel(); // bypass Sodium's unload neighbours hook of vanilla chunks
//    }
//    }
}

package de.johni0702.minecraft.bobby.sodium;

import de.johni0702.minecraft.bobby.mixin.sodium.SodiumWorldRendererAccess;
import me.jellysquid.mods.sodium.client.render.SodiumWorldRenderer;
import me.jellysquid.mods.sodium.client.render.chunk.RenderSectionManager;
import me.jellysquid.mods.sodium.client.render.chunk.map.ChunkStatus;
import me.jellysquid.mods.sodium.client.render.chunk.map.ChunkTrackerHolder;

public class SodiumChunkStatusListenerImpl implements ChunkStatusListener {
    @Override
    public void onChunkAdded(int x, int z) {
        SodiumWorldRendererAccess sodiumWorldRenderer = (SodiumWorldRendererAccess)SodiumWorldRenderer.instance();
        sodiumWorldRenderer.getRenderSectionManager().onChunkAdded(x, z);

        ChunkTrackerHolder.get(sodiumWorldRenderer.getWorld()).onChunkStatusAdded(x,z, ChunkStatus.FLAG_ALL);

    }

    @Override
    public void onChunkRemoved(int x, int z) {
        SodiumWorldRendererAccess sodiumWorldRenderer = ((SodiumWorldRendererAccess)SodiumWorldRenderer.instance());
        RenderSectionManager renderManager = sodiumWorldRenderer.getRenderSectionManager();
        ChunkTrackerHolder.get(sodiumWorldRenderer.getWorld()).onChunkStatusRemoved(x,z, ChunkStatus.FLAG_ALL);
        renderManager.onChunkRemoved(x, z);

    }
}

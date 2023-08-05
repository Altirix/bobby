package de.johni0702.minecraft.bobby.sodium;

import de.johni0702.minecraft.bobby.mixin.sodium.SodiumWorldRendererAccess;
import me.jellysquid.mods.sodium.client.render.SodiumWorldRenderer;
import me.jellysquid.mods.sodium.client.render.chunk.RenderSectionManager;

public class SodiumChunkStatusListenerImpl implements ChunkStatusListener {
    @Override
    public void onChunkAdded(int x, int z) {
        SodiumWorldRendererAccess sodiumRenderer = ((SodiumWorldRendererAccess)SodiumWorldRenderer.instance());
        sodiumRenderer.getRenderSectionManager().onChunkAdded(x, z);
        //ChunkTrackerHolder.get(sodiumRenderer.getWorld())

    }

    @Override
    public void onChunkRemoved(int x, int z) {
        SodiumWorldRendererAccess sodiumRenderer = ((SodiumWorldRendererAccess)SodiumWorldRenderer.instance());
        RenderSectionManager renderManager = sodiumRenderer.getRenderSectionManager();

        renderManager.onChunkRemoved(x, z);

    }
}

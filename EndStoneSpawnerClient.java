package com.example.endstonespawner.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;

public class EndStoneSpawnerClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Клетка спавнера — текстура с прозрачными дырками, поэтому камню Края
		// нужен слой "cutout". Без него дырки были бы чёрными.
		// Сама модель (клетка + крипер) лежит в assets/minecraft/models/block/end_stone.json.
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.END_STONE, RenderType.cutout());
	}
}

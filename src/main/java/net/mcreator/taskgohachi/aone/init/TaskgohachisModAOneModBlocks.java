
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taskgohachi.aone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.taskgohachi.aone.block.WaterSourceBlockBlock;
import net.mcreator.taskgohachi.aone.TaskgohachisModAOneMod;

public class TaskgohachisModAOneModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TaskgohachisModAOneMod.MODID);
	public static final RegistryObject<Block> WATER_SOURCE_BLOCK = REGISTRY.register("water_source_block", () -> new WaterSourceBlockBlock());
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taskgohachi.aone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.taskgohachi.aone.item.FlintSwordItem;
import net.mcreator.taskgohachi.aone.item.FlintShovelItem;
import net.mcreator.taskgohachi.aone.item.FlintPickaxeItem;
import net.mcreator.taskgohachi.aone.item.FlintHoeItem;
import net.mcreator.taskgohachi.aone.item.FlintAxeItem;
import net.mcreator.taskgohachi.aone.TaskgohachisModAOneMod;

public class TaskgohachisModAOneModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TaskgohachisModAOneMod.MODID);
	public static final RegistryObject<Item> FLINT_AXE = REGISTRY.register("flint_axe", () -> new FlintAxeItem());
	public static final RegistryObject<Item> FLINT_PICKAXE = REGISTRY.register("flint_pickaxe", () -> new FlintPickaxeItem());
	public static final RegistryObject<Item> FLINT_SWORD = REGISTRY.register("flint_sword", () -> new FlintSwordItem());
	public static final RegistryObject<Item> FLINT_SHOVEL = REGISTRY.register("flint_shovel", () -> new FlintShovelItem());
	public static final RegistryObject<Item> FLINT_HOE = REGISTRY.register("flint_hoe", () -> new FlintHoeItem());
	public static final RegistryObject<Item> WATER_SOURCE_BLOCK = block(TaskgohachisModAOneModBlocks.WATER_SOURCE_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.taskgohachi.aone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.taskgohachi.aone.TaskgohachisModAOneMod;

public class TaskgohachisModAOneModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TaskgohachisModAOneMod.MODID);
	public static final RegistryObject<CreativeModeTab> TASK_58S_MOD_A_1 = REGISTRY.register("task_58s_mod_a_1",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.taskgohachis_mod_a_one.task_58s_mod_a_1")).icon(() -> new ItemStack(TaskgohachisModAOneModItems.FLINT_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TaskgohachisModAOneModItems.FLINT_AXE.get());
				tabData.accept(TaskgohachisModAOneModItems.FLINT_PICKAXE.get());
				tabData.accept(TaskgohachisModAOneModItems.FLINT_SWORD.get());
				tabData.accept(TaskgohachisModAOneModItems.FLINT_SHOVEL.get());
				tabData.accept(TaskgohachisModAOneModItems.FLINT_HOE.get());
				tabData.accept(TaskgohachisModAOneModBlocks.WATER_SOURCE_BLOCK.get().asItem());
			})

					.build());
}

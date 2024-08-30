
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nemtom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.nemtom.EmeraldstuffMod;

public class EmeraldstuffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmeraldstuffMod.MODID);
	public static final RegistryObject<CreativeModeTab> EMERALDANIUMTAB = REGISTRY.register("emeraldaniumtab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.emeraldstuff.emeraldaniumtab")).icon(() -> new ItemStack(EmeraldstuffModBlocks.EMERALDANIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EmeraldstuffModItems.EMERALDANIUMITEM.get());
				tabData.accept(EmeraldstuffModBlocks.EMERALDANIUM.get().asItem());
			}).withSearchBar().build());
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package zensyncro.eu.mod.init;

import zensyncro.eu.mod.EmeraldstuffMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class EmeraldstuffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmeraldstuffMod.MODID);
	public static final RegistryObject<CreativeModeTab> EMERALDANIUMTAB = REGISTRY.register("emeraldaniumtab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.emeraldstuff.emeraldaniumtab")).icon(() -> new ItemStack(EmeraldstuffModBlocks.EMERALDANIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EmeraldstuffModItems.EMERALDANIUMITEM.get());
				tabData.accept(EmeraldstuffModBlocks.EMERALDANIUM.get().asItem());
				tabData.accept(EmeraldstuffModItems.EMERALDANIUM_PICK.get());
				tabData.accept(EmeraldstuffModItems.EMERALDANIUM_SW.get());
			}).withSearchBar().build());
}

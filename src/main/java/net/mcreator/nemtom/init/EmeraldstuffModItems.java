
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nemtom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.nemtom.item.EmeraldaniumitemItem;
import net.mcreator.nemtom.EmeraldstuffMod;

public class EmeraldstuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldstuffMod.MODID);
	public static final RegistryObject<Item> EMERALDANIUMITEM = REGISTRY.register("emeraldaniumitem", () -> new EmeraldaniumitemItem());
	public static final RegistryObject<Item> EMERALDANIUM = block(EmeraldstuffModBlocks.EMERALDANIUM);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

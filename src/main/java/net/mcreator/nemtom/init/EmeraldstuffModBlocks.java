
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nemtom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.nemtom.block.EmeraldaniumBlock;
import net.mcreator.nemtom.EmeraldstuffMod;

public class EmeraldstuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EmeraldstuffMod.MODID);
	public static final RegistryObject<Block> EMERALDANIUM = REGISTRY.register("emeraldanium", () -> new EmeraldaniumBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package zensyncro.eu.mod.init;

import zensyncro.eu.mod.block.OREBlock;
import zensyncro.eu.mod.block.NehezobsidianblockBlock;
import zensyncro.eu.mod.block.EmeraldaniumBlock;
import zensyncro.eu.mod.EmeraldstuffMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class EmeraldstuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EmeraldstuffMod.MODID);
	public static final RegistryObject<Block> EMERALDANIUM = REGISTRY.register("emeraldanium", () -> new EmeraldaniumBlock());
	public static final RegistryObject<Block> ORE = REGISTRY.register("ore", () -> new OREBlock());
	public static final RegistryObject<Block> NEHEZOBSIDIANBLOCK = REGISTRY.register("nehezobsidianblock", () -> new NehezobsidianblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

package zensyncro.eu.mod.procedures;

import net.minecraft.world.entity.Entity;

public class EmeraldaniumSwLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(8);
	}
}


package zensyncro.eu.mod.item;

import zensyncro.eu.mod.procedures.EmeraldaniumSwLivingEntityIsHitWithToolProcedure;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

public class EmeraldaniumSwItem extends SwordItem {
	public EmeraldaniumSwItem() {
		super(new Tier() {
			public int getUses() {
				return 7500;
			}

			public float getSpeed() {
				return 50f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 46f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		EmeraldaniumSwLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}

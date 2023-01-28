package github.plainsvillager.betterhardnesssystemforge.item;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

public class BedrockPickaxe extends PickaxeItem {
    public BedrockPickaxe(){
        super(new Tier() {
            @Override
            public int getUses() {
                return 114514;
            }

            @Override
            public float getSpeed() {
                return 16;
            }

            @Override
            public float getAttackDamageBonus() {
                return 1;
            }

            @Override
            public int getLevel() {
                return 4;
            }

            @Override
            public int getEnchantmentValue() {
                return 114;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return null;
            }
        }, -3, -3.2f, new Properties().stacksTo(64));
    }

    @Override
    public boolean mineBlock(ItemStack pStack, Level pLevel, BlockState pState, BlockPos pPos, LivingEntity pEntityLiving) {
        ObfuscationReflectionHelper.setPrivateValue(Block.class, Blocks.BEDROCK, BlockBehaviour.Properties.of(Material.STONE).strength(10.0f, 3600000.0F), "properties");
        return true;
    }
}

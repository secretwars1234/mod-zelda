
package net.mcreator.modzelda.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.modzelda.ModZeldaModElements;

@ModZeldaModElements.ModElement.Tag
public class LoldisqueItem extends ModZeldaModElements.ModElement {
	@ObjectHolder("mod_zelda:loldisque")
	public static final Item block = null;

	public LoldisqueItem(ModZeldaModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ModZeldaModElements.sounds.get(new ResourceLocation("mod_zelda:let_it_grow")), new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("loldisque");
		}
	}
}

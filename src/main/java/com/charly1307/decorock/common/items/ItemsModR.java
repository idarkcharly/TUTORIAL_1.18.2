package com.charly1307.decorock.common.items;

import com.charly1307.decorock.DecoRockM;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsModR {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DecoRockM.MOD_ID);

	public static final RegistryObject<Item> PRIMER_ITEM = ITEMS.register("primer_item",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)))));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}

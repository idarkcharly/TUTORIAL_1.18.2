package com.charly1307.decorock;

import java.util.stream.Collectors;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DecoRockM.MOD_ID)
public class DecoRockM {
	private static final Logger LOGGER = LogUtils.getLogger();
	public static final String MOD_ID = "decorock";

	public DecoRockM() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		eventBus.addListener(this::setup);
		eventBus.addListener(this::enqueueIMC);
		eventBus.addListener(this::processIMC);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		// some preinit code
		LOGGER.info("HELLO FROM PREINIT");
		LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
	}

	private void enqueueIMC(final InterModEnqueueEvent event) {
		// Some example code to dispatch IMC to another mod
		InterModComms.sendTo("examplemod", "helloworld", () -> {
			LOGGER.info("Hello world from the MDK");
			return "Hello world";
		});
	}

	private void processIMC(final InterModProcessEvent event) {
		// Some example code to receive and process InterModComms from other mods
		LOGGER.info("Got IMC {}",
				event.getIMCStream().map(m -> m.messageSupplier().get()).collect(Collectors.toList()));
	}

	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event) {
		// Do something when the server starts
		LOGGER.info("HELLO from server starting");
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
			// Register a new block here
			LOGGER.info("HELLO from Register Block");
		}
	}
}

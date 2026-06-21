package net.pinary_pi.coloredbricks;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.pinary_pi.coloredbricks.data.ModBlockTagsProvider;
import net.pinary_pi.coloredbricks.data.ModRecipesProvider;

public class ColoredBricksDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		ColoredBricks.LOGGER.info("Beginning coloredbricks data generation");
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		ColoredBricks.LOGGER.info("Creating block tags for coloredbricks");
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModRecipesProvider::new);
	}
}

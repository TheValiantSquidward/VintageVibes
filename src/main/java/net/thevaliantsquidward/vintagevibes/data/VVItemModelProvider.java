package net.thevaliantsquidward.vintagevibes.data;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

import java.util.Objects;

import static net.thevaliantsquidward.vintagevibes.registry.VVItems.*;

public class VVItemModelProvider extends ItemModelProvider {

    public VVItemModelProvider(GatherDataEvent event) {
        super(event.getGenerator().getPackOutput(), VintageVibes.MOD_ID, event.getExistingFileHelper());
    }

    @Override
    protected void registerModels() {
        item(CELESTIAL_MASK);
        item(DEITY_MASK);
        item(FESTIVE_MASK);
        item(FROND_MASK);
        item(MONSOON_MASK);
        item(PETRIFIED_MASK);
        item(SPIRIT_MASK);
        item(SUNRISE_MASK);
        item(TIDAL_MASK);
        item(VOLCANIC_MASK);

        item(AMBERIZED_CRITTER);
        item(ANTIQUE_KEY);
        item(BEJEWELED_BROOCH);
        item(CHIPPED_RING);
        item(CITRINE_DIAMOND);
        item(COPPER_APPLE);
        item(CORAL_BEADS);
        item(CROWNED_INSECT);
        item(ENCHANTED_TOME);
        item(GLIMMERING_SKULL);
        item(GOLDEN_HEAD);
        item(LUXURIOUS_BOWL);
        item(MERCHANTS_AMULET);
        handheldItem(OBSIDIAN_BLADE);
        handheldItem(OBSIDIAN_TOOL);
        item(OCEANIC_PENDANT);
        item(ONYX_FIGURINE);
        item(RUSTED_SPEARHEAD);
        item(SHATTERED_DAGGER);
        item(SIRENS_PEARL);
        item(TONGUE_STONE);
        item(ANCIENT_FIGURINE);
        item(BLOSSOM_NECKLACE);
        item(CROWNED_JEWEL);
        item(CRYSTAL_EYE);
        item(ELONGATED_SKULL);
        item(EMBEDDED_FOSSIL);
        item(ENDER_AMULET);
        item(EYE_RING);
        item(GOLDEN_SYMBOL);
        item(METAL_COIN);
        item(MUD_TOTEM);
        item(OBSIDIAN_MASK);
        item(ODD_COIN);
        item(OLD_TOKEN);
        item(PEARLESCENT_FACE);
        item(PRICELESS_COIN);
        item(RELUCENT_GRAIL);
        item(RUBY_SLIPPERS);
        item(SPLIT_MASK);
        item(WEATHERED_COIN);
        item(WHIMSICAL_BUNDLE);
        item(BRITTLE_VASE);
        item(COMEDY_MASK);
        item(CREATURE_MASK);
        item(CRYSTALLIZED_SHELL);
        item(DELICATE_BOWL);
        item(DUSTY_SPHINX);
        item(FOOLS_FOSSIL);
        item(FRAGILE_POT);
        item(LUXURIOUS_MASONRY);
        item(JADE_FIGURINE);
        item(ODD_STONE);
        handheldItem(OSSEOUS_AXE);
        handheldItem(OSSEOUS_PICKAXE);
        handheldItem(OSSEOUS_SWORD);
        handheldItem(OSSEOUS_SHOVEL);
        item(RUSTIC_MASK);
        item(AQUA_PORCELAIN);
        item(CUT_TULMARINE);
        item(FACETED_AMETRINE);
        item(MARBLE_CROSS);
        item(OLIVE_PORCELAIN);
        item(POCKET_MIRROR);
        item(SILVER_PORCELAIN);

        // spawn eggs
        for (Item item : BuiltInRegistries.ITEM) {
            if (item instanceof SpawnEggItem && Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item)).getNamespace().equals(VintageVibes.MOD_ID)) {
                getBuilder(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item)).getPath()).parent(getExistingFile(new ResourceLocation("item/template_spawn_egg")));
            }
        }
    }

    // item
    private ItemModelBuilder item(RegistryObject<Item> item) {
        return generated(item.getId().getPath(), modLoc("item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return handheld(item.getId().getPath(), modLoc("item/" + item.getId().getPath()));
    }

    // utils
    private ItemModelBuilder generated(String name, ResourceLocation... layers) {
        ItemModelBuilder builder = withExistingParent(name, "item/generated");
        for (int i = 0; i < layers.length; i++) {
            builder = builder.texture("layer" + i, layers[i]);
        }
        return builder;
    }

    private ItemModelBuilder handheld(String name, ResourceLocation... layers) {
        ItemModelBuilder builder = withExistingParent(name, "item/handheld");
        for (int i = 0; i < layers.length; i++) {
            builder = builder.texture("layer" + i, layers[i]);
        }
        return builder;
    }
}

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
        this.item(GRAPEFRUIT);
        this.item(LEMON);
        this.item(LIME);
        this.item(MANGO);
        this.item(ORANGE);

        this.item(PINEAPPLE_SLICE);
        this.item(PINEAPPLE_CHUNKS);
        this.item(PINEAPPLE_SEEDS);

        this.item(CELESTIAL_MASK);
        this.item(DEITY_MASK);
        this.item(FESTIVE_MASK);
        this.item(FROND_MASK);
        this.item(MONSOON_MASK);
        this.item(PETRIFIED_MASK);
        this.item(SPIRIT_MASK);
        this.item(SUNRISE_MASK);
        this.item(TIDAL_MASK);
        this.item(VOLCANIC_MASK);

        this.item(AMBERIZED_CRITTER);
        this.item(ANTIQUE_KEY);
        this.item(BEJEWELED_BROOCH);
        this.item(CHIPPED_RING);
        this.item(CITRINE_DIAMOND);
        this.item(COPPER_APPLE);
        this.item(CORAL_BEADS);
        this.item(CROWNED_INSECT);
        this.item(ENCHANTED_TOME);
        this.item(GLIMMERING_SKULL);
        this.item(LUXURIOUS_BOWL);
        this.item(MERCHANTS_AMULET);
        this.handheldItem(OBSIDIAN_BLADE);
        this.handheldItem(OBSIDIAN_TOOL);
        this.item(OCEANIC_PENDANT);
        this.item(ONYX_FIGURINE);
        this.item(RUSTED_SPEARHEAD);
        this.item(SHATTERED_DAGGER);
        this.item(SIRENS_PEARL);
        this.item(TONGUE_STONE);
        this.item(ANCIENT_FIGURINE);
        this.item(BLOSSOM_NECKLACE);
        this.item(CROWNED_JEWEL);
        this.item(CRYSTAL_EYE);
        this.item(EMBEDDED_FOSSIL);
        this.item(ENDER_AMULET);
        this.item(EYE_RING);
        this.item(GOLDEN_SYMBOL);
        this.item(METAL_COIN);
        this.item(MUD_TOTEM);
        this.item(OBSIDIAN_MASK);
        this.item(ODD_COIN);
        this.item(OLD_TOKEN);
        this.item(PEARLESCENT_FACE);
        this.item(PRICELESS_COIN);
        this.item(RELUCENT_GRAIL);
        this.item(RUBY_SLIPPERS);
        this.item(SPLIT_MASK);
        this.item(WEATHERED_COIN);
        this.item(WHIMSICAL_BUNDLE);
        this.item(BRITTLE_VASE);
        this.item(COMEDY_MASK);
        this.item(CREATURE_MASK);
        this.item(CRYSTALLIZED_SHELL);
        this.item(DELICATE_BOWL);
        this.item(DUSTY_SPHINX);
        this.item(FOOLS_FOSSIL);
        this.item(FRAGILE_POT);
        this.item(LUXURIOUS_MASONRY);
        this.item(JADE_FIGURINE);
        this.item(ODD_STONE);
        this.handheldItem(OSSEOUS_AXE);
        this.handheldItem(OSSEOUS_PICKAXE);
        this.handheldItem(OSSEOUS_SWORD);
        this.handheldItem(OSSEOUS_SHOVEL);
        this.item(RUSTIC_MASK);
        this.item(AQUA_PORCELAIN);
        this.item(CUT_TULMARINE);
        this.item(FACETED_AMETRINE);
        this.item(MARBLE_CROSS);
        this.item(OLIVE_PORCELAIN);
        this.item(POCKET_MIRROR);
        this.item(SILVER_PORCELAIN);

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

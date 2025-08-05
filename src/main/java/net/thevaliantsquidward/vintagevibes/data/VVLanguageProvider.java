package net.thevaliantsquidward.vintagevibes.data;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.registry.VVBlocks;
import net.thevaliantsquidward.vintagevibes.registry.VVEntities;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;
import net.thevaliantsquidward.vintagevibes.VintageVibesTab;
import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.Logger;

import java.util.Objects;
import java.util.function.Supplier;

import static net.thevaliantsquidward.vintagevibes.registry.VVBlocks.*;
import static net.thevaliantsquidward.vintagevibes.registry.VVItems.*;

public class VVLanguageProvider extends LanguageProvider {

    public VVLanguageProvider(GatherDataEvent event) {
        super(event.getGenerator().getPackOutput(), VintageVibes.MOD_ID, "en_us");
    }

    private static final Logger LOGGER = LogUtils.getLogger();

    @Override
    protected void addTranslations() {

        // creative tab
        creativeTab(VintageVibesTab.VINTAGE_VIBES_TAB.get(), "Vintage Vibes");

        // blocks
        VVBlocks.AUTO_TRANSLATE.forEach(this::forBlock);

        // items
        VVItems.AUTO_TRANSLATE.forEach(this::forItem);
        add("entity.vintagevibes.butterfly.variant_monarch", "Monarch");
        add("entity.vintagevibes.butterfly.variant_blue_banded_swallowtail", "Blue Banded Swallowtail");
        add("entity.vintagevibes.butterfly.variant_blue_morpho", "Blue Morpho");
        add("entity.vintagevibes.butterfly.variant_cabbage", "Cabbage");
        add("entity.vintagevibes.butterfly.variant_clouded_yellow", "Clouded Yellow");
        add("entity.vintagevibes.butterfly.variant_glasswing", "Glasswing");
        add("entity.vintagevibes.butterfly.variant_malachite", "Malachite");
        add("entity.vintagevibes.butterfly.variant_mexican_shoemaker", "Mexican Shoemaker");
        add("entity.vintagevibes.butterfly.variant_mourning_cloak", "Mourning Cloak");
        add("entity.vintagevibes.butterfly.variant_purple_emperor", "Purple Emperor");
        add("entity.vintagevibes.butterfly.variant_gulf_fritillary", "Gulf Fritillary");
        add("entity.vintagevibes.butterfly.variant_tiger_swallowtail", "Tiger Swallowtail");
        add("entity.vintagevibes.butterfly.variant_zebra", "Zebra");
        add("entity.vintagevibes.butterfly.variant_common_blue", "Common Blue");
        add("entity.vintagevibes.butterfly.variant_atala", "Atala");
        add("entity.vintagevibes.butterfly.variant_red_admiral", "Red Admiral");
        add("entity.vintagevibes.butterfly.variant_queen_alexandra_birdwing", "Queen Alexandra's Birdwing");

        this.forEntity(VVEntities.BUTTERFLY);

        addItem(BUTTERFLY_BOTTLE, "Bottle of Butterfly");

        // untranslated blocks
        addBlock(AMBER_STAND, "Amber Crystal Stand");
        addBlock(AQUAMARINE_STAND, "Aquamarine Crystal Stand");
        addBlock(ENSTATITE_STAND, "Enstatite Crystal Stand");
        addBlock(GARNET_STAND, "Garnet Crystal Stand");
        addBlock(JADE_STAND, "Jade Crystal Stand");
        addBlock(KUNZITE_STAND, "Kunzite Crystal Stand");
        addBlock(LARIMAR_STAND, "Larimar Crystal Stand");
        addBlock(MILKY_QUARTZ_STAND, "Milky Quartz Crystal Stand");
        addBlock(MOONSTONE_STAND, "Moonstone Crystal Stand");
        addBlock(ONYX_STAND, "Onyx Crystal Stand");
        addBlock(PERIDOT_STAND, "Peridot Crystal Stand");
        addBlock(ROSE_QUARTZ_STAND, "Rose Quartz Crystal Stand");
        addBlock(SAPPHIRE_STAND, "Sapphire Crystal Stand");
        addBlock(SMOKY_QUARTZ_STAND, "Smoky Quartz Crystal Stand");
        addBlock(TAAFFEITE_STAND, "Taaffeite Crystal Stand");
        addBlock(TOPAZ_STAND, "Topaz Crystal Stand");
        addBlock(AMETHYST_STAND, "Amethyst Crystal Stand");
        addBlock(DIAMOND_STAND, "Diamond Crystal Stand");
        addBlock(EMERALD_STAND, "Emerald Crystal Stand");
        addBlock(QUARTZ_STAND, "Quartz Crystal Stand");

        addBlock(AMBER_BLOCK, "Block of Amber");
        addBlock(AQUAMARINE_BLOCK, "Block of Aquamarine");
        addBlock(ENSTATITE_BLOCK, "Block of Enstatite");
        addBlock(GARNET_BLOCK, "Block of Garnet");
        addBlock(JADE_BLOCK, "Block of Jade");
        addBlock(KUNZITE_BLOCK, "Block of Kunzite");
        addBlock(LARIMAR_BLOCK, "Block of Larimar");
        addBlock(MILKY_QUARTZ_BLOCK, "Block of Milky Quartz");
        addBlock(MOONSTONE_BLOCK, "Block of Moonstone");
        addBlock(ONYX_BLOCK, "Block of Onyx");
        addBlock(PERIDOT_BLOCK, "Block of Peridot");
        addBlock(ROSE_QUARTZ_BLOCK, "Block of Rose Quartz");
        addBlock(SAPPHIRE_BLOCK, "Block of Sapphire");
        addBlock(SMOKY_QUARTZ_BLOCK, "Block of Smoky Quartz");
        addBlock(TAAFFEITE_BLOCK, "Block of Taaffeite");
        addBlock(TOPAZ_BLOCK, "Block of Topaz");

        addBlock(CARVED_SANDSTONE_CONCERNED, "Carved Sandstone");
        addBlock(CARVED_SANDSTONE_DISAPPOINTED, "Carved Sandstone");
        addBlock(CARVED_SANDSTONE_FISHEYE, "Carved Sandstone");
        addBlock(CARVED_SANDSTONE_GRIN, "Carved Sandstone");
        addBlock(CARVED_SANDSTONE_JOYOUS, "Carved Sandstone");
        addBlock(CARVED_SANDSTONE_LAZYBONES, "Carved Sandstone");
        addBlock(CARVED_SANDSTONE_NOSE, "Carved Sandstone");
        addBlock(CARVED_SANDSTONE_OPEN, "Carved Sandstone");
        addBlock(CARVED_SANDSTONE_SPIRAL, "Carved Sandstone");

        addBlock(RED_CARVED_SANDSTONE_BOLD_AND_BRASH, "Red Carved Sandstone");
        addBlock(RED_CARVED_SANDSTONE_CLOSED, "Red Carved Sandstone");
        addBlock(RED_CARVED_SANDSTONE_EXCITED, "Red Carved Sandstone");
        addBlock(RED_CARVED_SANDSTONE_FROWN, "Red Carved Sandstone");
        addBlock(RED_CARVED_SANDSTONE_HAPPY, "Red Carved Sandstone");
        addBlock(RED_CARVED_SANDSTONE_LIPS, "Red Carved Sandstone");
        addBlock(RED_CARVED_SANDSTONE_SAD, "Red Carved Sandstone");
        addBlock(RED_CARVED_SANDSTONE_TOUCH, "Red Carved Sandstone");
        addBlock(RED_CARVED_SANDSTONE_MESSAGE, "Red Carved Sandstone");

        addBlock(AMPHORA_BLANK, "Amphora");
        addBlock(AMPHORA_MEDUSA, "Amphora");
        addBlock(AMPHORA_CHIMERA, "Amphora");
        addBlock(AMPHORA_SIREN, "Amphora");
        addBlock(AMPHORA_SERPENT, "Amphora");
        addBlock(AMPHORA_RIDGES, "Amphora");
        addBlock(AMPHORA_STRIPED, "Amphora");
        addBlock(AMPHORA_TIDES, "Amphora");
        addBlock(AMPHORA_WAVY, "Amphora");
        addBlock(AMPHORA_ZIGZAG, "Amphora");
        addBlock(AMPHORA_SEGMENTED, "Amphora");
        addBlock(AMPHORA_SPROUTS, "Amphora");
        addBlock(AMPHORA_PEGASUS, "Amphora");
        addBlock(AMPHORA_HARPY, "Amphora");

        add("block.vintagevibes.amphora_blank.desc", "Blank");
        add("block.vintagevibes.amphora_medusa.desc", "Medusa");
        add("block.vintagevibes.amphora_chimera.desc", "Chimera");
        add("block.vintagevibes.amphora_siren.desc", "Siren");
        add("block.vintagevibes.amphora_serpent.desc", "Serpent");
        add("block.vintagevibes.amphora_ridges.desc", "Ridges");
        add("block.vintagevibes.amphora_striped.desc", "Striped");
        add("block.vintagevibes.amphora_tides.desc", "Tides");
        add("block.vintagevibes.amphora_wavy.desc", "Wavy");
        add("block.vintagevibes.amphora_zigzag.desc", "Zigzag");
        add("block.vintagevibes.amphora_segmented.desc", "Segmented");
        add("block.vintagevibes.amphora_sprouts.desc", "Sprouts");
        add("block.vintagevibes.amphora_pegasus.desc", "Pegasus");
        add("block.vintagevibes.amphora_harpy.desc", "Harpy");


        add("block.vintagevibes.carved_sandstone_concerned.desc", "Concerned");
        add("block.vintagevibes.carved_sandstone_disappointed.desc", "Disappointed");
        add("block.vintagevibes.carved_sandstone_fisheye.desc", "Fisheye");
        add("block.vintagevibes.carved_sandstone_grin.desc", "Grin");
        add("block.vintagevibes.carved_sandstone_joyous.desc", "Joyous");
        add("block.vintagevibes.carved_sandstone_lazybones.desc", "Lazybones");
        add("block.vintagevibes.carved_sandstone_nose.desc", "Nose");
        add("block.vintagevibes.carved_sandstone_open.desc", "Open");
        add("block.vintagevibes.carved_sandstone_spiral.desc", "Spiral");

        add("block.vintagevibes.red_carved_sandstone_bold_and_brash.desc", "Bold and Brash");
        add("block.vintagevibes.red_carved_sandstone_closed.desc", "Closed");
        add("block.vintagevibes.red_carved_sandstone_excited.desc", "Excited");
        add("block.vintagevibes.red_carved_sandstone_frown.desc", "Frown");
        add("block.vintagevibes.red_carved_sandstone_happy.desc", "Happy");
        add("block.vintagevibes.red_carved_sandstone_lips.desc", "Lips");
        add("block.vintagevibes.red_carved_sandstone_sad.desc", "Sad");
        add("block.vintagevibes.red_carved_sandstone_touch.desc", "Touch");
        add("block.vintagevibes.red_carved_sandstone_message.desc", "Message");

        addItem(SIRENS_PEARL, "Siren's Pearl");
        addItem(MERCHANTS_AMULET, "Merchant's Amulet");

        add("item.vintagevibes.bejeweled_brooch.desc", "Contains an intricate mechanism that allows the wings to flap. Engraved on the back are the initials N.A.");
        add("item.vintagevibes.onyx_figurine.desc", "An ominous aura exudes from this figurine. It appears to be shaped like some kind of animal.");
        add("item.vintagevibes.golden_head.desc", "A priceless treasure, depicting a deity worshipped in ancient times. Contrary to popular belief, it is much heavier than a bag of sand.");
        add("item.vintagevibes.crowned_insect.desc", "This scarab seal once belonged to a mysterious pharaoh from a long forgotten desert kingdom. The meaning of the symbols on the back have long been lost to time.");
        add("item.vintagevibes.sirens_pearl.desc", "A pearl, said to have been harvested from a siren’s chest cavity. If you hold it up to your ear, you can hear distant music.");
        add("item.vintagevibes.enchanted_tome.desc", "An ancient tome of wizardry and dark magicks. Also contains a spectacular recipe for cherry pie!");
        add("item.vintagevibes.tongue_stone.desc", "A fossilized tooth of some massive aquatic creature. Slightly resembles a tongue.");
        add("item.vintagevibes.copper_apple.desc", "A highly abnormal apple, coated in waxed copper. Consumption is not advised.");
        add("item.vintagevibes.antique_key.desc", "A forgotten key to a forgotten lock. The head is shaped like three intersecting spheres… or maybe it’s a flower?");
        add("item.vintagevibes.chipped_ring.desc", "A priceless ring worn by nobles as a token of wealth. Worn down and broken from years in the elements.");
        add("item.vintagevibes.coral_beads.desc", "Colorful beads from an island nation long since swallowed by the sea. The necklace is much lighter than it seems, due to the beads being hollow.");
        add("item.vintagevibes.glimmering_skull.desc", "This artifact was carved from many varieties of sparkling quartz. When sunlight hits the skull, rainbow light is scattered everywhere.");
        add("item.vintagevibes.luxurious_bowl.desc", "A rare bowl made of lapis and gold, once used in religious rites. Its surface is smooth and cracked.");
        add("item.vintagevibes.merchants_amulet.desc", "Used as a seal by ancient merchants to recognize their fellow tradesmen. It has been said to bring good luck.");
        add("item.vintagevibes.obsidian_blade.desc", "An unbreakable blade, used in times of war long gone. Said to be one of a set of two.");
        add("item.vintagevibes.obsidian_tool.desc", "An unbreakable tool, used to harvest resources in a long forgotten nation. Said to be one of a set of two.");
        add("item.vintagevibes.oceanic_pendant.desc", "Said to contain the will of an ancient fish god. When you wear it and close your eyes, you can hear the ocean.");
        add("item.vintagevibes.rusted_spearhead.desc", "This spearhead is so old that it could easily be mistaken for a simple pebble. Despite its venerable age, it is still sharp enough to cut your hand.");
        add("item.vintagevibes.shattered_dagger.desc", "This terrible dagger was used in ancient blood sacrifices. Looking at the runes inscribed on the handle sends shivers down your spine");
        add("item.vintagevibes.amberized_critter.desc", "A large ant, frozen in amber. Its tiny face is frozen in a state of confusion.");
        //add("item.vintagevibes.amberized_critter.desc", "");

        this.addAdvancement("root", "Vintage Vibes");
        this.addAdvancementDesc("root", "Utilize new vintage themed decor and more");

        this.addAdvancement("pineapple_slice", "I've Heard It Both Ways");
        this.addAdvancementDesc("pineapple_slice", "Obtain a Pineapple Slice");

        this.addAdvancement("all_masks", "Ring of Fire");
        this.addAdvancementDesc("all_masks", "Obtain every Mask");

        this.addAdvancement("all_gems", "All that Glitters");
        this.addAdvancementDesc("all_gems", "Obtain every Gem from Bejeweled Ore");

        this.addAdvancement("bottle_butterfly", "Metamorphosis");
        this.addAdvancementDesc("bottle_butterfly", "Bottle a Butterfly");

        // untranslated items
        musicDisc(VIBE_DISC, "TheValiantSquidward - vibe");
    }

    private void forBlock(Supplier<? extends Block> block) {
        addBlock(block, VVTextUtils.createTranslation(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block.get())).getPath()));
    }

    private void forItem(Supplier<? extends Item> item) {
        addItem(item, VVTextUtils.createTranslation(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item.get())).getPath()));
    }

    private void forEntity(Supplier<? extends EntityType<?>> entity) {
        addEntityType(entity, VVTextUtils.createTranslation(Objects.requireNonNull(ForgeRegistries.ENTITY_TYPES.getKey(entity.get())).getPath()));
    }

    private String format(ResourceLocation registryName) {
        return WordUtils.capitalizeFully(registryName.getPath().replace("_", " "));
    }

    protected void painting(String name, String author) {
        add("painting." + VintageVibes.MOD_ID + "." + name + ".title",  VVTextUtils.createTranslation(name));
        add("painting." + VintageVibes.MOD_ID + "." + name + ".author",  author);
    }

    protected void musicDisc(Supplier<? extends Item> item, String description) {
        String disc = item.get().getDescriptionId();
        add(disc, "Music Disc");
        add(disc + ".desc", description);
    }

    public void addAdvancement(String key, String name) {
        this.add("advancement." + VintageVibes.MOD_ID + "." + key, name);
    }

    public void addAdvancementDesc(String key, String name) {
        this.add("advancement." + VintageVibes.MOD_ID + "." + key + ".desc", name);
    }

    public void creativeTab(CreativeModeTab key, String name){
        add(key.getDisplayName().getString(), name);
    }
}

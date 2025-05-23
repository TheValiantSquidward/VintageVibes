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
import net.thevaliantsquidward.vintagevibes.block.VVBlocks;
import net.thevaliantsquidward.vintagevibes.item.VVItems;
import net.thevaliantsquidward.vintagevibes.tab.VVCreativeTabs;
import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.Logger;

import java.util.Objects;
import java.util.function.Supplier;

import static net.thevaliantsquidward.vintagevibes.block.VVBlocks.*;
import static net.thevaliantsquidward.vintagevibes.item.VVItems.*;

public class VVLangProvider extends LanguageProvider {

    public VVLangProvider(GatherDataEvent event) {
        super(event.getGenerator().getPackOutput(), VintageVibes.MOD_ID, "en_us");
    }

    private static final Logger LOGGER = LogUtils.getLogger();

    @Override
    protected void addTranslations() {

        // creative tab
        creativeTab(VVCreativeTabs.VINTAGE_VIBES_TAB.get(), "Vintage Vibes");

        // blocks
        VVBlocks.AUTO_TRANSLATE.forEach(this::forBlock);

        // items
        VVItems.AUTO_TRANSLATE.forEach(this::forItem);

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

        addBlock(ROUGH_AMBER_BLOCK, "Block of Rough Amber");
        addBlock(ROUGH_AQUAMARINE_BLOCK, "Block of Rough Aquamarine");
        addBlock(ROUGH_ENSTATITE_BLOCK, "Block of Rough Enstatite");
        addBlock(ROUGH_GARNET_BLOCK, "Block of Rough Garnet");
        addBlock(ROUGH_JADE_BLOCK, "Block of Rough Jade");
        addBlock(ROUGH_KUNZITE_BLOCK, "Block of Rough Kunzite");
        addBlock(ROUGH_LARIMAR_BLOCK, "Block of Rough Larimar");
        addBlock(ROUGH_MILKY_QUARTZ_BLOCK, "Block of Rough Milky Quartz");
        addBlock(ROUGH_MOONSTONE_BLOCK, "Block of Rough Moonstone");
        addBlock(ROUGH_ONYX_BLOCK, "Block of Rough Onyx");
        addBlock(ROUGH_PERIDOT_BLOCK, "Block of Rough Peridot");
        addBlock(ROUGH_ROSE_QUARTZ_BLOCK, "Block of Rough Rose Quartz");
        addBlock(ROUGH_SAPPHIRE_BLOCK, "Block of Rough Sapphire");
        addBlock(ROUGH_SMOKY_QUARTZ_BLOCK, "Block of Rough Smoky Quartz");
        addBlock(ROUGH_TAAFFEITE_BLOCK, "Block of Rough Taaffeite");
        addBlock(ROUGH_TOPAZ_BLOCK, "Block of Rough Topaz");

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

    public void creativeTab(CreativeModeTab key, String name){
        add(key.getDisplayName().getString(), name);
    }
}

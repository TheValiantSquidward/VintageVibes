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
import net.thevaliantsquidward.vintagevibes.tab.VVCreativeTabs;
import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.Logger;

import java.util.Objects;
import java.util.function.Supplier;

import static net.thevaliantsquidward.vintagevibes.block.VVBlocks.*;

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

//        // items
//        VVItems.AUTO_TRANSLATE.forEach(this::forItem);

        // untranslated blocks
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

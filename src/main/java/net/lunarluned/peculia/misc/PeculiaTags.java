package net.lunarluned.peculia.misc;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Instrument;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class PeculiaTags {

    public static final TagKey<Item> ALERTING_ITEMS = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("peculia", "alerting_items"));
    public static final TagKey<Instrument> HOG_HORNS = TagKey.create(Registry.INSTRUMENT_REGISTRY, new ResourceLocation("peculia", "hog_horns"));
    public static final TagKey<EntityType<?>> BANISHABLE_MOBS = TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("peculia", "banishable_mobs"));
    public static final TagKey<EntityType<?>> TITAN_BLOOD_WALKABLE_MOBS = TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("peculia", "titan_blood_walkable_mobs"));
    public static final TagKey<EntityType<?>> GHOST_CANNOT_ATTACK = TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("peculia", "ghost_cannot_attack"));
    public static final TagKey<EntityType<?>> MOLDS_CANNOT_ATTACK = TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("peculia", "molds_cannot_attack"));
    public static final TagKey<EntityType<?>> CANNOT_BREAK_CRUMBLING_BLOCKS = TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("peculia", "cannot_break_crumbling_blocks"));
    public static final TagKey<Block> GRIM_WOOD_LOGS = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("peculia", "grim_wood_logs"));
    public static final TagKey<Item> GRIM_WOOD_LOGS_ITEM = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation("peculia", "grim_wood_logs"));
    public static final TagKey<Block> GHOST_SPAWNABLE_ON = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("peculia", "ghost_spawnable_on"));
    public static final TagKey<Block> WISP_SPAWNABLE_ON = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("peculia", "wisp_spawnable_on"));
}

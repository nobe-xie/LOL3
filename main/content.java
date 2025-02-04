package com.example;

import mindustry.mod.Mod;
import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;

public class MyMod extends Mod {
    public static Block myBlock;

    @Override
    public void loadContent() {
        myBlock = new GenericCrafter("my-block") {{
            requirements(ItemStack.with(Items.copper, 10));
            outputItem = new ItemStack(Items.graphite, 1);
            craftTime = 60f;
            size = 2;
            health = 200;
            // 加载纹理
            region = Core.atlas.find("my-mod-my-block");
        }};
    }
}

package com.narxoz.rpg.enemy.prototype;

import com.narxoz.rpg.enemy.Enemy;

import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {
    private Map<String, Enemy> templates = new HashMap<>();

    public void registerTemplate(String key, Enemy template) {
        templates.put(key, template);
    }

    public Enemy createFromTemplate(String key) {
        Enemy template = templates.get(key);
        if (template == null) return null;
        return template.clone();
    }

    public void listTemplates() {
        System.out.println("Registered Enemy Templates: " + templates.keySet());
    }
}

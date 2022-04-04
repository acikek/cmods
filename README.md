# Combined Modifiers

Combines NBT and hard-coded attribute modifiers

## About

[Attribute modifiers](https://minecraft.fandom.com/wiki/Attribute#Modifiers) for items come in two flavors: NBT and hard-coded. NBT modifiers can be applied through an `AttributeModifiers` key on-the-fly, while hard-coded modifiers are static for an `Item` instance.

By default, **these modifiers don't mix** - the NBT modifiers override the others. For example, a diamond sword with `generic.attack_damage` +5 would only have that five attack damage and lose the base modifier.

This mod fixes this small issue. It's not really a "bug," more of a bad feature.

## License

MIT © 2022 Skye P.

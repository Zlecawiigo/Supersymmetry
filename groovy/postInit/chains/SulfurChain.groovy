import static globals.Globals.*

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;

def ROASTER_RECIPES = recipemap('roaster');

ROASTER_RECIPES.recipeBuilder()
.inputs(metaitem('dustPyrite') * 2)
.outputs(metaitem('dustIronIiiSulfate'))
.outputs(metaitem('dustSulfur'))
.duration(320)
.EUt(7)
.buildAndRegister()

ROASTER_RECIPES.recipeBuilder()
.inputs(metaitem('dustIronIiiSulfate'))
.outputs(metaitem('dustBandedIron'))
.fluidOutputs(fluid('sulfur_trioxide') * 3000)
.duration(160)
.EUt(7)
.buildAndRegister()
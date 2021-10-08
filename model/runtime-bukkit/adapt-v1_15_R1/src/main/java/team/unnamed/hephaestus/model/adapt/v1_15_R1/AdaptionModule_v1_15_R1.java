package team.unnamed.hephaestus.model.adapt.v1_15_R1;

import team.unnamed.hephaestus.model.adapt.AdaptionModule;
import team.unnamed.hephaestus.model.view.ModelViewAnimator;
import team.unnamed.hephaestus.model.view.ModelViewRenderer;

@SuppressWarnings("unused") // most times instantiated via reflection
public class AdaptionModule_v1_15_R1 implements AdaptionModule {

    @Override
    public ModelViewRenderer createRenderer(ModelViewAnimator animator) {
        return new ModelViewRenderer_v1_15_R1(animator);
    }
}
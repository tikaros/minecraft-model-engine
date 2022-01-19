/*
 * This file is part of hephaestus-engine, licensed under the MIT license
 *
 * Copyright (c) 2021-2022 Unnamed Team
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package team.unnamed.hephaestus;

import org.jetbrains.annotations.Nullable;
import team.unnamed.hephaestus.struct.Vector3Float;

import java.util.Collection;
import java.util.Map;

/**
 * It's a model cube holder, a {@link ModelCube}
 * composite, util to make rotations over the pivot
 */
public class ModelBone {

    @Nullable private final ModelBone parent;
    private final String name;
    private final Vector3Float rotation;

    private final Map<String, ModelBone> bones;
    private final Vector3Float offset;

    private final boolean small;
    private final int customModelData;

    public ModelBone(
            @Nullable ModelBone parent,
            String name,
            Vector3Float rotation,
            Map<String, ModelBone> bones,
            Vector3Float offset,
            boolean small,
            int customModelData
    ) {
        this.parent = parent;
        this.name = name;
        this.rotation = rotation;
        this.bones = bones;
        this.offset = offset;
        this.small = small;
        this.customModelData = customModelData;
    }

    @Nullable
    public ModelBone getParent() {
        return parent;
    }

    public Vector3Float getOffset() {
        return offset;
    }

    public int getCustomModelData() {
        return customModelData;
    }

    public String getName() {
        return name;
    }

    public Vector3Float getRotation() {
        return rotation;
    }

    /**
     * Determines whether to use small armor stands
     * for this bone
     *
     * @return True to use small armor stands
     */
    public boolean isSmall() {
        return small;
    }

    public Collection<ModelBone> getBones() {
        return bones.values();
    }

    public Map<String, ModelBone> getBoneMap() {
        return bones;
    }

}
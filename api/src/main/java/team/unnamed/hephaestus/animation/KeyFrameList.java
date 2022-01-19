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
package team.unnamed.hephaestus.animation;

import org.jetbrains.annotations.NotNull;
import team.unnamed.hephaestus.struct.Vector3Float;

import java.util.Iterator;

/**
 * Data structure for holding and iterating {@link KeyFrame}
 * instances to perform model animations
 */
public interface KeyFrameList extends Iterable<KeyFrame> {

    /**
     * Adds the given {@code value} to the timeline in
     * the specified {@code tick} and {@code channel}
     */
    void put(int position, Channel channel, Vector3Float value);

    /**
     * Creates an iterator that iterates over
     * keyframes stored in this keyframe list.
     */
    @NotNull
    @Override
    Iterator<KeyFrame> iterator();

    enum Channel {
        POSITION,
        ROTATION,
        SCALE
    }

}
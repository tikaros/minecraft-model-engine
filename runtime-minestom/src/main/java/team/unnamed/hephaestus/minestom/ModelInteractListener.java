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
package team.unnamed.hephaestus.minestom;

import net.minestom.server.entity.Player;
import team.unnamed.hephaestus.view.ActionType;

/**
 * Represents the object responsible for handling
 * interactions between a {@link Player} and a
 * {@link ModelView}
 *
 * @since 1.0.0
 */
@FunctionalInterface
public interface ModelInteractListener {

    ModelInteractListener NOP = (view, player, action) -> {};

    /**
     * Method called to handle the interaction between
     * a {@link Player} and a {@link ModelView}
     *
     * @param view The clicked model view
     * @param player The clicker player
     * @param action The click type
     * @since 1.0.0
     */
    void onInteract(
            ModelView view,
            Player player,
            ActionType action
    );

}
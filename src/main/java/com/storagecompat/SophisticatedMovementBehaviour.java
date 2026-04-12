package com.storagecompat;

import com.simibubi.create.api.behaviour.movement.MovementBehaviour;

public class SophisticatedMovementBehaviour implements MovementBehaviour {
    @Override
    public boolean disableBlockEntityRendering() {
        return MovementBehaviour.super.disableBlockEntityRendering();
    }
}
package com.storagecompat;

import com.simibubi.create.api.behaviour.movement.MovementBehaviour;
import net.fabricmc.api.ModInitializer;
import net.p3pp3rf1y.sophisticatedstorage.init.ModBlocks; // <--- Ruta exacta de tu captura
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StorageCompat implements ModInitializer {
    public static final String MOD_ID = "itsyusei99-storage-create-compat";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("itsyusei99 iniciando el registro de comportamientos de movimiento...");

        try {
            // Registramos usando el bloque directo, sin el .get()
            MovementBehaviour.REGISTRY.register(ModBlocks.BARREL, new SophisticatedMovementBehaviour());
            MovementBehaviour.REGISTRY.register(ModBlocks.CHEST, new SophisticatedMovementBehaviour());

            // Si añades los barriles limitados, también van sin .get()
            // MovementBehaviour.REGISTRY.register(ModBlocks.LIMITED_BARREL_1, new SophisticatedMovementBehaviour());

            LOGGER.info("¡itsyusei99 ha hackeado el registro de Create con éxito!");
        } catch (Exception e) {
            LOGGER.error("Error en el registro de compatibilidad: " + e.getMessage());
        }
    }
}
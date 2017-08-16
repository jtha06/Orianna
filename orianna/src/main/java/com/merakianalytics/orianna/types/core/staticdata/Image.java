package com.merakianalytics.orianna.types.core.staticdata;

import java.awt.image.BufferedImage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMap;
import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.types.core.OriannaObject;

public class Image extends OriannaObject<com.merakianalytics.orianna.types.data.staticdata.Image> {
    private static final long serialVersionUID = -6752564052626945287L;
    private final Supplier<Sprite> sprite = Suppliers.memoize(new Supplier<Sprite>() {
        @Override
        public Sprite get() {
            return new Sprite(coreData.getSprite());
        }
    });

    public Image(final com.merakianalytics.orianna.types.data.staticdata.Image coreData) {
        super(coreData);
    }

    public BufferedImage get() {
        final BufferedImage image = Orianna.getSettings().getPipeline().get(BufferedImage.class, ImmutableMap.<String, Object> of("url", getURL()));
        return image;
    }

    public String getFull() {
        return coreData.getFull();
    }

    public String getGroup() {
        return coreData.getGroup();
    }

    public Sprite getSprite() {
        return sprite.get();
    }

    public String getURL() {
        return "http://ddragon.leagueoflegends.com/cdn/" + coreData.getVersion() + "/img/" + coreData.getGroup() + "/" + coreData.getFull();
    }
}

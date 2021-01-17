package com.gof.structural.adapter.twoways;

import com.gof.structural.adapter.object.ConnectorPort;
import com.gof.structural.adapter.object.RCAConnector;
import com.gof.structural.adapter.object.TV;

public class CathodeRayTube implements TV {

    private final String screenType;
    private final RCAConnector videoInput;
    private final String name;

    public CathodeRayTube(String screenType, RCAConnector videoInput, String name) {
        this.screenType = screenType;
        this.videoInput = videoInput;
        this.name = name;
    }

    @Override
    public String screenType() {
        return this.screenType;
    }

    @Override
    public ConnectorPort videoInput() {
        return videoInput;
    }

    @Override
    public String name() {
        return this.name;
    }


    public static final class CathodeRayTubeBuilder {
        private String screenType;
        private RCAConnector videoInput;
        private String name;

        private CathodeRayTubeBuilder() {
        }

        public static CathodeRayTubeBuilder aCathodeRayTube() {
            return new CathodeRayTubeBuilder();
        }

        public CathodeRayTubeBuilder withScreenType(String screenType) {
            this.screenType = screenType;
            return this;
        }

        public CathodeRayTubeBuilder withVideoInput(RCAConnector videoInput) {
            this.videoInput = videoInput;
            return this;
        }

        public CathodeRayTubeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CathodeRayTube build() {
            return new CathodeRayTube(screenType, videoInput, name);
        }
    }
}


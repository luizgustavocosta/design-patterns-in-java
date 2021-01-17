package com.gof.structural.adapter.object;

public class CathodeRayTube implements TV {

    private final RCAConnector videoInput;
    private final String name;

    public CathodeRayTube(RCAConnector videoInput, String name) {
        this.videoInput = videoInput;
        this.name = name;
    }

    @Override
    public String display() {
        return "CRT";
    }

    @Override
    public ConnectorPort getInput() {
        return videoInput;
    }

    @Override
    public String name() {
        return this.name;
    }


    public static final class CathodeRayTubeBuilder {
        private RCAConnector videoInput;
        private String name;

        private CathodeRayTubeBuilder() {
        }

        public static CathodeRayTubeBuilder aCathodeRayTube() {
            return new CathodeRayTubeBuilder();
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
            return new CathodeRayTube(videoInput, name);
        }
    }
}


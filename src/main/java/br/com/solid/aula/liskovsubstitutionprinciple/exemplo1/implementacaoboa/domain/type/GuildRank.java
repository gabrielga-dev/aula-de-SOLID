package br.com.solid.aula.liskovsubstitutionprinciple.exemplo1.implementacaoboa.domain.type;

public enum GuildRank {
    ROOKIE {
        @Override
        public GuildRank upperRank() {
            return SOLDIER;
        }
        @Override
        public GuildRank lowerRank() {
            return SOLDIER;
        }
    },
    SOLDIER {
        @Override
        public GuildRank upperRank() {
            return COMMANDER;
        }
        @Override
        public GuildRank lowerRank() {
            return ROOKIE;
        }
    },
    COMMANDER {
        @Override
        public GuildRank upperRank() {
            return OPERATOR;
        }
        @Override
        public GuildRank lowerRank() {
            return SOLDIER;
        }
    },
    OPERATOR {
        @Override
        public GuildRank upperRank() {
            return CAPITAIN;
        }
        @Override
        public GuildRank lowerRank() {
            return COMMANDER;
        }
    },
    CAPITAIN {
        @Override
        public GuildRank upperRank() {
            return WARBRINGER;
        }
        @Override
        public GuildRank lowerRank() {
            return OPERATOR;
        }
    },
    WARBRINGER {
        @Override
        public GuildRank upperRank() {
            return WARLORD;
        }
        @Override
        public GuildRank lowerRank() {
            return CAPITAIN;
        }
    },
    WARLORD {
        @Override
        public GuildRank upperRank() {
            return CHAMPION;
        }
        @Override
        public GuildRank lowerRank() {
            return WARBRINGER;
        }
    },
    CHAMPION {
        @Override
        public GuildRank upperRank() {
            return HELLRAISER;
        }
        @Override
        public GuildRank lowerRank() {
            return WARLORD;
        }
    },
    HELLRAISER {
        @Override
        public GuildRank upperRank() {
            return HELLRAISER;
        }
        @Override
        public GuildRank lowerRank() {
            return CHAMPION;
        }
    };

    public abstract GuildRank upperRank();
    public abstract GuildRank lowerRank();
}

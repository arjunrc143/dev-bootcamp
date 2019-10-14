package com.example.invoicegenerator.model;

public enum RideType {
    PREMIUM {
        private static final int MINIMUM_DISTANCE_FARE = 10;
        private static final int MINIMUM_DURATION_FARE = 1;
        private static final int MINIMUM_FARE = 5;
        public double fare(double distance, double duration) {
            double fare = distance * MINIMUM_DISTANCE_FARE + duration * MINIMUM_DURATION_FARE;
            if (fare < MINIMUM_FARE) return MINIMUM_FARE;
            return fare;
        }
    },
    NORMAL {
        private static final int MINIMUM_DISTANCE_FARE = 10;
        private static final int MINIMUM_DURATION_FARE = 1;
        private static final int MINIMUM_FARE = 5;
        public double fare(double distance, double duration) {
            double fare = distance * MINIMUM_DISTANCE_FARE + duration * MINIMUM_DURATION_FARE;
            if (fare < MINIMUM_FARE) return MINIMUM_FARE;
            return fare;
        }
    };

    public abstract double fare(double distance, double duration);
}

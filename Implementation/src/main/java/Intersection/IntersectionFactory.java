package Intersection;

import TrafficLights.TrafficLightFactory;

public enum IntersectionFactory {

    FourWayOneLane{
        @Override
        public Intersection getIntersection(TrafficLightFactory type, int greenPhaseDuration) {
            return new FourWayOneLaneIntersection(type, greenPhaseDuration);
        }
    };

    public abstract Intersection getIntersection(TrafficLightFactory type, int greenPhaseDuration);
}

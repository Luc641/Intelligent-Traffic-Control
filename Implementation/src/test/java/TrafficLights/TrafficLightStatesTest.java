package TrafficLights;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class TrafficLightStatesTest {
    @Mock
    Context context;


    @ParameterizedTest
    @CsvSource({
            "RED,RED_YELLOW",
            "RED_YELLOW,GREEN",
            "GREEN,YELLOW",
            "YELLOW,RED"
    })
    void testStateTransitionGerman(TrafficLightStatesGerman initial, TrafficLightStatesGerman expected) {
        initial.showSignalOnce(context);
        verify(context, times(1)).changeState(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "RED,GREEN",
            "GREEN,YELLOW",
            "YELLOW,RED"
    })
    void testStateTransitionDutch(TrafficLightStatesDutch initial, TrafficLightStatesDutch expected) {
        initial.showSignalOnce(context);
        verify(context, times(1)).changeState(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "RED,GREEN",
            "GREEN,GREEN_BLINKING",
            "GREEN_BLINKING,RED"
    })
    void testStateTransitionPedestrian(TrafficLightStatesPedestrian initial, TrafficLightStatesPedestrian expected) {
        initial.showSignalOnce(context);
        verify(context, times(1)).changeState(expected);
    }

}
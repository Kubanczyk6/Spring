package pl.zajavka.w14._3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {TestBeanConfiguration.class})
//@ContextConfiguration(classes = {BeanConfiguration.class})
class CapacityCalculationServiceImplTest {

    @Autowired
    private WidthCalculationService widthCalculationService;
    @Autowired
    private HeightCalculationService heightCalculationService;
    @Autowired
    private DepthCalculationService depthCalculationService;
    @Autowired
    private CapacityCalculationService capacityCalculationService;
    @BeforeEach
    public void setUp(){
        Assertions.assertNotNull(widthCalculationService);
        Assertions.assertNotNull(heightCalculationService);
        Assertions.assertNotNull(depthCalculationService);
        Assertions.assertNotNull(capacityCalculationService);
    }

    @Test
    void someCalculation() {
        // given
        InputData inputData = someInputData();
        Mockito.when(depthCalculationService.calculate(Mockito.any())).thenReturn(new BigDecimal("5"));
        Mockito.when(widthCalculationService.calculate(Mockito.any())).thenReturn(new BigDecimal("7"));

        //when
        BigDecimal result = capacityCalculationService.someCalculation(inputData);

        //then

        Assertions.assertEquals(new BigDecimal("105"),result);
    }

    private InputData someInputData(){
        return InputData.builder().
                width("1")
                .depth("2")
                .height("3")
                .build();
    }
}
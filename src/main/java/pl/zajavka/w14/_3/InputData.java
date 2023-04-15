package pl.zajavka.w14._3;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class InputData {

    String height;
    String width;
    String depth;
}

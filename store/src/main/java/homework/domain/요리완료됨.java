package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class 요리완료됨 extends AbstractEvent {

    private Long id;

    public 요리완료됨(){
        super();
    }
}

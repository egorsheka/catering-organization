package by.development.sheka.data.dto.menu;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class MenuDto {

    private String town;
    private List<String> cuisines;
    private LocalDateTime dateTime;
}

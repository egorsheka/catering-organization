package by.development.sheka.data.dto.menu;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class BookMenuDto {

    private String menuId;
    private int countOfGuests;
    private String addInfo;

}

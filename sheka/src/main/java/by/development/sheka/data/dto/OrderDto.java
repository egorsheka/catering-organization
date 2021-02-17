package by.development.sheka.data.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class OrderDto {

    private String clientId;
    private String menuId;
    private Integer guests;
    private LocalDateTime dateTime;
    private String address;
    private String phoneNumber;

}

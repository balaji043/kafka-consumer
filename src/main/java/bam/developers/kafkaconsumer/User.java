package bam.developers.kafkaconsumer;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class User {
    private String id;
    private String name;
    private Double salary;
}

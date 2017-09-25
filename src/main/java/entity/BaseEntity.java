package entity;

import lombok.Data;

import javax.persistence.*;

@Data //<-- Getters and setters automatic generation
@MappedSuperclass //<-- table wont be generated to the entity
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // automatic ascending id generation
    private Long id;

    @Version
    private int version;
}
